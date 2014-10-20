sealed abstract class Optioon[+A] {
  def isEmpty: Boolean = this match {
    case Noone => true
    case _ => false
  }
  def getOrElse[B >: A](b: => B): B = this match {
    case Noone => b
    case Soome(a) => a
  }
  def map[B](f: A => B): Optioon[B] = this match {
    case Noone => Noone
    case Soome(a) => Soome(f(a))
  }
  def flatMap[B](f: A => Optioon[B]): Optioon[B] = this match {
    case Noone => Noone
    case Soome(a) => f(a)
  }
  def withFilter(f: A => Boolean): Optioon[A] = this match {
    case Soome(a) if (f(a)) => this
    case _ => Noone
  }
  def ap[B](f: Optioon[A => B]): Optioon[B] = this match {
    case Noone => Noone
    case Soome(a) => f.map{ fun => fun(a) }
  }
  // or:
  // def ap[B](f: Optioon[A => B]): Optioon[B] = for ( a <- this; fun <- f ) yield fun(a)
  // def ap[B](f: Optioon[A => B]): Optioon[B] = for ( fun <- f; a <- this ) yield fun(a)
  // def ap[B](f: Optioon[A => B]): Optioon[B] = flatMap{ a => f.map{ fun => fun(a) } }
  // def ap[B](f: Optioon[A => B]): Optioon[B] = f.flatMap{ fun => map{ a => fun(a) } }
  def fold[B](b: => B, f: A => B):B = this match {
    case Noone => b
    case Soome(a) => f(a)
  }
  def isEmptyF: Boolean =
    fold(true, _ => false)
  def getOrElseF[B >: A](b: => B): B =
    fold(b, x => x)
  def mapF[B](f: A => B): Optioon[B] =
    fold(Noone, f andThen Soome.apply)
  def flatMapF[B](f: A => Optioon[B]): Optioon[B] =
    fold(Noone, f)
  def withFilterF(f: A => Boolean): Optioon[A] =
    fold(Noone, a => if (f(a)) Soome(a) else Noone)
  def apF[B](f: Optioon[A => B]): Optioon[B] =
    fold(Noone, a => f.map{ g => g(a) })
}
object Optioon {
  def lift2[A,B,C](ma: Optioon[A], mb: Optioon[B])(f: (A,B) => C): Optioon[C] =
    for {
      b <- mb
      a <- ma
    } yield f(a,b)
  // or:
  // def lift2[A,B,C](ma: Optioon[A], mb: Optioon[B])(f: (A,B) => C): Optioon[C] =
  //   mb.flatMap{ b => ma.map{ a => f(a,b) }}
  // def lift2[A,B,C](ma: Optioon[A], mb: Optioon[B])(f: (A,B) => C): Optioon[C] =
  //   mb.ap(ma.map(f.curried))
  def lift3[A,B,C,D](ma: Optioon[A], mb: Optioon[B], mc: Optioon[C])(f: (A,B,C) => D): Optioon[D] =
    for {
      c <- mc
      b <- mb
      a <- ma
    } yield f(a,b,c)
  // or:
  // def lift3[A,B,C,D](ma: Optioon[A], mb: Optioon[B], mc: Optioon[C])(f: (A,B,C) => D): Optioon[D] =
  //   mc.flatMap{ c => mb.flatMap{ b => ma.map{ a => f(a,b,c) }}}
  // def lift3[A,B,C,D](ma: Optioon[A], mb: Optioon[B], mc: Optioon[C])(f: (A,B,C) => D): Optioon[D] =
  //   mc.ap(mb.ap(ma.map(f.curried)))
}
case object Noone extends Optioon[Nothing]
case class Soome[A](a: A) extends Optioon[A]

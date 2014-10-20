abstract sealed class Liist[+A] {
  override def toString = this match {
    case Niil => "Niil"
    case head ::: tail => s"${head.toString} ::: ${tail.toString}"
  }
  def :::[T >: A](elem: T): Liist[T] = new :::(elem, this)
  def isEmpty: Boolean = this match {
    case Niil => true
    case _ => false
  }
  def contains[T](elem: T): Boolean = this match {
    case Niil => false
    case head ::: tail => head == elem || tail.contains(elem)
  }
  def +[T >: A](elem: T): Liist[T] = this match {
    case Niil => elem ::: Niil
    case head ::: tail => head ::: tail + elem
  }
  def ++[T >: A](liist: Liist[T]): Liist[T] = this match {
    case Niil => liist
    case head ::: tail => head ::: tail ++ liist
  }
  def reverse: Liist[A] = this match {
    case Niil => Niil
    case head ::: tail => tail.reverse + head
  }
  def take(n: Int): Liist[A] = this match {
    case head ::: tail if n > 0 => head ::: tail.take(n-1)
    case _ => Niil
  }
  def zip[B](liist: Liist[B]): Liist[(A,B)] = (this, liist) match {
    case (Niil, _) => Niil
    case (_, Niil) => Niil
    case (a ::: as, b ::: bs) => (a,b) ::: as.zip(bs)
  }
  def map[B](f: A => B): Liist[B] = this match {
    case Niil => Niil
    case x ::: xs =>  f(x) ::: xs.map(f)
  }
  def flatMap[B](f: A => Liist[B]): Liist[B] = this match {
    case Niil => Niil
    case head ::: tail => f(head) ++ tail.flatMap(f)
  }
  def withFilter(f: A => Boolean): Liist[A] = this match {
    case Niil => Niil
    case x ::: xs => if (f(x)) x ::: xs.withFilter(f) else xs.withFilter(f)
  }
  def takeWhile(f: A => Boolean): Liist[A] = this match {
    case Niil => Niil
    case x ::: xs =>  if (!f(x)) Niil else x ::: xs.takeWhile(f)
  }
  def ap[B](f: Liist[A => B]): Liist[B] = this match {
    case Niil => Niil
    case x ::: xs => f.map{ g => g(x) } ++ xs.ap(f)
  }
  def zipap[B](fs: Liist[A => B]): Liist[B] = (this,fs) match {
    case (Niil,_) => Niil
    case (_,Niil) => Niil
    case (head ::: tail, fshead ::: fstail) => fshead(head) ::: tail.zipap(fstail)
  }
  def foldRight[B](v: B)(f: (A,B) => B): B = this match {
    case Niil => v
    case x ::: xs => f(x, xs.foldRight(v)(f))
  }
  def foldLeft[B](z: B)(g: (B,A) => B): B = this match {
    case Niil => z
    case x ::: xs => xs.foldLeft(g(z,x))(g)
  }
  def toStringF =
    foldRight("Niil"){ (elem,acc) => s"${elem.toString} ::: $acc" }
  def containsF[T](n: T): Boolean =
    foldLeft(false){ case (v,a) => v || a == n }
  def F_+[T >: A](elem: T): Liist[T] =
    foldRight(elem ::: Niil){ case (a,v) => a ::: v }
  def F_++[T >: A](ns: Liist[T]): Liist[T] =
    foldRight(ns){ case (a,v) => a ::: v }
  def reverseF: Liist[A] =
    foldLeft(Niil:Liist[A]){ case (v,a) => a ::: v }
  def takeF(n: Int): Liist[A] =
    Liist.unfold((this,n)){
      case (_, 0) => None
      case (Niil, _) => None
      case (head ::: tail, n) => Some((head,(tail, n-1)))
    }
  def zipF[B](bs: Liist[B]) =
    Liist.unfold((this,bs)){
      case (Niil, _) => None
      case (_, Niil) => None
      case (a ::: as, b ::: bs) => Some( ((a,b), (as,bs)) )
    }
  def mapF[B](f: A => B): Liist[B] =
    foldRight(Niil: Liist[B]){ case (a,v) => f(a) ::: v }
  def flatMapF[B](f: A => Liist[B]): Liist[B] =
    foldRight(Niil: Liist[B]){ case (a,v) => f(a) ++ v }
  def withFilterF(f: A => Boolean): Liist[A] =
    foldRight(Niil: Liist[A]){ case (a,v) => if (f(a)) a ::: v else v }
  def takeWhileF(f: A => Boolean): Liist[A] =
    Liist.unfold(this){
      case head ::: tail if f(head) => Some((head,tail))
      case _ => None
    }
  def apF[B](f: Liist[A => B]): Liist[B] =
    foldRight(Niil: Liist[B]){ case (a,v) => f.map{ g => g(a) } ++ v }
  def zipapF[B](functions: Liist[A => B]): Liist[B] =
    Liist.unfold((this,functions)){
      case (Niil, _) => None
      case (_, Niil) => None
      case (a ::: as, f ::: fs) => Some( (f(a), (as,fs)) )
    }
  def foldRightT[B](v: B)(f: (A,B) => B): B = {
    def loop(liist: Liist[A])(k: B => B): B = liist match {
      case Niil => k(v)
      case x ::: xs => loop(xs)(w => k(f(x,w))) // or loop(xs)(k compose f(x,_))) or loop(xs)(f(x,_) andThen k)
    }
    loop(this)(identity)
  }
  def foldLeftR[B](z: B)(g: (B,A) => B): B =
    foldRightT( (y:B) => y )( (x,k) => w => k(g(w,x)) )(z)
}
object Liist {
  def lift2[A,B,C](a: Liist[A], b: Liist[B])(f: (A,B) => C): Liist[C] =
    b ap (a map f.curried)
  def lift3[A,B,C,D](a: Liist[A], b: Liist[B], c: Liist[C])(f: (A,B,C) => D): Liist[D] =
    c ap (b ap (a map f.curried))
  def ziplift2[A,B,C](a: Liist[A], b: Liist[B])(f: (A,B) => C): Liist[C] =
    b zipap (a map f.curried)
  def ziplift3[A,B,C,D](a: Liist[A], b: Liist[B], c: Liist[C])(f: (A,B,C) => D): Liist[D] =
    c zipap (b zipap (a map f.curried))
  def unfold[A,B](b: B)(g: B => Option[(A,B)]): Liist[A] = g(b) match {
    case None => Niil
    case Some((a,b1)) => a ::: unfold(b1)(g)
  }
}
case object Niil extends Liist[Nothing]
final case class :::[+A](head: A, tail: Liist[A]) extends Liist[A]

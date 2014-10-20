sealed abstract class Optioon[+A] {
  def isEmpty: Boolean = ???
  def getOrElse[B >: A](b: => B): B = ???
  def map[B](f: A => B): Optioon[B] = ???
  def flatMap[B](f: A => Optioon[B]): Optioon[B] = ???
  def withFilter(f: A => Boolean): Optioon[A] = ???
  def ap[B](f: Optioon[A => B]): Optioon[B] = ???
  def fold[B](b: => B, f: A => B):B = ???
  def isEmptyF: Boolean = ???
  def getOrElseF[B >: A](b: => B): B = ???
  def mapF[B](f: A => B): Optioon[B] = ???
  def flatMapF[B](f: A => Optioon[B]): Optioon[B] = ???
  def withFilterF(f: A => Boolean): Optioon[A] = ???
  def apF[B](f: Optioon[A => B]): Optioon[B] = ???
}
object Optioon {
  def lift2[A,B,C](ma: Optioon[A], mb: Optioon[B])(f: (A,B) => C): Optioon[C] = ???
  def lift3[A,B,C,D](ma: Optioon[A], mb: Optioon[B], mc: Optioon[C])(f: (A,B,C) => D): Optioon[D] = ???
}
case object Noone extends Optioon[Nothing]
case class Soome[A](a: A) extends Optioon[A]

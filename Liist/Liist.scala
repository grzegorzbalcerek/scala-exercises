abstract sealed class Liist[+A] {
  def :::[T >: A](elem: T): Liist[T] = ???
  def isEmpty: Boolean = ???
  def contains[T](elem: T): Boolean = ???
  def +[T >: A](elem: T): Liist[T] = ???
  def ++[T >: A](liist: Liist[T]): Liist[T] = ???
  def reverse: Liist[A] = ???
  def take(n: Int): Liist[A] = ???
  def zip[B](liist: Liist[B]): Liist[(A,B)] = ???
  def map[B](f: A => B): Liist[B] = ???
  def flatMap[B](f: A => Liist[B]): Liist[B] = ???
  def withFilter(f: A => Boolean): Liist[A] = ???
  def takeWhile(f: A => Boolean): Liist[A] = ???
  def ap[B](f: Liist[A => B]): Liist[B] = ???
  def zipap[B](fs: Liist[A => B]): Liist[B] = ???
  def foldRight[B](v: B)(f: (A,B) => B): B = ???
  def foldLeft[B](z: B)(g: (B,A) => B): B = ???
  def toStringF: String = ???
  def containsF[T](n: T): Boolean = ???
  def F_+[T >: A](elem: T): Liist[T] = ???
  def F_++[T >: A](ns: Liist[T]): Liist[T] = ???
  def reverseF: Liist[A] = ???
  def takeF(n: Int): Liist[A] = ???
  def zipF[B](bs: Liist[B]) = ???
  def mapF[B](f: A => B): Liist[B] = ???
  def flatMapF[B](f: A => Liist[B]): Liist[B] = ???
  def withFilterF(f: A => Boolean): Liist[A] = ???
  def takeWhileF(f: A => Boolean): Liist[A] = ???
  def apF[B](f: Liist[A => B]): Liist[B] = ???
  def zipapF[B](functions: Liist[A => B]): Liist[B] = ???
  def foldRightT[B](v: B)(f: (A,B) => B): B = ???
  def foldLeftR[B](z: B)(g: (B,A) => B): B = ???
}
object Liist {
  def lift2[A,B,C](a: Liist[A], b: Liist[B])(f: (A,B) => C): Liist[C] = ???
  def lift3[A,B,C,D](a: Liist[A], b: Liist[B], c: Liist[C])(f: (A,B,C) => D): Liist[D] = ???
  def ziplift2[A,B,C](a: Liist[A], b: Liist[B])(f: (A,B) => C): Liist[C] = ???
  def ziplift3[A,B,C,D](a: Liist[A], b: Liist[B], c: Liist[C])(f: (A,B,C) => D): Liist[D] = ???
  def unfold[A,B](b: B)(g: B => Option[(A,B)]): Liist[A] = ???
}
case object Niil extends Liist[Nothing]
final case class :::[+A](head: A, tail: Liist[A]) extends Liist[A]

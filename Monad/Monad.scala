import language.higherKinds
trait Monad[M[_]] extends Applic[M] {
  def flatMap[A,B](m: M[A])(g: A => M[B]): M[B]
  override def map[A,B](functor: M[A])(g: A => B): M[B] = ???
  override def ap[A,B](applic: M[A])(g: M[A => B]): M[B] = ???
}
object Monad {
  def flatMap[M[_]:Monad,A,B](m: M[A])(g: A => M[B]): M[B] =
    implicitly[Monad[M]].flatMap(m)(g)
  def foldM[M[_],A,B](list: List[A])(v: B)(g: (B,A) => M[B])(implicit m: Monad[M]): M[B] = ???
  def join[M[_],A,B](mm: M[M[A]])(implicit m: Monad[M]): M[A] = ???
}

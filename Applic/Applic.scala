import language.higherKinds
case class ZipList[A](list: List[A]) extends AnyVal
case class Id[A](id: A)
trait Applic[F[_]] extends Functor[F] {
  def pure[A](a: A): F[A]
  def ap[A,B](applic: F[A])(g: F[A => B]): F[B]
  override def map[A,B](functor: F[A])(g: A => B): F[B] = ???
}
object Applic {
  def pure[F[_]:Applic,A](a: A): F[A] =
    implicitly[Applic[F]].pure(a)
  def ap[F[_]:Applic,A,B](a: F[A])(g: F[A => B]): F[B] =
    implicitly[Applic[F]].ap(a)(g)
  def lift2[F[_],A,B,C](a: F[A], b: F[B])(g: (A,B) => C)(implicit applic: Applic[F]): F[C] = ???
  def lift3[F[_],A,B,C,D](a: F[A], b: F[B], c: F[C])(g: (A,B,C) => D)(implicit applic: Applic[F]): F[D] = ???
}

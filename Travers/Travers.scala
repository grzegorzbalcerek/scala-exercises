import language.higherKinds
trait Travers[T[_]] extends Functor[T] with Foldable[T] {
  def traverse[F[_]:Applic,A,B](t: T[A])(f: A => F[B]): F[T[B]]
  override def map[A,B](functor: T[A])(g: A => B): T[B] = ???
  override def foldMap[A,B:Monoid](foldable: T[A])(f: A => B): B = ???
}
object Travers {
  def traverse[T[_]:Travers,F[_]:Applic,A,B](t: T[A])(f: A => F[B]): F[T[B]] =
    implicitly[Travers[T]].traverse(t)(f)
  def sequence[T[_]:Travers,F[_]:Applic,A](t: T[F[A]]): F[T[A]] = ???
}

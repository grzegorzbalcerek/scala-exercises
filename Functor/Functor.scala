import language.higherKinds
trait Functor[F[_]] {
  def map[A,B](functor: F[A])(g: A => B): F[B]
}
object Functor {
  def map[F[_]:Functor,A,B](a: F[A])(g: A => B): F[B] =
    implicitly[Functor[F]].map(a)(g)
}

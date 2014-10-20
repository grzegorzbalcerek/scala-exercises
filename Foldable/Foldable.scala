import language.higherKinds
trait Foldable[F[_]] {
  def foldMap[A,B:Monoid](foldable: F[A])(f: A => B): B
}
object Foldable {
  def foldMap[A,B:Monoid,F[A]:Foldable](fa: F[A])(g: A => B) =
    implicitly[Foldable[F]].foldMap(fa)(g)
  def fold[A:Monoid,F[A]:Foldable](f: F[A]): A = ???
  def toList[A,F[A]:Foldable](f: F[A]): List[A] = ???
  def size[A,F[A]:Foldable](f: F[A]): Int = ???
}

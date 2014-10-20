import language.higherKinds
trait Foldable[F[_]] {
  def foldMap[A,B:Monoid](foldable: F[A])(f: A => B): B
}
object Foldable {
  def foldMap[A,B:Monoid,F[A]:Foldable](fa: F[A])(g: A => B) =
    implicitly[Foldable[F]].foldMap(fa)(g)
  implicit object FoldableList extends Foldable[List] {
    override def foldMap[A,B](fa: List[A])(g: A => B)(implicit m: Monoid[B]): B =
      fa.foldLeft(m.mempty)( (b,a) => m.mappend(b,g(a)) )
  }
  implicit object FoldableTree extends Foldable[Tree] {
    override def foldMap[A,B](fa: Tree[A])(g: A => B)(implicit m: Monoid[B]): B = fa match {
      case Leaf => m.mempty
      case Node(left, elem, right) => Monoid.msum(foldMap(left)(g), g(elem), foldMap(right)(g))
    }
  }
  def fold[A:Monoid,F[A]:Foldable](f: F[A]): A =
    foldMap(f)(identity)
  def toList[A,F[A]:Foldable](f: F[A]): List[A] = foldMap(f)(a => List(a))
  def size[A,F[A]:Foldable](f: F[A]): Int = foldMap(f)(a => 1)
}

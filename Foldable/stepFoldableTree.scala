implicit object FoldableTree extends Foldable[Tree] {
  override def foldMap[A,B](fa: Tree[A])(g: A => B)(implicit m: Monoid[B]): B = fa match {
    case Leaf => m.mempty
    case Node(left, elem, right) => Monoid.msum(foldMap(left)(g), g(elem), foldMap(right)(g))
  }
}

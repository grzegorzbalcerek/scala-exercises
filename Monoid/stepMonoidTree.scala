implicit def MonoidTree[T](implicit mt: Monoid[T]) = new Monoid[Tree[T]] {
  override def mempty: Tree[T] = Leaf
  override def mappend(a: Tree[T], b: Tree[T]) = (a,b) match {
    case (Node(aleft, aelem, aright), Node(bleft, belem, bright)) =>
      Node(mappend(aleft,bleft), mt.mappend(aelem,belem), mappend(aright,bright))
    case (Leaf, t) => t
    case (t, Leaf) => t
  }
}

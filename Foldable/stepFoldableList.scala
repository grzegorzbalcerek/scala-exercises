implicit object FoldableList extends Foldable[List] {
  override def foldMap[A,B](fa: List[A])(g: A => B)(implicit m: Monoid[B]): B =
    fa.foldLeft(m.mempty)( (b,a) => m.mappend(b,g(a)) )
}

implicit def MonoidList[S] = new Monoid[List[S]] {
  override def mempty = Nil
  override def mappend(a: List[S], b: List[S]) = a ++ b
}

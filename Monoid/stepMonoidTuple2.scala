implicit def MonoidTuple2[S,T](implicit ms: Monoid[S], mt: Monoid[T]) = new Monoid[(S,T)] {
  override def mempty = (ms.mempty,mt.mempty)
  override def mappend(a: (S,T), b: (S,T)) = (ms.mappend(a._1, b._1), mt.mappend(a._2, b._2))
}

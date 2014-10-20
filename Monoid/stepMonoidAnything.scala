implicit object MonoidAnything extends Monoid[Anything] {
  override def mempty = Anything(false)
  override def mappend(a: Anything, b: Anything) = Anything(a.value || b.value)
}

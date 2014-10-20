implicit object MonoidAll extends Monoid[All] {
  override def mempty = All(true)
  override def mappend(a: All, b: All) = All(a.value && b.value)
}

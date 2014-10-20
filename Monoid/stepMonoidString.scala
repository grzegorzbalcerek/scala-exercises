implicit object MonoidString extends Monoid[String] {
  override def mempty = ""
  override def mappend(a: String, b: String) = a + b
}

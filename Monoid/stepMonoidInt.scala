implicit object MonoidInt extends Monoid[Int] {
  override def mempty = 0
  override def mappend(a: Int, b: Int) = a + b
}

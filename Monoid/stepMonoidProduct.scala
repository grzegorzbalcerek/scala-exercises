implicit object MonoidProduct extends Monoid[Product] {
  override def mempty = Product(1)
  override def mappend(a: Product, b: Product) = Product(a.value * b.value)
}

implicit class Any2some[T](x: T) {
  def some: Option[T] = Some(x)
}

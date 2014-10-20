object Implicits {
  import language.implicitConversions
  implicit class Any2some[T](x: T) {
    def some: Option[T] = Some(x)
  }
  implicit class int2factorial(n: Int) {
    def ! = (1 to n).product
  }
  implicit class int2times(n: Int) {
    def times(block: => Unit) = for (j <- 1 to n) block
  }
}

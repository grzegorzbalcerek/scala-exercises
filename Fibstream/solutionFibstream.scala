object Fibstream {
  def fibstream: Stream[Int] = {
    def fib(a: Int, b: Int): Stream[Int] = a #:: fib(b, a+b)
    fib(0,1)
  }
}

object Tailrec {
  def sum(n: Int): Int = {
    def loop(n: Int, acc: Int): Int =
      if (n == 0) acc
      else loop(n-1, acc+n)
    loop(n,0)
  }
  def fac(n: Int): Int = {
    def loop(n: Int, acc: Int): Int =
      if (n == 0) acc
      else loop(n-1, acc*n)
    loop(n,1)
  }
  def fib(n: Int): Int = {
    def loop(n: Int, k1: Int, k2: Int): Int =
      if (n == 0) k1
      else loop(n-1, k2, k1+k2)
    loop(n,0,1)
  }
}

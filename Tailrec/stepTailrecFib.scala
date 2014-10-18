def fib(n: Int): Int = {
  def loop(n: Int, k1: Int, k2: Int): Int =
    if (n == 0) k1
    else loop(n-1, k2, k1+k2)
  loop(n,0,1)
}

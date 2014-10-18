def fac(n: Int): Int = {
  def loop(n: Int, acc: Int): Int =
    if (n == 0) acc
    else loop(n-1, acc*n)
  loop(n,1)
}

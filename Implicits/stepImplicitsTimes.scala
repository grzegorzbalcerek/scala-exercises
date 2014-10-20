implicit class int2times(n: Int) {
  def times(block: => Unit) = for (j <- 1 to n) block
}

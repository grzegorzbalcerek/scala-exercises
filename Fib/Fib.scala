object Fib extends App {
  var f2 = 0
  var f1 = 1
  print("0 1 ")
  var k = 2
  while (k <= 10) {
    val f = f1 + f2
    print(f)
    print(" ")
    k = k + 1
    f2 = f1
    f1 = f
  }
  println()
}

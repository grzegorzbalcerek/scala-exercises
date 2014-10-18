object TailrecTest extends App {
  import Tailrec._
  assert(sum(10) == 55, "sum(10) == 55")
  assert(fac(10) == 3628800, "fac(10) == 3628800")
  assert(fib(10) == 55, "fib(10) == 55")
}

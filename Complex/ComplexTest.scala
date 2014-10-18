object ComplexTest extends App {

  val a = Complex(1.0,2.0)
  assert(a.re == 1.0, "a.re == 1.0")
  assert(a.im == 2.0, "a.im == 2.0")

  val b = Complex(4.0)
  assert(b.re == 4.0, "b.re == 4.0")
  assert(b.im == 0.0, "b.im == 0.0")

  val c = Complex.j(-6.0)
  assert(c.re == 0.0, "c.re == 0.0")
  assert(c.im == -6.0, "c.im == -6.0")

  assert(j == Complex(0,1), "j == Complex(0,1)")

  assert(a+b+c+j == Complex(5.0,-3.0), "a+b+c+j == Complex(5.0,-3.0)")
  assert(a-b-c == Complex(-3.0,8.0), "a-b-c == Complex(-3.0,8.0)")
  assert(a-5.0 == Complex(-4.0,2.0), "a-5.0 == Complex(-4.0,2.0)")
  assert(a+2.0 == Complex(3.0,2.0), "a+2.0 == Complex(3.0,2.0)")
  assert(-a == Complex(-1.0,-2.0), "-a == Complex(-1.0,-2.0)")

  val d = Complex(1.0,2.0)
  assert(5.0 + d == 5.0 + d, "5.0 + d == 5.0 + d")
  assert(5.0 - d == 5.0 - d, "5.0 - d == 5.0 - d")

}

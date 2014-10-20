object ImplicitsTest extends App {
  import Implicits._
  assert(1.some == Some(1), "1.some == Some(1)")
  assert("abc".some == Some("abc"), "'abc'.some == Some(abc)")

  import language.postfixOps
  assert((4!) == 24, "4! == 24")

  4 times { println("Hello!") }
}

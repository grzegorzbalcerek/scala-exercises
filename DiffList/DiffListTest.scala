object DiffListTest extends App {
  import DiffList._
  val a = empty[Int]
  val b = append(a,1)
  val c = append(b,5)
  val d = append(c,2)
  assert(toList(d) == List(1, 5, 2), "toList(d) == List(1, 5, 2)")
}

object FoldableTest extends App {
  import Foldable._
  val p = List(2,7,5,4)
  assert(foldMap(p)(x => All(x > 2)) == All(false), "foldMap(p)(x => All(x > 2)) == All(false)")
  assert(foldMap(p)(x => All(x >= 1)) == All(true), "foldMap(p)(x => All(x >= 1)) == All(true)")
  assert(foldMap(p)(x => Anything(x == 5)) == Anything(true), "foldMap(p)(x => Anything(x == 5)) == Anything(true)")
  assert(foldMap(p)(identity) == 18, "foldMap(p)(identity) == 18")
  assert(foldMap(p)(_.toString) == "2754", "foldMap(p)(_.toString) == 2754")
  val r: Tree[Int] = Node(Node(Leaf,4,Leaf),7,Node(Leaf,1,Leaf))
  assert(foldMap(r)(x => All(x > 2)) == All(false), "foldMap(r)(x => All(x > 2)) == All(false)")
  assert(foldMap(r)(x => All(x >= 1)) == All(true), "foldMap(r)(x => All(x >= 1)) == All(true)")
  assert(foldMap(r)(x => Anything(x == 5)) == Anything(false), "foldMap(r)(x => Anything(x == 5)) == Anything(false)")
  assert(foldMap(r)(identity) == 12, "foldMap(r)(identity) == 12")
  assert(foldMap(r)(_.toString) == "471", "foldMap(r)(_.toString) == 471")
  val q = List(2,7,5,4)
  assert(fold(q) == 18, "fold(q) == 18")
  assert(toList(r) == List(4, 7, 1), "toList(r) == List(4, 7, 1)")
  assert(size(p) == 4, "size(p) == 4")
  assert(size(r) == 3, "size(r) == 3")
}
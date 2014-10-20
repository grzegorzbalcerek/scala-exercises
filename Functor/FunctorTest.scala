object FunctorTest extends App {
  val a: Option[Int] = Some(5)
  val n: Option[Int] = None
  import Functor._
  assert(map(a)(_+1) == Some(6), "map(a)(_+1) == Some(6)")
  assert(map(n)(_+1) == None, "map(n)(_+1) == None")
  val x = List(5,2)
  assert(map(x)(_*2) == List(10, 4), "map(x)(_*2) == List(10, 4)")
  val b: Tree[Int] = Node(Node(Leaf,4,Leaf),7,Node(Leaf,1,Leaf))
  assert(map(b)(_+1).toString == "<<. 5 .> 8 <. 2 .>>", "map(b)(_+1).toString == <<. 5 .> 8 <. 2 .>>")
}

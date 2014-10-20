object MonoidTest extends App {
  import Monoid._
  assert(MonoidString.mempty == "", """MonoidString.mempty == "" """)
  assert(MonoidString.mappend("a","b") == "ab", """MonoidString.mappend("a","b") == ab""")
  assert(msum("H","ello"," ","wo","rld","!") == "Hello world!", """msum("H","ello"," ","wo","rld","!") == Hello world!""")
  assert(msum(2, 5, 4) == 11, "msum(2, 5, 4) == 11")
  assert(msum(Anything(false), Anything(true), Anything(false)) == Anything(true), "msum(Anything(false), Anything(true), Anything(false)) == Anything(true)")
  assert(msum(All(false), All(true), All(false)) == All(false), "msum(All(false), All(true), All(false)) == All(false)")
  assert(msum(List(2,5), List(7,9,1)) == List(2, 5, 7, 9, 1), "msum(List(2,5), List(7,9,1)) == List(2, 5, 7, 9, 1)")
  assert(msum((2, "Hello"), (4, " "), (5, "World")) == (11,"Hello World"), """msum((2, "Hello"), (4, " "), (5, "World")) == (11,Hello World)""")
  val a: Tree[(Int,String)] = Node(Node(Leaf,(2,"a"),Leaf),(5,"A"),Leaf)
  val b: Tree[(Int,String)] = Node(Node(Leaf,(4,"b"),Leaf),(7,"B"),Node(Leaf,(1,"bb"),Leaf))
  assert(msum(a,b).toString == "<<. (6,ab) .> (12,AB) <. (1,bb) .>>", """msum(a,b).toString == "<<. (6,ab) .> (12,AB) <. (1,bb) .>>" """)
}

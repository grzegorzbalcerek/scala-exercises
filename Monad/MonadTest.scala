object MonadTest extends App {
  val a: Option[Int] = Some(5)
  val n: Option[Int] = None
  val h: Int => Option[Int] = x => Some(x+1)
  val k: Int => Option[Int] = _ => None
  import Monad._
  assert(flatMap(a)(h) == Some(6), "flatMap(a)(h) == Some(6)")
  assert(flatMap(a)(k) == None, "flatMap(a)(k) == None")
  assert(flatMap(n)(h) == None, "flatMap(n)(h) == None")
  import Functor._
  assert(map(a)(_+1) == Some(6), "map(a)(_+1) == Some(6)")
  assert(map(n)(_+1) == None, "map(n)(_+1) == None")
  val f: Option[Int => Int] = Some(_+1)
  val g: Option[Int => Int] = None
  import Applic._
  assert(ap(a)(f) == Some(6), "ap(a)(f) == Some(6)")
  assert(ap(a)(g) == None, "ap(a)(g) == None")
  assert(ap(n)(f) == None, "ap(n)(f) == None")
  def sumSqrt(list: List[Double]): Option[Double] = foldM(list)(0.0)( (sum,x) => if (x>=0) Some(sum+math.sqrt(x)) else None )
  assert(sumSqrt(Nil) == Some(0.0), "sumSqrt(Nil) == Some(0.0)")
  assert(sumSqrt(List(1.0)) == Some(1.0), "sumSqrt(List(1.0)) == Some(1.0)")
  assert(sumSqrt(List(1.0,4.0)) == Some(3.0), "sumSqrt(List(1.0,4.0)) == Some(3.0)")
  assert(sumSqrt(List(1.0,4.0,9.0)) == Some(6.0), "sumSqrt(List(1.0,4.0,9.0)) == Some(6.0)")
  assert(sumSqrt(List(1.0,4.0,-1.0,9.0)) == None, "sumSqrt(List(1.0,4.0,-1.0,9.0)) == None")
  val x = List(4,25)
  val j: Int => List[Double] = x => List(math.sqrt(x),-math.sqrt(x))
  assert(flatMap(x)(j) == List(2.0, -2.0, 5.0, -5.0), "flatMap(x)(j) == List(2.0, -2.0, 5.0, -5.0)")
  val y = List(List(1,2),List(4,5))
  val z: Option[Option[String]] = Some(Some("abc"))
  assert(join(y) == List(1, 2, 4, 5), "join(y) == List(1, 2, 4, 5)")
  assert(join(z) == Some("abc"), "join(z) == Some(abc)")
}

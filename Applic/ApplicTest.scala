object ApplicTest extends App {
  val id2: Id[Int] = Id(2)
  val id5: Id[Int] = Id(5)
  val id1_+ : Id[Int => Int] = Id(1+_)
  val id_+ : Id[Int => Int => Int] = Id(x => y => x+y)
  import Applic._
  assert(ap(id2)(id1_+) == Id(3), "ap(id2)(id1_+) == Id(3)")
  assert(ap(id2)(ap(id5)(id_+)) == Id(7), "ap(id2)(ap(id5)(id_+)) == Id(7)")
  val a: Option[Int] = Some(5)
  val n: Option[Int] = None
  val f: Option[Int => Int] = Some(_+1)
  val g: Option[Int => Int] = None
  assert(ap(a)(f) == Some(6), "ap(a)(f) == Some(6)")
  assert(ap(a)(g) == None, "ap(a)(g) == None")
  assert(ap(n)(f) == None, "ap(n)(f) == None")
  import Functor._
  assert(map(a)(_+1) == Some(6), "map(a)(_+1) == Some(6)")
  assert(map(n)(_+1) == None, "map(n)(_+1) == None")
  val b: Option[Int] = Some(2)
  assert(lift2(a,b)(_+_) == Some(7), "lift2(a,b)(_+_) == Some(7)")
  assert(lift2(n,b)(_+_) == None, "lift2(n,b)(_+_) == None")
  val c: Option[Int] = Some(4)
  assert(lift3(a,b,c)(_+_+_) == Some(11), "lift3(a,b,c)(_+_+_) == Some(11)")
  assert(lift3(a,b,n)(_+_+_) == None, "lift3(a,b,n)(_+_+_) == None")
  assert(lift3(a,n,c)(_+_+_) == None, "lift3(a,n,c)(_+_+_) == None")
  val x: List[Int] = List(5,2)
  val h: List[Int => Int] = List(_+1,_+2)
  val y = List(6,7)
  val z = List(8)
  val w = List[Int]()
  assert(ap(x)(h) == List(6, 3, 7, 4), "ap(x)(h) == List(6, 3, 7, 4)")
  assert(lift2(x,y)(_+_) == List(11, 12, 8, 9), "lift2(x,y)(_+_) == List(11, 12, 8, 9)")
  assert(lift2(x,w)(_+_) == List(), "lift2(x,w)(_+_) == List()")
  assert(lift3(x,y,z)(_+_+_) == List(19, 20, 16, 17), "lift3(x,y,z)(_+_+_) == List(19, 20, 16, 17)")
  assert(lift3(x,w,z)(_+_+_) == List(), "lift3(x,w,z)(_+_+_) == List()")
  val x2 = ZipList(x)
  val h2 = ZipList(h)
  val y2 = ZipList(y)
  val z2 = ZipList(z)
  val w2 = ZipList(w)
  assert(ap(x2)(h2) == ZipList(List(6, 4)), "ap(x2)(h2) == ZipList(List(6, 4))")
  assert(lift2(x2,y2)(_+_) == ZipList(List(11)), "lift2(x2,y2)(_+_) == ZipList(List(11))")
  assert(lift2(x2,w2)(_+_) == ZipList(List()), "lift2(x2,w2)(_+_) == ZipList(List())")
  assert(lift3(x2,y2,z2)(_+_+_) == ZipList(List(19)), "lift3(x2,y2,z2)(_+_+_) == ZipList(List(19))")
  assert(lift3(x2,w2,z2)(_+_+_) == ZipList(List()), "lift3(x2,w2,z2)(_+_+_) == ZipList(List())")
}

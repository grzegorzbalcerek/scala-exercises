object EqTest extends App {
  import Eq._
  assert(isEq(1,2) == false, "isEq(1,2) == false")
  assert(isEq(1,1) == true, "isEq(1,1) == true")
  assert(notEq(1,2) == true, "notEq(1,2) == true")
  assert(notEq(1,1) == false, "notEq(1,1) == false")
  assert(1 === 2 == false, "1 === 2 == false")
  assert(1 === 1 == true, "1 === 1 == true")
  assert(1 =/= 2 == true, "1 =/= 2 == true")
  assert(1 =/= 1 == false, "1 =/= 1 == false")
  assert(1.0 === 2.0 == false, "1.0 === 2.0 == false")
  assert(1.0 === 1.0 == true, "1.0 === 1.0 == true")
  assert(1.0 =/= 2.0 == true, "1.0 =/= 2.0 == true")
  assert(1.0 === 1 == true, "1.0 === 1 == true")
  assert(Mod4(1) === Mod4(5) == true, "Mod4(1) === Mod4(5) == true")
  assert(Mod4(1) === Mod4(6) == false, "Mod4(1) === Mod4(6) == false")
  assert(allEq(Mod4(1), Mod4(5), Mod4(13), Mod4(25)) == true, "allEq(Mod4(1), Mod4(5), Mod4(13), Mod4(25)) == true")
  assert(allEq(Mod4(1), Mod4(5), Mod4(14), Mod4(25)) == false, "allEq(Mod4(1), Mod4(5), Mod4(14), Mod4(25)) == false")
  val o1: Option[Mod4] = Some(Mod4(1))
  val o2: Option[Mod4] = Some(Mod4(2))
  val o5: Option[Mod4] = Some(Mod4(5))
  val n: Option[Mod4] = None
  assert(o1 === o2 == false, "o1 === o2 == false")
  assert(o1 === o5 == true, "o1 === o5 == true")
  assert(o1 === n == false, "o1 === n == false")
  assert(n === o1 == false, "n === o1 == false")
}
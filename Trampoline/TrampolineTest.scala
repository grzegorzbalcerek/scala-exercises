object TrampolineTest extends App {
  import Trampoline._
  assert(IsOddEven.isOdd(5) == true, "IsOddEven.isOdd(5) == true")
  assert(IsOddEven.isEven(5) == false, "IsOddEven.isEven(5) == false")
  assert(TrampolineIsOddEven.isOdd(5) == true, "TrampolineIsOddEven.isOdd(5) == true")
  assert(TrampolineIsOddEven.isEven(5) == false, "TrampolineIsOddEven.isEven(5) == false")
  assert(TrampolineIsOddEven.isOdd(9999998) == false, "TrampolineIsOddEven.isOdd(9999998) == false")
  assert(TrampolineIsOddEven.isOdd(9999999) == true, "TrampolineIsOddEven.isOdd(9999999) == true")
}

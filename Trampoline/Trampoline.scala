object IsOddEven {
  def isOdd(n:Int):Boolean  = if (n == 0) false else isEven(n-1)
  def isEven(n:Int):Boolean = if (n == 0) true  else isOdd(n-1)
}
object TrampolineIsOddEven {
  /* to be uncommented when the Trampoline object is implemented
  import Trampoline._
  private def isOddAux(n:Int):Result[Boolean] =
    if (n == 0) Done(false) else Cont(isEvenAux(n-1))
  private def isEvenAux(n:Int):Result[Boolean] =
    if (n == 0) Done(true) else Cont(isOddAux(n-1))
  def isOdd(n:Int):Boolean = trampoline(isOddAux(n))
  def isEven(n:Int):Boolean = trampoline(isEvenAux(n))
  */
}
object Trampoline {
  // TODO
}

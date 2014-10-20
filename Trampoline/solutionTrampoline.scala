object IsOddEven {
  def isOdd(n:Int):Boolean  = if (n == 0) false else isEven(n-1)
  def isEven(n:Int):Boolean = if (n == 0) true  else isOdd(n-1)
}
object TrampolineIsOddEven {
  import Trampoline._
  private def isOddAux(n:Int):Result[Boolean] =
    if (n == 0) Done(false) else Cont(isEvenAux(n-1))
  private def isEvenAux(n:Int):Result[Boolean] =
    if (n == 0) Done(true) else Cont(isOddAux(n-1))
  def isOdd(n:Int):Boolean = trampoline(isOddAux(n))
  def isEven(n:Int):Boolean = trampoline(isEvenAux(n))
}
object Trampoline {
  sealed abstract class Result[T]
  final case class Done[T](v: T) extends Result[T]
  private[Trampoline] final case class PrivateCont[T](
    cont: () => Result[T]) extends Result[T]
  object Cont {
    def apply[T](cont: => Result[T]) = new PrivateCont(cont _)
  }
  def trampoline[T](cont: => Result[T]): T = cont match {
    case Done(result) => result
    case PrivateCont(nextCont) => trampoline(nextCont())
  }
}

trait Eq[T] {
  def isEq(a:T,b:T):Boolean
  def notEq(a:T,b:T) = !isEq(a,b)
}
object Eq {
  def isEq[T](x:T,y:T)(implicit e: Eq[T]): Boolean = ???
  def notEq[T:Eq](x:T,y:T): Boolean = ???
  def allEq[T](xs:T*)(implicit e: Eq[T]): Boolean = ???
}

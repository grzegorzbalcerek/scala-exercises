implicit class EqInfix[T](a:T)(implicit e:Eq[T]) {
  def ===(b:T):Boolean = e.isEq(a,b)
  def =/=(b:T):Boolean = e.notEq(a,b)
}

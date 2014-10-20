def isEq[T](x:T,y:T)(implicit e: Eq[T]): Boolean = e.isEq(x,y)

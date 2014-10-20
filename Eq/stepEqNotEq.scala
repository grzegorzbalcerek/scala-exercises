def notEq[T:Eq](a:T,b:T): Boolean = implicitly[Eq[T]].notEq(a,b)

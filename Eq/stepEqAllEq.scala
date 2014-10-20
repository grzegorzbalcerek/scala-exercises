def allEq[T](xs:T*)(implicit e: Eq[T]): Boolean =
  if (xs.isEmpty) true
  else {
    val x = xs.head
    xs.tail.foldLeft(true){ case (acc,y) => acc && e.isEq(x,y) }
  }

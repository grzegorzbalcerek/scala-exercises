def F_+[T >: A](elem: T): Liist[T] =
  foldRight(elem ::: Niil){ case (a,v) => a ::: v }

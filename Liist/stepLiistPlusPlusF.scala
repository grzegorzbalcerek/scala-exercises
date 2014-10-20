def F_++[T >: A](ns: Liist[T]): Liist[T] =
  foldRight(ns){ case (a,v) => a ::: v }

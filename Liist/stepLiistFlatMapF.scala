def flatMapF[B](f: A => Liist[B]): Liist[B] =
  foldRight(Niil: Liist[B]){ case (a,v) => f(a) ++ v }

def apF[B](f: Liist[A => B]): Liist[B] =
  foldRight(Niil: Liist[B]){ case (a,v) => f.map{ g => g(a) } ++ v }

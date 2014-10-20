def mapF[B](f: A => B): Liist[B] =
  foldRight(Niil: Liist[B]){ case (a,v) => f(a) ::: v }

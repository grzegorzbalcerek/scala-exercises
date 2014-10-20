def lift3[A,B,C,D](a: Liist[A], b: Liist[B], c: Liist[C])(f: (A,B,C) => D): Liist[D] =
  c ap (b ap (a map f.curried))

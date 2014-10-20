def ziplift3[A,B,C,D](a: Liist[A], b: Liist[B], c: Liist[C])(f: (A,B,C) => D): Liist[D] =
  c zipap (b zipap (a map f.curried))

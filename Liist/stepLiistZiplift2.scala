def ziplift2[A,B,C](a: Liist[A], b: Liist[B])(f: (A,B) => C): Liist[C] =
  b zipap (a map f.curried)

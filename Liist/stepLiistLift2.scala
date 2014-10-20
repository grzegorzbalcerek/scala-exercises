def lift2[A,B,C](a: Liist[A], b: Liist[B])(f: (A,B) => C): Liist[C] =
  b ap (a map f.curried)

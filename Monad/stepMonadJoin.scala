def join[M[_],A,B](mm: M[M[A]])(implicit m: Monad[M]): M[A] =
  m.flatMap(mm)(identity)

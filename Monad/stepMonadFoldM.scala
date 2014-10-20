def foldM[M[_],A,B](list: List[A])(v: B)(g: (B,A) => M[B])(implicit m: Monad[M]): M[B] = list match {
  case Nil => m.pure(v)
  case x :: xs => m.flatMap(g(v,x)){ b => foldM(xs)(b)(g) }
}

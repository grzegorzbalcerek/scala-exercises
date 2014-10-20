def lift2[F[_],A,B,C](a: F[A], b: F[B])(g: (A,B) => C)(implicit applic: Applic[F]): F[C] =
  applic.ap(b)(applic.map(a)(g.curried))

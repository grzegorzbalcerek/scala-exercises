def lift3[F[_],A,B,C,D](a: F[A], b: F[B], c: F[C])(g: (A,B,C) => D)(implicit applic: Applic[F]): F[D] =
  applic.ap(c)(applic.ap(b)(applic.map(a)(g.curried)))

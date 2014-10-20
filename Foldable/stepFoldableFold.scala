def fold[A:Monoid,F[A]:Foldable](f: F[A]): A =
  foldMap(f)(identity)

def foldMap[A,B:Monoid,F[A]:Foldable](fa: F[A])(g: A => B) =
  implicitly[Foldable[F]].foldMap(fa)(g)

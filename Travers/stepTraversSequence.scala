def sequence[T[_]:Travers,F[_]:Applic,A](t: T[F[A]]): F[T[A]] =
  implicitly[Travers[T]].traverse(t)(identity)

override def map[A,B](functor: F[A])(g: A => B): F[B] =
  ap(functor)(pure(g))

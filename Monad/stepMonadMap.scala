override def map[A,B](functor: M[A])(g: A => B): M[B] =
  flatMap(functor)(a => pure(g(a)))

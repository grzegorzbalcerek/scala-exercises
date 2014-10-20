override def map[A,B](functor: T[A])(g: A => B): T[B] =
  traverse(functor)((a:A) => Applic.ApplicId.pure(g(a)))(Applic.ApplicId).id

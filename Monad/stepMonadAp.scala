override def ap[A,B](applic: M[A])(g: M[A => B]): M[B] =
  flatMap(applic)(a => flatMap(g)(h => pure(h(a))))
//  flatMap(g)(f => flatMap(a)(x => pure(f(x))))

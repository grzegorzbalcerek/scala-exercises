def withFilterF(f: A => Boolean): Liist[A] =
  foldRight(Niil: Liist[A]){ case (a,v) => if (f(a)) a ::: v else v }

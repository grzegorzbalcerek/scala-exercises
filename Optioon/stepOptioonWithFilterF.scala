def withFilterF(f: A => Boolean): Optioon[A] =
  fold(Noone, a => if (f(a)) Soome(a) else Noone)

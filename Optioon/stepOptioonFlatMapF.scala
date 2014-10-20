def flatMapF[B](f: A => Optioon[B]): Optioon[B] =
  fold(Noone, f)

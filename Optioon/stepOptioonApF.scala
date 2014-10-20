def apF[B](f: Optioon[A => B]): Optioon[B] =
  fold(Noone, a => f.map{ g => g(a) })

def mapF[B](f: A => B): Optioon[B] =
  fold(Noone, f andThen Soome.apply)

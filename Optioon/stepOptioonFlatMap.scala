def flatMap[B](f: A => Optioon[B]): Optioon[B] = this match {
  case Noone => Noone
  case Soome(a) => f(a)
}

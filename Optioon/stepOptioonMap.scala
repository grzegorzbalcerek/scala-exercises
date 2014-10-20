def map[B](f: A => B): Optioon[B] = this match {
  case Noone => Noone
  case Soome(a) => Soome(f(a))
}

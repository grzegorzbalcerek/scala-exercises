def withFilter(f: A => Boolean): Optioon[A] = this match {
  case Soome(a) if (f(a)) => this
  case _ => Noone
}

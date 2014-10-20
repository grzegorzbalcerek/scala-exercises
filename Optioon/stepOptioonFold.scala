def fold[B](b: => B, f: A => B):B = this match {
  case Noone => b
  case Soome(a) => f(a)
}

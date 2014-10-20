def withFilter(f: A => Boolean): Liist[A] = this match {
  case Niil => Niil
  case x ::: xs => if (f(x)) x ::: xs.withFilter(f) else xs.withFilter(f)
}

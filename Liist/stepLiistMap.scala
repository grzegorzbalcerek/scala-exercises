def map[B](f: A => B): Liist[B] = this match {
  case Niil => Niil
  case x ::: xs =>  f(x) ::: xs.map(f)
}

def ap[B](f: Liist[A => B]): Liist[B] = this match {
  case Niil => Niil
  case x ::: xs => f.map{ g => g(x) } ++ xs.ap(f)
}

def flatMap[B](f: A => Liist[B]): Liist[B] = this match {
  case Niil => Niil
  case head ::: tail => f(head) ++ tail.flatMap(f)
}

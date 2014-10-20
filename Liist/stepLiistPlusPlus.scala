def ++[T >: A](liist: Liist[T]): Liist[T] = this match {
  case Niil => liist
  case head ::: tail => head ::: tail ++ liist
}

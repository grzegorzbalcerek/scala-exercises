def +[T >: A](elem: T): Liist[T] = this match {
  case Niil => elem ::: Niil
  case head ::: tail => head ::: tail + elem
}

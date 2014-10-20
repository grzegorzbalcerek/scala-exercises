def reverse: Liist[A] = this match {
  case Niil => Niil
  case head ::: tail => tail.reverse + head
}

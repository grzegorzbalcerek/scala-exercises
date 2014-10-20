def take(n: Int): Liist[A] = this match {
  case head ::: tail if n > 0 => head ::: tail.take(n-1)
  case _ => Niil
}

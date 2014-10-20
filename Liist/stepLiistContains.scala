def contains[T](elem: T): Boolean = this match {
  case Niil => false
  case head ::: tail => head == elem || tail.contains(elem)
}

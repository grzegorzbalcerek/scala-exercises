override def toString = this match {
  case Niil => "Niil"
  case head ::: tail => s"${head.toString} ::: ${tail.toString}"
}

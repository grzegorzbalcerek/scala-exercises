def getOrElse[B >: A](b: => B): B = this match {
  case Noone => b
  case Soome(a) => a
}

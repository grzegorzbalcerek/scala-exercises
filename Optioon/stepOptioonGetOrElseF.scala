def getOrElseF[B >: A](b: => B): B =
  fold(b, x => x)

def foldRight[B](v: B)(f: (A,B) => B): B = this match {
  case Niil => v
  case x ::: xs => f(x, xs.foldRight(v)(f))
}

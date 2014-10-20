def foldLeft[B](z: B)(g: (B,A) => B): B = this match {
  case Niil => z
  case x ::: xs => xs.foldLeft(g(z,x))(g)
}

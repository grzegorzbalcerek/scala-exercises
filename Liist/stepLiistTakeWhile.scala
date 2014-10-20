def takeWhile(f: A => Boolean): Liist[A] = this match {
  case Niil => Niil
  case x ::: xs =>  if (!f(x)) Niil else x ::: xs.takeWhile(f)
}

def unfold[A,B](b: B)(g: B => Option[(A,B)]): Liist[A] = g(b) match {
  case None => Niil
  case Some((a,b1)) => a ::: unfold(b1)(g)
}

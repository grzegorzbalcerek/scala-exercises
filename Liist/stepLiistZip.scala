def zip[B](liist: Liist[B]): Liist[(A,B)] = (this, liist) match {
  case (Niil, _) => Niil
  case (_, Niil) => Niil
  case (a ::: as, b ::: bs) => (a,b) ::: as.zip(bs)
}

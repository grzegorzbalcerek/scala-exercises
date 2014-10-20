def zipF[B](bs: Liist[B]) =
  Liist.unfold((this,bs)){
    case (Niil, _) => None
    case (_, Niil) => None
    case (a ::: as, b ::: bs) => Some( ((a,b), (as,bs)) )
  }

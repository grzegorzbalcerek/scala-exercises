def takeF(n: Int): Liist[A] =
  Liist.unfold((this,n)){
    case (_, 0) => None
    case (Niil, _) => None
    case (head ::: tail, n) => Some((head,(tail, n-1)))
  }

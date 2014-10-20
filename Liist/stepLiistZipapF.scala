def zipapF[B](functions: Liist[A => B]): Liist[B] =
  Liist.unfold((this,functions)){
    case (Niil, _) => None
    case (_, Niil) => None
    case (a ::: as, f ::: fs) => Some( (f(a), (as,fs)) )
  }

def takeWhileF(f: A => Boolean): Liist[A] =
  Liist.unfold(this){
    case head ::: tail if f(head) => Some((head,tail))
    case _ => None
  }

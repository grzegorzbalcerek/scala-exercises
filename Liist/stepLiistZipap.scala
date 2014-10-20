def zipap[B](fs: Liist[A => B]): Liist[B] = (this,fs) match {
  case (Niil,_) => Niil
  case (_,Niil) => Niil
  case (head ::: tail, fshead ::: fstail) => fshead(head) ::: tail.zipap(fstail)
}

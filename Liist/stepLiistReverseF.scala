def reverseF: Liist[A] =
  foldLeft(Niil:Liist[A]){ case (v,a) => a ::: v }

def containsF[T](n: T): Boolean =
  foldLeft(false){ case (v,a) => v || a == n }

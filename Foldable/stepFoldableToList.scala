def toList[A,F[A]:Foldable](f: F[A]): List[A] = foldMap(f)(a => List(a))

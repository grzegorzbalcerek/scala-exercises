def msum[T](list: T*)(implicit m: Monoid[T]): T =
  list.foldLeft(m.mempty)(m.mappend)

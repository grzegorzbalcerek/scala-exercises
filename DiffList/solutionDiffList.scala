object DiffList {
  type DiffList[T] = List[T] => List[T]
  def empty[T]: DiffList[T] = (x:List[T]) => x
  def append[T](k: DiffList[T], elem: T):DiffList[T] =
    tail => k (elem :: tail) // or: k compose (elem :: _)
  def toList[T](k: DiffList[T]): List[T] = k(Nil)
}

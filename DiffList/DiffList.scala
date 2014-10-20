object DiffList {
  type DiffList[T] = List[T] => List[T]
  def empty[T]: DiffList[T] = ???
  def append[T](k: DiffList[T], elem: T): DiffList[T] = ???
  def toList[T](k: DiffList[T]): List[T] = ???
}

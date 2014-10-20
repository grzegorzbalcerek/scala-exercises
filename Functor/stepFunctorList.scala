implicit object FunctorList extends Functor[List] {
  override def map[A,B](list: List[A])(g: A => B): List[B] =
    list match {
      case Nil => Nil
      case h :: t => g(h) :: map(t)(g)
    }
}

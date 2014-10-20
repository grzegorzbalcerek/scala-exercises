implicit object MonadList extends Monad[List] {
  override def pure[A](a: A): List[A] = List(a)
  override def flatMap[A,B](as: List[A])(g: A => List[B]): List[B] =
    as match {
      case x :: xs => g(x) ++ flatMap(xs)(g)
      case _ => Nil
    }
}

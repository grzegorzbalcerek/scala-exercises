implicit object ApplicList extends Applic[List] {
  override def pure[A](a: A): List[A] = List(a)
  override def ap[A,B](as: List[A])(gs: List[A => B]): List[B] =
    gs match {
      case f :: fs => Functor.FunctorList.map(as)(f) ++ ap(as)(fs)
      case _ => Nil
    }
}

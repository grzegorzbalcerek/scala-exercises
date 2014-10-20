implicit object FunctorOption extends Functor[Option] {
  override def map[A,B](option: Option[A])(g: A => B): Option[B] =
    option match {
      case None => None
      case Some(a) => Some(g(a))
    }
}

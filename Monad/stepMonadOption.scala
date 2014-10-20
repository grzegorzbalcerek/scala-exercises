implicit object MonadOption extends Monad[Option] {
  override def pure[A](a: A): Option[A] = Some(a)
  override def flatMap[A,B](m: Option[A])(g: A => Option[B]): Option[B] =
    m match {
      case Some(a) => g(a)
      case None => None
    }
}

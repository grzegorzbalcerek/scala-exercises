implicit object ApplicOption extends Applic[Option] {
  override def pure[A](a: A): Option[A] = Some(a)
  override def ap[A,B](option: Option[A])(g: Option[A => B]): Option[B] =
    (option,g) match {
      case (Some(a),Some(h)) => Some(h(a))
      case _ => None
    }
}

implicit object TraversOption extends Travers[Option] {
  override def traverse[F[_],A,B](t: Option[A])(f: A => F[B])(implicit applic: Applic[F]): F[Option[B]] = t match {
    case None => applic.pure(None)
    case Some(x) => applic.ap(f(x))(applic.pure( (b:B) => Some(b) ))
  }
}

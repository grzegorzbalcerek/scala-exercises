implicit object TraversId extends Travers[Id] {
  override def traverse[F[_],A,B](t: Id[A])(f: A => F[B])(implicit applic: Applic[F]): F[Id[B]] =
    applic.ap(f(t.id))(applic.pure( (b:B) => Id(b) ))
}

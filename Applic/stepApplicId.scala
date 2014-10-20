implicit object ApplicId extends Applic[Id] {
  override def pure[A](a: A): Id[A] = Id(a)
  override def ap[A,B](applic: Id[A])(g: Id[A => B]): Id[B] = Id(g.id(applic.id))
}

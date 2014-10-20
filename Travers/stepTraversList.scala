implicit object TraversList extends Travers[List] {
  override def traverse[F[_],A,B](t: List[A])(f: A => F[B])(implicit applic: Applic[F]): F[List[B]] = t match {
    case Nil => applic.pure(Nil)
    case x :: xs => applic.ap(traverse(xs)(f))(applic.ap(f(x))(applic.pure( (b:B) => (bs:List[B]) => b::bs )))
  }
}

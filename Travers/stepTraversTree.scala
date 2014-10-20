implicit object TraversTree extends Travers[Tree] {
  override def traverse[F[_],A,B](t: Tree[A])(f: A => F[B])(implicit applic: Applic[F]): F[Tree[B]] = t match {
    case Leaf => applic.pure(Leaf)
    case Node(left, elem, right) =>
      applic.ap(traverse(left)(f))(applic.ap(f(elem))(applic.ap(traverse(right)(f))(applic.pure( (r:Tree[B]) => (e:B) => (l:Tree[B]) => Node(l,e,r) ))))
  }
}

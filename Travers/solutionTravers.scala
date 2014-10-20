import language.higherKinds
trait Travers[T[_]] extends Functor[T] with Foldable[T] {
  def traverse[F[_]:Applic,A,B](t: T[A])(f: A => F[B]): F[T[B]]
  override def map[A,B](functor: T[A])(g: A => B): T[B] =
    traverse(functor)((a:A) => Applic.ApplicId.pure(g(a)))(Applic.ApplicId).id
  override def foldMap[A,B:Monoid](foldable: T[A])(f: A => B): B = {
    case class Const[B,A](unConst: B)
    type ConstB[X]=Const[B,X]
    val monoid = implicitly[Monoid[B]]
    implicit val constApplic = new Applic[ConstB] {
      override def pure[A](a: A): Const[B,A] = Const(monoid.mempty)
      override def ap[A,C](b: Const[B,A])(f: Const[B,A => C]): Const[B,C] =     
        Const(monoid.mappend(b.unConst,f.unConst))
    }
    traverse[ConstB,A,B](foldable)(a => Const[B,B](f(a))).unConst
  }
}
object Travers {
  def traverse[T[_]:Travers,F[_]:Applic,A,B](t: T[A])(f: A => F[B]): F[T[B]] =
    implicitly[Travers[T]].traverse(t)(f)
  def sequence[T[_]:Travers,F[_]:Applic,A](t: T[F[A]]): F[T[A]] =
    implicitly[Travers[T]].traverse(t)(identity)
  implicit object TraversId extends Travers[Id] {
    override def traverse[F[_],A,B](t: Id[A])(f: A => F[B])(implicit applic: Applic[F]): F[Id[B]] =
      applic.ap(f(t.id))(applic.pure( (b:B) => Id(b) ))
  }
  implicit object TraversOption extends Travers[Option] {
    override def traverse[F[_],A,B](t: Option[A])(f: A => F[B])(implicit applic: Applic[F]): F[Option[B]] = t match {
      case None => applic.pure(None)
      case Some(x) => applic.ap(f(x))(applic.pure( (b:B) => Some(b) ))
    }
  }
  implicit object TraversList extends Travers[List] {
    override def traverse[F[_],A,B](t: List[A])(f: A => F[B])(implicit applic: Applic[F]): F[List[B]] = t match {
      case Nil => applic.pure(Nil)
      case x :: xs => applic.ap(traverse(xs)(f))(applic.ap(f(x))(applic.pure( (b:B) => (bs:List[B]) => b::bs )))
    }
  }
  implicit object TraversTree extends Travers[Tree] {
    override def traverse[F[_],A,B](t: Tree[A])(f: A => F[B])(implicit applic: Applic[F]): F[Tree[B]] = t match {
      case Leaf => applic.pure(Leaf)
      case Node(left, elem, right) =>
        applic.ap(traverse(left)(f))(applic.ap(f(elem))(applic.ap(traverse(right)(f))(applic.pure( (r:Tree[B]) => (e:B) => (l:Tree[B]) => Node(l,e,r) ))))
    }
  }
}

import language.higherKinds
case class ZipList[A](list: List[A]) extends AnyVal
case class Id[A](id: A)
trait Applic[F[_]] extends Functor[F] {
  def pure[A](a: A): F[A]
  def ap[A,B](applic: F[A])(g: F[A => B]): F[B]
  override def map[A,B](functor: F[A])(g: A => B): F[B] =
    ap(functor)(pure(g))
}
object Applic {
  def pure[F[_]:Applic,A](a: A): F[A] =
    implicitly[Applic[F]].pure(a)
  def ap[F[_]:Applic,A,B](a: F[A])(g: F[A => B]): F[B] =
    implicitly[Applic[F]].ap(a)(g)
  implicit object ApplicId extends Applic[Id] {
    override def pure[A](a: A): Id[A] = Id(a)
    override def ap[A,B](applic: Id[A])(g: Id[A => B]): Id[B] = Id(g.id(applic.id))
  }
  implicit object ApplicOption extends Applic[Option] {
    override def pure[A](a: A): Option[A] = Some(a)
    override def ap[A,B](option: Option[A])(g: Option[A => B]): Option[B] =
      (option,g) match {
        case (Some(a),Some(h)) => Some(h(a))
        case _ => None
      }
  }
  implicit object ApplicList extends Applic[List] {
    override def pure[A](a: A): List[A] = List(a)
    override def ap[A,B](as: List[A])(gs: List[A => B]): List[B] =
      gs match {
        case f :: fs => Functor.FunctorList.map(as)(f) ++ ap(as)(fs)
        case _ => Nil
      }
  }
  implicit object ApplicZipList extends Applic[ZipList] {
    override def pure[A](a: A): ZipList[A] = ZipList(List(a))
    override def ap[A,B](as: ZipList[A])(gs: ZipList[A => B]): ZipList[B] =
      (as.list,gs.list) match {
        case (x :: xs, f :: fs) => ZipList(f(x) :: ap(ZipList(xs))(ZipList(fs)).list)
        case _ => ZipList(Nil)
      }
  }
  def lift2[F[_],A,B,C](a: F[A], b: F[B])(g: (A,B) => C)(implicit applic: Applic[F]): F[C] =
    applic.ap(b)(applic.map(a)(g.curried))
  def lift3[F[_],A,B,C,D](a: F[A], b: F[B], c: F[C])(g: (A,B,C) => D)(implicit applic: Applic[F]): F[D] =
    applic.ap(c)(applic.ap(b)(applic.map(a)(g.curried)))
}

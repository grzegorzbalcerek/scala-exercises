import language.higherKinds
trait Monad[M[_]] extends Applic[M] {
  def flatMap[A,B](m: M[A])(g: A => M[B]): M[B]
  override def map[A,B](functor: M[A])(g: A => B): M[B] =
    flatMap(functor)(a => pure(g(a)))
  override def ap[A,B](applic: M[A])(g: M[A => B]): M[B] =
    flatMap(applic)(a => flatMap(g)(h => pure(h(a))))
  //  flatMap(g)(f => flatMap(a)(x => pure(f(x))))
}
object Monad {
  def flatMap[M[_]:Monad,A,B](m: M[A])(g: A => M[B]): M[B] =
    implicitly[Monad[M]].flatMap(m)(g)
  implicit object MonadOption extends Monad[Option] {
    override def pure[A](a: A): Option[A] = Some(a)
    override def flatMap[A,B](m: Option[A])(g: A => Option[B]): Option[B] =
      m match {
        case Some(a) => g(a)
        case None => None
      }
  }
  implicit object MonadList extends Monad[List] {
    override def pure[A](a: A): List[A] = List(a)
    override def flatMap[A,B](as: List[A])(g: A => List[B]): List[B] =
      as match {
        case x :: xs => g(x) ++ flatMap(xs)(g)
        case _ => Nil
      }
  }
  def join[M[_],A,B](mm: M[M[A]])(implicit m: Monad[M]): M[A] =
    m.flatMap(mm)(identity)
  def foldM[M[_],A,B](list: List[A])(v: B)(g: (B,A) => M[B])(implicit m: Monad[M]): M[B] = list match {
    case Nil => m.pure(v)
    case x :: xs => m.flatMap(g(v,x)){ b => foldM(xs)(b)(g) }
  }
}

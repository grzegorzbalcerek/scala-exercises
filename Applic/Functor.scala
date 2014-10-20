import language.higherKinds
trait Functor[F[_]] {
  def map[A,B](functor: F[A])(g: A => B): F[B]
}
object Functor {
  def map[F[_]:Functor,A,B](a: F[A])(g: A => B): F[B] =
    implicitly[Functor[F]].map(a)(g)
  implicit object FunctorOption extends Functor[Option] {
    override def map[A,B](option: Option[A])(g: A => B): Option[B] =
      option match {
        case None => None
        case Some(a) => Some(g(a))
      }
  }
  implicit object FunctorList extends Functor[List] {
    override def map[A,B](list: List[A])(g: A => B): List[B] =
      list match {
        case Nil => Nil
        case h :: t => g(h) :: map(t)(g)
      }
  }
  implicit object FunctorTree extends Functor[Tree] {
    override def map[A,B](tree: Tree[A])(g: A => B): Tree[B] =
      tree match {
        case Leaf => Leaf
        case Node(left, elem, right) => Node(map(left)(g), g(elem), map(right)(g))
      }
  }
}

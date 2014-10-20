sealed abstract class Tree[+A]
case object Leaf extends Tree[Nothing] {
  override def toString = "."
}
final case class Node[A](left: Tree[A], elem: A, right: Tree[A]) extends Tree[A] {
  override def toString = s"<$left $elem $right>"
}
case class Product(value: Int) extends AnyVal
case class Anything(value: Boolean) extends AnyVal
case class All(value: Boolean) extends AnyVal
trait Monoid[T] {
  def mempty: T
  def mappend(a: T, b: T): T
}
object Monoid {
  implicit object MonoidString extends Monoid[String] {
    override def mempty = ""
    override def mappend(a: String, b: String) = a + b
  }
  implicit object MonoidInt extends Monoid[Int] {
    override def mempty = 0
    override def mappend(a: Int, b: Int) = a + b
  }
  implicit object MonoidProduct extends Monoid[Product] {
    override def mempty = Product(1)
    override def mappend(a: Product, b: Product) = Product(a.value * b.value)
  }
  implicit object MonoidAnything extends Monoid[Anything] {
    override def mempty = Anything(false)
    override def mappend(a: Anything, b: Anything) = Anything(a.value || b.value)
  }
  implicit object MonoidAll extends Monoid[All] {
    override def mempty = All(true)
    override def mappend(a: All, b: All) = All(a.value && b.value)
  }
  implicit def MonoidList[S] = new Monoid[List[S]] {
    override def mempty = Nil
    override def mappend(a: List[S], b: List[S]) = a ++ b
  }
  implicit def MonoidTuple2[S,T](implicit ms: Monoid[S], mt: Monoid[T]) = new Monoid[(S,T)] {
    override def mempty = (ms.mempty,mt.mempty)
    override def mappend(a: (S,T), b: (S,T)) = (ms.mappend(a._1, b._1), mt.mappend(a._2, b._2))
  }
  implicit def MonoidTree[T](implicit mt: Monoid[T]) = new Monoid[Tree[T]] {
    override def mempty: Tree[T] = Leaf
    override def mappend(a: Tree[T], b: Tree[T]) = (a,b) match {
      case (Node(aleft, aelem, aright), Node(bleft, belem, bright)) =>
        Node(mappend(aleft,bleft), mt.mappend(aelem,belem), mappend(aright,bright))
      case (Leaf, t) => t
      case (t, Leaf) => t
    }
  }
  def msum[T](list: T*)(implicit m: Monoid[T]): T =
    list.foldLeft(m.mempty)(m.mappend)
}

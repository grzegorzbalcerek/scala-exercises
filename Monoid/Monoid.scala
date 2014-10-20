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
  def msum[T](list: T*)(implicit m: Monoid[T]): T = ???
}

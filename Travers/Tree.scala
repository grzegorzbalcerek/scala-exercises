sealed abstract class Tree[+A]
case object Leaf extends Tree[Nothing] {
  override def toString = "."
}
final case class Node[A](left: Tree[A], elem: A, right: Tree[A]) extends Tree[A] {
  override def toString = s"<$left $elem $right>"
}

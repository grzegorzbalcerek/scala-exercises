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

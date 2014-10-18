abstract class Figure {
  def area: Double
  def circum: Double
}
class Rectangle(val a: Double, val b: Double) extends Figure {
  override def toString = s"Rectangle($a,$b)"
  override def area = a*b
  override def circum = 2*(a+b)
  def canEqual(other: Any) = other.isInstanceOf[Rectangle]
  override def equals(other: Any) =
    if (other.isInstanceOf[Rectangle]) {
      val otherRectangle = other.asInstanceOf[Rectangle]
      otherRectangle.canEqual(this) &&
      this.a == otherRectangle.a &&
      this.b == otherRectangle.b
    }
    else false
  override def hashCode = (a + b).toInt
}
class Triangle(val a: Double, val b: Double, val c: Double) extends Figure {
  override def toString = s"Triangle($a,$b,$c)"
  def area = Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))/4
  def circum = a+b+c
  def canEqual(other: Any) = other.isInstanceOf[Triangle]
  override def equals(other: Any) =
    if (other.isInstanceOf[Triangle]) {
      val otherTriangle = other.asInstanceOf[Triangle]
      otherTriangle.canEqual(this) &&
      this.a == otherTriangle.a &&
      this.b == otherTriangle.b &&
      this.c == otherTriangle.c
    }
    else false
  override def hashCode = (a + b + c).toInt
}
class Square(a: Double) extends Rectangle(a,a) {
  override def toString = s"Square($a)"
}
object Rectangle {
  def apply(a: Double, b: Double) = new Rectangle(a,b)
}
object Triangle {
  def apply(a: Double, b: Double, c: Double) = new Triangle(a,b,c)
}
object Square {
  def apply(a: Double) = new Square(a)
  def withCircum(circum: Double) = new Square(circum/4)
}

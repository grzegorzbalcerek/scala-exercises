class Rectangle(val a: Double, val b: Double) extends Figure {
  override def toString = s"Rectangle($a,$b)"
  override def area = a*b
  override def circum = 2*(a+b)
}

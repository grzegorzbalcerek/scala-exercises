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

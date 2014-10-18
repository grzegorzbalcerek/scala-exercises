object FiguresTest extends App {

  val r: Figure = new Rectangle(3,4)
  assert(r.area == 12.0, "r.area == 12.0")
  assert(r.circum == 14.0, "r.circum == 14.0")

  val t: Figure = new Triangle(3,4,5)
  assert(t.area == 6.0, "t.area == 6.0")
  assert(t.circum == 12.0, "t.circum == 12.0")

  val s: Rectangle = new Square(4)
  assert(s.area == 16.0, "s.area == 16.0")
  assert(s.circum == 16.0, "s.circum == 16.0")

  assert(Rectangle(3,4) == new Rectangle(3,4), "Rectangle(3,4) == new Rectangle(3,4)")
  assert(Triangle(5,4,3) == new Triangle(5,4,3), "Triangle(5,4,3) == new Triangle(5,4,3)")
  assert(Square(5) == new Square(5), "Square(5) == new Square(5)")
  assert(Square.withCircum(16) == new Square(4.0), "Square.withCircum(16) == new Square(4.0)")

  assert(new Rectangle(3,4) != new Triangle(3,4,5), "new Rectangle(3,4) != new Triangle(3,4,5)")
  assert(new Triangle(3,4,5) != new Rectangle(3,4), "new Triangle(3,4,5) != new Rectangle(3,4)")
  assert(new Rectangle(3,4) != new Square(4), "new Rectangle(3,4) != new Square(4)")
  assert(new Square(4) != new Triangle(3,4,5), "new Square(4) != new Triangle(3,4,5)")
  assert(new Rectangle(3,4) != Rectangle(4,4), "new Rectangle(3,4) != Rectangle(4,4)")
  assert(Square(4) != Square(5), "Square(4) != Square(5)")
  assert(new Rectangle(3,4) == Rectangle(3,4), "new Rectangle(3,4) == Rectangle(3,4)")
  assert(Square(4) == Rectangle(4,4), "Square(4) == Rectangle(4,4)")
  assert(Rectangle(4,4) == Square(4), "Rectangle(4,4) == Square(4)")
  assert(Square(4) == Square.withCircum(16), "Square(4) == Square.withCircum(16)")
  assert(Square.withCircum(16) == new Square(4) { val anonymous = true }, "Square.withCircum(16) == new Square(4) { val anonymous = true }")
  assert(new Square(4) { val anonymous = true } == Square.withCircum(16), "new Square(4) { val anonymous = true } == Square.withCircum(16)")

}

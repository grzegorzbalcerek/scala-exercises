case class Point(x: Int, y: Int)
object Board {
  def field(point: Point): Either[String, (Int,Int)] = point match {
    case FieldClicked(col, row) => Right((row,col))
    case _ => Left("out of board")
  }
}
object FieldClicked {
  def unapply(point: Point): Option[(Int,Int)] = ???
}

case class Point(x: Int, y: Int)
object Board {
  def field(point: Point): Either[String, (Int,Int)] = point match {
    case FieldClicked(col, row) => Right((row,col))
    case _ => Left("out of board")
  }
}
object FieldClicked {
  def unapply(point: Point): Option[(Int,Int)] = {
    val fieldSize = 100
    if (point.x < 0 || point.y < 0) return None
    val col = point.x / fieldSize
    val row = point.y / fieldSize
    if (col < 3 && row < 3) Some((col+1,row+1))
    else None
  }
}

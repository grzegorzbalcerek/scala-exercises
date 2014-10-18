class Triangle(val a: Double, val b: Double, val c: Double) extends Figure {
  override def toString = s"Triangle($a,$b,$c)"
  def area = Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))/4
  def circum = a+b+c
}

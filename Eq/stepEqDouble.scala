implicit object EqDouble extends Eq[Double] {
  override def isEq(x:Double,y:Double) = x == y
}

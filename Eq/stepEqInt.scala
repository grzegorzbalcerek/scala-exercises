implicit object EqInt extends Eq[Int] {
  override def isEq(x:Int,y:Int) = x == y
}

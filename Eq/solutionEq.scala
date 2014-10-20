trait Eq[T] {
  def isEq(a:T,b:T):Boolean
  def notEq(a:T,b:T) = !isEq(a,b)
}
case class Mod4(value: Int) extends AnyVal
object Mod4 {
  implicit object EqMod4 extends Eq[Mod4] {
    override def isEq(x:Mod4,y:Mod4) = (x.value % 4) == (y.value % 4)
  }
}
object Eq {
  def isEq[T](x:T,y:T)(implicit e: Eq[T]): Boolean = e.isEq(x,y)
  def notEq[T:Eq](a:T,b:T): Boolean = implicitly[Eq[T]].notEq(a,b)
  def allEq[T](xs:T*)(implicit e: Eq[T]): Boolean =
    if (xs.isEmpty) true
    else {
      val x = xs.head
      xs.tail.foldLeft(true){ case (acc,y) => acc && e.isEq(x,y) }
    }
  implicit class EqInfix[T](a:T)(implicit e:Eq[T]) {
    def ===(b:T):Boolean = e.isEq(a,b)
    def =/=(b:T):Boolean = e.notEq(a,b)
  }
  implicit object EqInt extends Eq[Int] {
    override def isEq(x:Int,y:Int) = x == y
  }
  implicit object EqDouble extends Eq[Double] {
    override def isEq(x:Double,y:Double) = x == y
  }
  implicit def optionEq[T:Eq] = new Eq[Option[T]] {
    def isEq(a: Option[T], b: Option[T]): Boolean =
      (a,b) match {
        case (Some(x),Some(y)) => implicitly[Eq[T]].isEq(x,y)
        case (None,None) => true
        case _ => false
      }
  }
}

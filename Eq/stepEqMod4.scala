case class Mod4(value: Int) extends AnyVal
object Mod4 {
  implicit object EqMod4 extends Eq[Mod4] {
    override def isEq(x:Mod4,y:Mod4) = (x.value % 4) == (y.value % 4)
  }
}

object Complex {
  def j(im: Double) = new Complex(0.0, im)
}
case class Complex(re: Double, im: Double = 0.0)
object j extends Complex(0.0, 1.0)

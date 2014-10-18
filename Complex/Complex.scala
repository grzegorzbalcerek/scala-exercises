object Complex {
  def j(im: Double) = new Complex(0.0, im)
  import language.implicitConversions
  implicit def double2complex(x: Double) = new Complex(x, 0.0)
}
case class Complex(re: Double, im: Double = 0.0) {
  def +(that: Complex):Complex = Complex(this.re+that.re, this.im+that.im)
  def -(that: Complex):Complex = Complex(this.re-that.re, this.im-that.im)
  def +(n: Double):Complex = this+Complex(n)
  def -(n: Double):Complex = this-Complex(n)
  def unary_- :Complex = Complex(0.0)-this
}
object j extends Complex(0.0, 1.0)

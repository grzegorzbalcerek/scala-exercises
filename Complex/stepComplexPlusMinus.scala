def +(that: Complex):Complex = Complex(this.re+that.re, this.im+that.im)
def -(that: Complex):Complex = Complex(this.re-that.re, this.im-that.im)
def +(n: Double):Complex = this+Complex(n)
def -(n: Double):Complex = this-Complex(n)
def unary_- :Complex = Complex(0.0)-this

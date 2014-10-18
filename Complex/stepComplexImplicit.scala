import language.implicitConversions
implicit def double2complex(x: Double) = new Complex(x, 0.0)

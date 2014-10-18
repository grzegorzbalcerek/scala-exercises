def canEqual(other: Any) = other.isInstanceOf[Triangle]
override def equals(other: Any) =
  if (other.isInstanceOf[Triangle]) {
    val otherTriangle = other.asInstanceOf[Triangle]
    otherTriangle.canEqual(this) &&
    this.a == otherTriangle.a &&
    this.b == otherTriangle.b &&
    this.c == otherTriangle.c
  }
  else false
override def hashCode = (a + b + c).toInt

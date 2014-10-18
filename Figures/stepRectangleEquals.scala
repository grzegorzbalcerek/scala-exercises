def canEqual(other: Any) = other.isInstanceOf[Rectangle]
override def equals(other: Any) =
  if (other.isInstanceOf[Rectangle]) {
    val otherRectangle = other.asInstanceOf[Rectangle]
    otherRectangle.canEqual(this) &&
    this.a == otherRectangle.a &&
    this.b == otherRectangle.b
  }
  else false
override def hashCode = (a + b).toInt

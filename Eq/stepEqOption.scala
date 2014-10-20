implicit def optionEq[T:Eq] = new Eq[Option[T]] {
  def isEq(a: Option[T], b: Option[T]): Boolean =
    (a,b) match {
      case (Some(x),Some(y)) => implicitly[Eq[T]].isEq(x,y)
      case (None,None) => true
      case _ => false
    }
}

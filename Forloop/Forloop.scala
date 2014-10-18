object Forloop {
  def forloop(init: Unit, cond: => Boolean, next: => Unit)(body: => Unit) {
    while(cond) {
      body
      next
    }
  }
}

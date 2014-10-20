import language.reflectiveCalls
object Using {
  def using[T <: { def close() }](closable: T)(action: T => Unit) = ???
}
class Resource(name:String) {
  def close() {
    println("Closing "+name)
    if(name startsWith "x") throw new RuntimeException("Unable to close "+name)
  }
  def use = println("Using "+name)
}

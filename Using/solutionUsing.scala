import language.reflectiveCalls
object Using {
  def using[T <: { def close() }](closable: T)(action: T => Unit) {
    var ex: Throwable = null
    try {
      action(closable)
    }
    catch {
      case e: Throwable => ex = e
    }
    finally {
      try {
        closable.close()
      }
      catch {
        case e: Throwable if ex == null => ex = e
        case e: Throwable => ex.initCause(e)
      }
      finally {
        if (ex != null) throw ex
      }
    }
  }
}
class Resource(name:String) {
  def close() {
    println("Closing "+name)
    if(name startsWith "x") throw new RuntimeException("Unable to close "+name)
  }
  def use = println("Using "+name)
}

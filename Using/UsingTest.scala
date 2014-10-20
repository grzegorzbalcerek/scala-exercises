object UsingTest extends App {
  import Using._
  try {
    using(new Resource("resource1"))( _.use )
  } catch { case e: Exception => println(s"Exception: e.getMessage") }
  try {
    using(new Resource("resource2"))( x => 1/0 )
  } catch { case e: Exception => println(s"Exception: e.getMessage") }
  try {
    using(new Resource("xresource3"))( _.use )
  } catch { case e: Exception => println(s"Exception: e.getMessage") }
}

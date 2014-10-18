object ForloopTest extends App {
  import Forloop.forloop
  var j = 0
  forloop (j = 1, j <= 10, j += 1) {
    println("" + j + "*" + j + " = " + (j*j))
  }
}

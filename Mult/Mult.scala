object Mult extends App {
  def show(n: Int) = {
    var j = n.toString.length;
    var res = n.toString
    while (j < 4) {
      res = " " + res
      j = j + 1
    }
    res
  }
  var row = 1
  while (row <= 10) {
    var col = 1
    while(col <= 10) {
      print(show(row * col))
      col = col + 1
    }
    row = row + 1
    println
  }
}

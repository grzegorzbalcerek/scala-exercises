object FieldClickedTest extends App {
  import Board._
  assert(field(Point(50,50)) == Right((1,1)), "field(Point(50,50)) == Right((1,1))")
  assert(field(Point(235,123)) == Right((2,3)), "field(Point(235,123)) == Right((2,3))")
  assert(field(Point(335,123)) == Left("out of board"), "field(Point(335,123)) == Left(out of board)")
  assert(field(Point(-10,55)) == Left("out of board"), "field(Point(-10,55)) == Left(out of board)")
}

object FibstreamTest extends App {
  assert(Fibstream.fibstream.take(10).force == Stream(0, 1, 1, 2, 3, 5, 8, 13, 21, 34),
    "Fibstream.fibstream.take(10).force == Stream(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)")
}

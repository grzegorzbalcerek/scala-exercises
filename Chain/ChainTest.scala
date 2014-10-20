object ChainTest extends App {
  import Dict._
  assert(translate("house") == Some("dom"), "translate(house) == Some(dom)")
  assert(translate("red") == Some("czerwony"), "translate(red) == Some(czerwony)")
  assert(translate("apple") == None, "translate(apple) == None")
}

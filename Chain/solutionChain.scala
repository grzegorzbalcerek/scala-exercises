object Dict {
  def nouns(word: String): Option[String] = word match {
    case "dog" => Some("pies")
    case "house" => Some("dom")
    case _ => None
  }
  def colors(word: String): Option[String] = word match {
    case "red" => Some("czerwony")
    case "green" => Some("zielony")
    case _ => None
  }
  val translate = Chain.chain(nouns, colors)
}
object Chain {
  def chain[A,B](fs: (A => Option[B])*): A => Option[B] = (a: A) => 
    if (fs.isEmpty) None
    else fs.head(a) match {
      case None => chain(fs.tail: _*)(a)
      case x => x
    }
}

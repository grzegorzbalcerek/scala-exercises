val l = "To be or not to be".split(" ").map(_.toLowerCase).foldLeft(Map[String,Int]()){case (map, str) => map.updated(str, 1+map.getOrElse(str,0)) }

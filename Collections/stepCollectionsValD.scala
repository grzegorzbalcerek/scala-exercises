val d = (1 to 10).map(x => (1 to 10).map(y => (x*y).toString.reverse.padTo(4,' ').reverse).mkString(" ")).mkString("\n")

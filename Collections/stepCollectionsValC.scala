val c = """sc.l.""".zip(1 to 10).filter{case (x,_) => x.isLetter}.map(_.swap).toMap
val c2 = """sc.l.""".zipWithIndex.filter{case (x,_) => x.isLetter}.map{case (a,b) => (b+1,a)}.toMap

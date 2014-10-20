object Collections {
  val a = "12d334-8".filter(_.isDigit).map(_-'0').sum
  val b = List(1,2,-1,3,-6,4).filter(_>0).reverse
  val c = """sc.l.""".zip(1 to 10).filter{case (x,_) => x.isLetter}.map(_.swap).toMap
  val c2 = """sc.l.""".zipWithIndex.filter{case (x,_) => x.isLetter}.map{case (a,b) => (b+1,a)}.toMap
  val d = (1 to 10).map(x => (1 to 10).map(y => (x*y).toString.reverse.padTo(4,' ').reverse).mkString(" ")).mkString("\n")
  val e = List(Some(1), Some(0), None, Some(2), Some(-1)).map(o => o.filter(_>0)).filterNot(_==None)
  val f = List(Left(1), Right(3), Left(2)).map(_.fold(Right(_), Left(_))):List[Either[Int,Int]]
  val f2 = List(Left(1), Right(3), Left(2)).map{case Left(x)=>Right(x) case Right(y)=>Left(y)}:List[Either[Int,Int]]
  val g = (1 to 10).foldLeft(0)(_+_)
  val g2 = (1 to 10).foldRight(0)(_+_)
  val h = (1 to 10).foldLeft(1)(_*_)
  val h2 = (1 to 10).foldRight(1)(_*_)
  val i = (1 to 10).foldLeft(List(1))( (lst,n) => lst.head*n :: lst ).reverse.tail
  val j = (1 to 10).foldLeft((0,1)){ case ((a,b),x) => (b,a+b) }._1
  val k = List(1,2,-1,3,-6,4).foldLeft((0,0)){case ((m,p),e) => if (e>0) (m,p+e) else (m+e,p)}
  val l = "To be or not to be".split(" ").map(_.toLowerCase).foldLeft(Map[String,Int]()){case (map, str) => map.updated(str, 1+map.getOrElse(str,0)) }
}

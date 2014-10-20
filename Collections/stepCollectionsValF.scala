val f = List(Left(1), Right(3), Left(2)).map(_.fold(Right(_), Left(_))):List[Either[Int,Int]]
val f2 = List(Left(1), Right(3), Left(2)).map{case Left(x)=>Right(x) case Right(y)=>Left(y)}:List[Either[Int,Int]]

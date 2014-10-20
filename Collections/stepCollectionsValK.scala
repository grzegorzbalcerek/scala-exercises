val k = List(1,2,-1,3,-6,4).foldLeft((0,0)){case ((m,p),e) => if (e>0) (m,p+e) else (m+e,p)}

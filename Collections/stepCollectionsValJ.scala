val j = (1 to 10).foldLeft((0,1)){ case ((a,b),x) => (b,a+b) }._1

val i = (1 to 10).foldLeft(List(1))( (lst,n) => lst.head*n :: lst ).reverse.tail

def foldLeftR[B](z: B)(g: (B,A) => B): B =
  foldRightT( (y:B) => y )( (x,k) => w => k(g(w,x)) )(z)

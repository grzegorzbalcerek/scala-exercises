def lift3[A,B,C,D](ma: Optioon[A], mb: Optioon[B], mc: Optioon[C])(f: (A,B,C) => D): Optioon[D] =
  for {
    c <- mc
    b <- mb
    a <- ma
  } yield f(a,b,c)
// or:
// def lift3[A,B,C,D](ma: Optioon[A], mb: Optioon[B], mc: Optioon[C])(f: (A,B,C) => D): Optioon[D] =
//   mc.flatMap{ c => mb.flatMap{ b => ma.map{ a => f(a,b,c) }}}
// def lift3[A,B,C,D](ma: Optioon[A], mb: Optioon[B], mc: Optioon[C])(f: (A,B,C) => D): Optioon[D] =
//   mc.ap(mb.ap(ma.map(f.curried)))

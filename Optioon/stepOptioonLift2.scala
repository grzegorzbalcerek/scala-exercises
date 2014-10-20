def lift2[A,B,C](ma: Optioon[A], mb: Optioon[B])(f: (A,B) => C): Optioon[C] =
  for {
    b <- mb
    a <- ma
  } yield f(a,b)
// or:
// def lift2[A,B,C](ma: Optioon[A], mb: Optioon[B])(f: (A,B) => C): Optioon[C] =
//   mb.flatMap{ b => ma.map{ a => f(a,b) }}
// def lift2[A,B,C](ma: Optioon[A], mb: Optioon[B])(f: (A,B) => C): Optioon[C] =
//   mb.ap(ma.map(f.curried))

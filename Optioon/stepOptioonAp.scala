def ap[B](f: Optioon[A => B]): Optioon[B] = this match {
  case Noone => Noone
  case Soome(a) => f.map{ fun => fun(a) }
}
// or:
// def ap[B](f: Optioon[A => B]): Optioon[B] = for ( a <- this; fun <- f ) yield fun(a)
// def ap[B](f: Optioon[A => B]): Optioon[B] = for ( fun <- f; a <- this ) yield fun(a)
// def ap[B](f: Optioon[A => B]): Optioon[B] = flatMap{ a => f.map{ fun => fun(a) } }
// def ap[B](f: Optioon[A => B]): Optioon[B] = f.flatMap{ fun => map{ a => fun(a) } }

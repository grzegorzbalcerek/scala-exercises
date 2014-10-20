override def foldMap[A,B:Monoid](foldable: T[A])(f: A => B): B = {
  case class Const[B,A](unConst: B)
  type ConstB[X]=Const[B,X]
  val monoid = implicitly[Monoid[B]]
  implicit val constApplic = new Applic[ConstB] {
    override def pure[A](a: A): Const[B,A] = Const(monoid.mempty)
    override def ap[A,C](b: Const[B,A])(f: Const[B,A => C]): Const[B,C] =     
      Const(monoid.mappend(b.unConst,f.unConst))
  }
  traverse[ConstB,A,B](foldable)(a => Const[B,B](f(a))).unConst
}

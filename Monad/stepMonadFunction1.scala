implicit def MonadFunction1[T] = new Monad[({type F[X]=Function1[T,X]})#F] {
  override def pure[A](a: A): T => A = (x) => a
  override def flatMap[A,B](m: T => A)(g: A => (T => B)): T => B = (t) => g(m(t))(t)
}

implicit object ApplicZipList extends Applic[ZipList] {
  override def pure[A](a: A): ZipList[A] = ZipList(List(a))
  override def ap[A,B](as: ZipList[A])(gs: ZipList[A => B]): ZipList[B] =
    (as.list,gs.list) match {
      case (x :: xs, f :: fs) => ZipList(f(x) :: ap(ZipList(xs))(ZipList(fs)).list)
      case _ => ZipList(Nil)
    }
}

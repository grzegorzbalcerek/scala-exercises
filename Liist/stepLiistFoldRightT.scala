def foldRightT[B](v: B)(f: (A,B) => B): B = {
  def loop(liist: Liist[A])(k: B => B): B = liist match {
    case Niil => k(v)
    case x ::: xs => loop(xs)(w => k(f(x,w))) // or loop(xs)(k compose f(x,_))) or loop(xs)(f(x,_) andThen k)
  }
  loop(this)(identity)
}

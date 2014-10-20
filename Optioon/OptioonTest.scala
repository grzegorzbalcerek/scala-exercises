object OptioonTest extends App {
  val soome2: Optioon[Int] = Soome(2)
  val nooneS: Optioon[Symbol] = Noone
  assert(soome2.isEmpty == false, "soome2.isEmpty == false")
  assert(nooneS.isEmpty == true, "nooneS.isEmpty == true")

  assert(nooneS.getOrElse('noone) == 'noone, "nooneS.getOrElse('noone) == 'noone")
  assert(soome2.getOrElse(5) == 2, "soome2.getOrElse(5) == 2")

  val nooneI: Optioon[Int] = Noone
  assert(soome2.map(_+4) == Soome(6), "soome2.map(_+4) == Soome(6)")
  assert(nooneI.map(_+4) == Noone, "nooneI.map(_+4) == Noone")

  assert(soome2.flatMap(x => Soome(x+4)) == Soome(6), "soome2.flatMap(x => Soome(x+4)) == Soome(6)")
  assert(nooneI.flatMap(x => Soome(x+4)) == Noone, "nooneI.flatMap(x => Soome(x+4)) == Noone")

  assert(soome2.withFilter(_<2) == Noone, "soome2.withFilter(_<2) == Noone")
  assert(soome2.withFilter(_>=2) == Soome(2), "soome2.withFilter(_>=2) == Soome(2)")
  assert(nooneI.withFilter(_<2) == Noone, "nooneI.withFilter(_<2) == Noone")
  assert(nooneI.withFilter(_>=2) == Noone, "nooneI.withFilter(_>=2) == Noone")

  val soomeF: Optioon[Int=>Int] = Soome(_+5)
  assert((soome2 ap soomeF) == Soome(7), "(soome2 ap soomeF) == Soome(7)")
  assert((soome2 ap Noone) == Noone, "(soome2 ap Noone) == Noone")
  assert((nooneI ap soomeF) == Noone, "(nooneI ap soomeF) == Noone")

  import Optioon._
  val soome5: Optioon[Int] = Soome(5)
  assert(lift2(soome2,soome5)(_+_) == Soome(7), "lift2(soome2,soome5)(_+_) == Soome(7)")
  assert(lift2(soome2,nooneI)(_+_) == Noone, "lift2(soome2,nooneI)(_+_) == Noone")
  assert(lift2(nooneI,soome5)(_+_) == Noone, "lift2(nooneI,soome5)(_+_) == Noone")

  val soome4: Optioon[Int] = Soome(4)
  assert(lift3(soome2,soome5,soome4)(_+_+_) == Soome(11), "lift3(soome2,soome5,soome4)(_+_+_) == Soome(11)")
  assert(lift3(nooneI,soome5,soome4)(_+_+_) == Noone, "lift3(nooneI,soome5,soome4)(_+_+_) == Noone")
  assert(lift3(soome2,nooneI,soome4)(_+_+_) == Noone, "lift3(soome2,nooneI,soome4)(_+_+_) == Noone")
  assert(lift3(soome2,soome5,nooneI)(_+_+_) == Noone, "lift3(soome2,soome5,nooneI)(_+_+_) == Noone")

  assert(soome5.fold("", x => "*" * x) == "*****", """soome5.fold("", x => "*" * x) == *****""")
  assert(nooneI.fold("", x => "*" * x) == "", """nooneI.fold("", x => "*" * x) == "" """)

  assert(soome2.isEmpty == false, "soome2.isEmpty == false")
  assert(nooneS.isEmpty == true, "nooneS.isEmpty == true")

  assert(nooneS.getOrElse('noone) == 'noone, "nooneS.getOrElse('noone) == 'noone")
  assert(soome2.getOrElse(5) == 2, "soome2.getOrElse(5) == 2")

  assert(soome2.map(_+4) == Soome(6), "soome2.map(_+4) == Soome(6)")
  assert(nooneI.map(_+4) == Noone, "nooneI.map(_+4) == Noone")

  assert(soome2.flatMap(x => Soome(x+4)) == Soome(6), "soome2.flatMap(x => Soome(x+4)) == Soome(6)")
  assert(nooneI.flatMap(x => Soome(x+4)) == Noone, "nooneI.flatMap(x => Soome(x+4)) == Noone")

  assert(soome2.withFilter(_<2) == Noone, "soome2.withFilter(_<2) == Noone")
  assert(soome2.withFilter(_>2) == Noone, "soome2.withFilter(_>2) == Noone")
  assert(nooneI.withFilter(_<2) == Noone, "nooneI.withFilter(_<2) == Noone")
  assert(nooneI.withFilter(_>2) == Noone, "nooneI.withFilter(_>2) == Noone")

  assert((soome2 ap soomeF) == Soome(7), "(soome2 ap soomeF) == Soome(7)")
  assert((soome2 ap Noone) == Noone, "(soome2 ap Noone) == Noone")
  assert((nooneI ap soomeF) == Noone, "(nooneI ap soomeF) == Noone")
}

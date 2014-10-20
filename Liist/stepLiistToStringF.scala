def toStringF =
  foldRight("Niil"){ (elem,acc) => s"${elem.toString} ::: $acc" }

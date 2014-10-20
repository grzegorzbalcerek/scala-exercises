Functor
=======

Opis
----

Ćwiczenie dotyczy klasy typu *functor* reprezentowanej przez cechę
`Functor` z pliku *Functor.scala*.  Plik zawiera również definicje
klas `Anything` i `All` opakowujących wartości typu `Boolean`.

Funktor posiada operację `map` (inne nazwy: `fmap`; `<$>`; `Select`)
oraz spełnia prawa:

  fmap identity = identity
  fmap (g ∘ h) = (fmap g) ∘ (fmap h)

FunctorOption
-------------

Zdefiniować implementację klasy typów `Functor` dla typu `Option`.

FunctorList
-----------

Zdefiniować implementację klasy typów `Functor` dla typu `List`.

FunctorTree
-----------

Zdefiniować implementację klasy typów `Functor` dla typu `Tree`.

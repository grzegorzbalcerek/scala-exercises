Applic
======

Opis
----

Ćwiczenie dotyczy klasy typu *applicative functor* reprezentowanej
przez cechę `Applic` z pliku *Applic.scala*.

Funktor aplikatywny jest funktorem posiadającym operacje `unit` (inne
nazwy: `point`; `pure`; `return`) i `ap` (`<*>`; `⊛`) oraz
spełniającym prawa:

    pure id ⊛ u = u
    pure (∘) ⊛ u ⊛ v ⊛ w = u ⊛ (v ⊛ w)
    pure f ⊛ pure x = pure (f x)
    u ⊛ pure x = pure (λf → f x) ⊛ u

ApplicId
--------

Zdefiniować implementację klasy typów `Applic` dla typu `Id`.

ApplicOption
------------

Zdefiniować implementację klasy typów `Applic` dla typu `Option`.

ApplicMap
---------

Zaimplementować metodę `map`.

ApplicLift2
-----------

Zaimplementować metodę `lift2`.

ApplicLift3
-----------

Zaimplementować metodę `lift3`.

ApplicList
----------

Zdefiniować implementację klasy typów `Applic` dla typu `List` — ma
wykonać każdą funkcję dla każdej wartości.

ApplicZipList
-------------

Zdefiniować implementację klasy typów `Applic` dla typu `ZipList` — ma
wykonać pierwszą funkcję dla pierwszej wartości

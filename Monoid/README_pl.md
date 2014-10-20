Monoid
======

Opis
----

Ćwiczenie dotyczy klasy typu *monoid* reprezentowanej przez cechę
`Monoid` z pliku *Monoid.scala*.

Monoid posiada element neutralny `mempty` (inne nazwy: `mzero`; `0`;
`∅`) oraz dwuargumentową operację `mappend` (`madd`; `|+|`; `⊕`) oraz
spełnia prawa:

    a ⊕ 0 = a
    0 ⊕ a = a
    (a ⊕ b) ⊕ c = a ⊕ (b ⊕ c)

MonoidString
------------

Zdefiniować implementację klasy typów `Monoid` dla typu `String`.

MonoidMsum
----------

Zaimplementować metodę `msum`.

MonoidInt
---------

Zdefiniować implementację klasy typów `Monoid` dla typu `Int` —
implementacja domyślna z dodawaniem i zerem.

MonoidProduct
-------------

Zdefiniować implementację klasy typów `Monoid` dla typu `Product` —
implementacja dodatkowa dla liczb całkowitych

MonoidAnything
--------------

Zdefiniować implementację klasy typów `Monoid` dla typu `Anything`.

MonoidAll
---------

Zdefiniować implementację klasy typów `Monoid` dla typu `All`.

MonoidList
----------

Zdefiniować implementację klasy typów `Monoid` dla typu `List`.

MonoidTuple2
------------

Zdefiniować implementację klasy typów `Monoid` dla typu `Tuple2`.

MonoidTree
----------

Zdefiniować implementację klasy typów `Monoid` dla typu `Tree`.

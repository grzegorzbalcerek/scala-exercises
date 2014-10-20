Monad
=====

Opis
----

Monada jest funktorem aplikatywnym posiadającym operację `flatMap`
(inne nazwy: `bind`; `>>``; `SelectMany`) oraz spełniającym prawa:

    pure a >>= k = k a
    m >>= pure = m
    m >>= (λx → k x >>= h) = (m >>= k) >>= h

MonadOption
-----------

Zdefiniować implementację klasy typów `Monad` dla typu `Option`.

MonadMap
--------

Zaimplementować metodę `map`.

MonadAp
-------

Zaimplementować metodę `ap`.

MonadFoldM
----------

Zaimplementować metodę `foldM`.

MonadList
---------

Zdefiniować implementację klasy typów `Monad` dla typu `List`.

MonadJoin
---------

Zaimplementować metodę `join`.

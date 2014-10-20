Travers
=======

Opis
----

Traversable posiada operację `traverse` oraz spełnia prawa:

    traverse Id = Id
    traverse (Compose ∘ fmap g ∘ f) = Compose ∘ fmap (traverse g) ∘ traverse f

TraversId
---------

Zdefiniować implementację klasy typów `Travers` dla typu `Id`.

TraversMap
----------

Zaimplementować metodę `map`.

TraversOption
-------------

Zdefiniować implementację klasy typów `Travers` dla typu `Option`.

TraversSequence
---------------

Zaimplementować metodę `sequence`.

TraversList
-----------

Zdefiniować implementację klasy typów `Travers` dla typu `List`.

TraversTree
-----------

Zdefiniować implementację klasy typów `Travers` dla typu `Tree`.

TraversFoldMap
--------------

Zaimplementować metodę `foldMap`.



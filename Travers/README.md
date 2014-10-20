Travers
=======

Description
-----------

A traversable has the `traverse` operation and fulfills the laws:

    traverse Id = Id
    traverse (Compose ∘ fmap g ∘ f) = Compose ∘ fmap (traverse g) ∘ traverse f

TraversId
---------

Define an implementation of the `Travers` type class for the `Id`
type.

TraversMap
----------

Implement the `map` method.

TraversOption
-------------

Define an implementation of the `Travers` type class for the `Option`
type.

TraversSequence
---------------

Implement the `sequence` method.

TraversList
-----------

Define an implementation of the `Travers` type class for the `List`
type.

TraversTree
-----------

Define an implementation of the `Travers` type class for the `Tree`
type.

TraversFoldMap
--------------

Implement the `foldMap` method.

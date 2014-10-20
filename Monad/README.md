Monad
=====

Description
-----------

A monad is an applicative functor which has the `flatMap` operation
(other names: `bind`; `>>``; `SelectMany`) and fulfills the laws:

    pure a >>= k = k a
    m >>= pure = m
    m >>= (λx → k x >>= h) = (m >>= k) >>= h

MonadOption
-----------

Define an implementation of the `Monad` type class for the `Option`
type.

MonadMap
--------

Implement the `map` method.

MonadAp
-------

Implement the `ap` method.

MonadFoldM
----------

Implement the `foldM` method.

MonadList
---------

Define an implementation of the `Monad` type class for the `List`
type.

MonadJoin
---------

Implement the `join` method.

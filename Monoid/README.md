Monoid
======

Description
-----------

The exercise is about the *monoid* class type represented by the
`Monoid` trait from the *Monoid.scala* file.  The file includes
definitions of the `Anything` and `All` classes which wrap `Boolean`
values.

A monoid has a neutral element `mempty` (other names: `mzero`; `0`;
`∅`) and a binary operation `mappend` (`madd`; `|+|`; `⊕`) and it
fulfills the laws:

    a ⊕ 0 = a
    0 ⊕ a = a
    (a ⊕ b) ⊕ c = a ⊕ (b ⊕ c)

MonoidString
------------

Define an implementation of the `Monoid` type class for the `String`
type.

MonoidMsum
----------

Implement the `msum` method.

MonoidInt
---------

Define an implementation of the `Monoid` type class for the `Int` type
— default implementation with addition and zero.

MonoidProduct
-------------

Define an implementation of the `Monoid` type class for the `Product`
type — additional implementation for integers

MonoidAnything
--------------

Define an implementation of the `Monoid` type class for the `Anything`
type.

MonoidAll
---------

Define an implementation of the `Monoid` type class for the `All`
type.

MonoidList
----------

Define an implementation of the `Monoid` type class for the `List`
type.

MonoidTuple2
------------

Define an implementation of the `Monoid` type class for the `Tuple2`
type.

MonoidTree
----------

Define an implementation of the `Monoid` type class for the `Tree`
type.

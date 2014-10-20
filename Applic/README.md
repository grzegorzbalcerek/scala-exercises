Applic
======

Description
-----------

The exercise is about the *applicative functor* class type represented
by the `Applic` trait from the *Applic.scala* file.  The file also
contains the definition of the `ZipList` class which wraps lists.

An applicative functor is a functor which has the operations: `unit`
(other names: `point`; `pure`; `return`) and `ap` (`<*>`; `⊛`) and
fulfills the laws:

    pure id ⊛ u = u
    pure (∘) ⊛ u ⊛ v ⊛ w = u ⊛ (v ⊛ w)
    pure f ⊛ pure x = pure (f x)
    u ⊛ pure x = pure (λf → f x) ⊛ u

ApplicId
--------

Define an implementation of the `Applic` type class for the `Id` type.

ApplicOption
------------

Define an implementation of the `Applic` type class for the `Option`
type.

ApplicMap
---------

Implement the `map` method.

ApplicLift2
-----------

Implement the `lift2` method.

ApplicLift3
-----------

Implement the `lift3` method.

ApplicList
----------

Define an implementation of the `Applic` type class for the `List`
type — it should apply each function for each value.

ApplicZipList
-------------

Define an implementation of the `Applic` type class for the `ZipList`
type — it should apply the first function to the first value

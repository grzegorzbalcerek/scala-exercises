Functor
=======

Description
-----------

The exercise is about the *functor* class type represented by the
`Functor` trait from the *Functor.scala* file.  The file includes
definitions of the `Anything` and `All` classes

A functor has the `map` operation (other names: `fmap`; `<$>`;
`Select`) and fulfills the laws:

  fmap identity = identity
  fmap (g ∘ h) = (fmap g) ∘ (fmap h)

FunctorOption
-------------

Define an implementation of the `Functor` type class for the `Option`
type.

FunctorList
-----------

Define an implementation of the `Functor` type class for the `List`
type.

FunctorTree
-----------

Define an implementation of the `Functor` type class for the `Tree`
type.

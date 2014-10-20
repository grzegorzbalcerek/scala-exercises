Liist
=====

Description
-----------

The abstract class `Liist` represents lists. The `Niil` object
represents an empty list and the `:::` class — a node of a non-empty
list consisting of the head and the tail. The head is the value of the
element contained in the node. The tails is the rest of the list. The
exercise consists of implementing the methods of the `Liist` class and
object.

LiistToString
-------------

Override the `toString` method.

LiistCons
---------

Implement the `:::` method which let create a new list by prepending a
new element at the beginning of an existing list.

LiistIsEmpty
------------

Implement the `isEmpty` method which returns `true` on the `Niil`
object and `false` on instances of the `:::` class.

LiistContains
-------------

Implement the `contains` method. The method verifies whether the list
contains a given element.

LiistPlus
---------

Implement the `+` method which creates a new list with the given
element appended at the end.

LiistPlusPlus
-------------

Implement the `++` method which creates a new list consisting of the
elements of two lists. The elements of the list on which the method is
called should be prepended before the elements of the list given as
the argument.

LiistReverse
------------

Implement the `reverse` method which creates a list with the order of
elements reversed.

LiistTake
---------

Implement the `take` method which returns a list consisting of the
first *n* elements of the given list.

LiistZip
--------

Implement the `zip` method which returns a list consisting of
two-element tuples containing the elements of two lists in the
following way: the first tuple contains the first elements of both
lists; the second tuple contains the second elements of both lists and
so on. The returned list should be as long as the shorter of the input
lists.

LiistMap
--------

Implement the `map` method.

LiistFlatMap
------------

Implement the `flatMap` method.

LiistWithFilter
---------------

Implement the `withFilter` method.

LiistTakeWhile
--------------

Implement the `takeWhile` method which returns a list consisting of
the first elements of the given list for which the given logical
predicate holds true.

LiistAp
-------

Implement the `ap` method. The method should apply every function from
the `fs` list to every element of the list on which it is called.

LiistZipap
----------

Implement the `zipap` method. The method should apply consecutive
functions from the `fs` list on consecutive elements of the list on
which it is called: the first function on the first element; the
second function on the second element and so on.

LiistLift2
----------

Implement the `lift2` method. The method should apply the `f` function
to each combination of elements of the `a` and `b` lists.

LiistLift3
----------

Implement the `lift3` method. The method should apply the `f` function
to each combination of elements of the `a`; `b` and `c` lists.

LiistZiplift2
-------------

Implement the `ziplift2` method. The method should apply the `f`
function to consecutive elements of the `a` and `b` lists.)

LiistZiplift3
-------------

Implement the `ziplift3` method. The method should apply the `f`
function to consecutive elements of the `a`; `b` and `c` lists.

LiistFoldRight
--------------

Implement the `foldRight` method. The method called on the empty list
returns the first argument. The method called on a list node passes
the node value together with the result of calling the method
recursively on the list tail to the function from the second argument.

LiistFoldLeft
-------------

Implement the `foldLeft` method. The method processes list elements
from the beginning by calling the given function on consecutive list
elements and the result obtained so far.

LiistUnfold
-----------

Implement the `unfold` method. The method applies the `g` function on
`b` and then consecutively on the second element of the tuple returned
by the previous application — until the `None` value is returned — and
it creates a list of values of the first elements of the returned
tuples.

LiistToStringF
--------------

Implement the `toString` method.

LiistContainsF
--------------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`containsF` method which works like the `contains` method.

LiistPlusF
----------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`F_+` method which works like the `+` method.

LiistPlusPlusF
--------------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`F_++` method which works like the `++` method.

LiistReverseF
-------------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`reverseF` method which works like the `reverse` method.

LiistTakeF
----------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`takeF` method which works like the `take` method.

LiistZipF
---------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`zipF` method which works like the `zip` method.

LiistMapF
---------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`mapF` method which works like the `map` method.

LiistFlatMapF
-------------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`flatMapF` method which works like the `flatMap` method.

LiistWithFilterF
----------------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`withFilterF` method which works like the `withFilter` method.

LiistTakeWhileF
---------------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`takeWhileF` method which works like the `takeWhile` method.

LiistApF
--------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`apF` method which works like the `ap` method.

LiistZipapF
-----------

Using the `foldLeft`; `foldRight` or `unfold` methods implement the
`zipapF` method which works like the `zipap` method.

LiistFoldRightT
---------------

Using the tail recursion implement the `foldRightT` method which works
like the `foldRight` method.

LiistFoldLeftR
--------------

Using the `foldRightT` method implement the `foldLeftR` method which
works like the `foldLeft` method.

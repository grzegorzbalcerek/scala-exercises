Optioon
=======

Description
-----------

The abstract class `Optioon` represents optional values. The `Noone`
object which extends `Optioon` represents empty values and the `Soome`
class — non-empty values. The exercise consists of implementing the
methods of the `Optioon` class and object.

OptioonIsEmpty
--------------

Implement the `isEmpty` method which returns `true` on the `Noone`
object and `false` on instances of the `Soome` class.

OptioonGetOrElse
----------------

Implement the `getOrElse` method. When called on a `Soome` instance it
should return the value contained inside the instance. When called on
`Noone` it should return its argument.

OptioonMap
----------

Implement the `map` method.

OptioonFlatMap
--------------

Implement the `flatMap` method.

OptioonWithFilter
-----------------

Implement the `withFilter` method.

OptioonAp
---------

Implement the `ap` method. Several definitions can be created: using
the `match` expression; using the `for` comprehension; using the `map`
and `flatMap` methods.

OptioonLift2
------------

Implement the `lift2` method. Several definitions can be created:
using the `for` comprehension; using the `map` and `flatMap` methods;
using the `map` and `ap` methods.

OptioonLift3
------------

Implement the `lift3` method. Several definitions can be created:
using the `for` comprehension; using the `map` and `flatMap` methods;
using the `map` and `ap` methods.

OptioonFold
-----------

Implement the `fold` method.

OptioonIsEmptyF
---------------

Using the `fold` method implement the `isEmptyF` method which works
like the `isEmpty` method.

OptioonGetOrElseF
-----------------

Using the `fold` method implement the `getOrElseF` method which works
like the `getOrElse` method.

OptioonMapF
-----------

Using the `fold` method implement the `mapF` method which works like
the `map` method.

OptioonFlatMapF
---------------

Using the `fold` method implement the `flatMapF` method which works
like the `flatMap` method.

OptioonWithFilterF
------------------

Using the `fold` method implement the `withFilterF` method which works
like the `withFilter` method.

OptioonApF
----------

Using the `fold` method implement the `apF` method which works like
the `ap` method.

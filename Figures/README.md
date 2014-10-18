Figures
=======

Description
-----------

The exercise is about creating classes representing geometric
figures. Case classes and case objects cannot be used.

    $ scalac Figures.scala FiguresTest.scala

    $ scala FiguresTest

AbstractFigure
--------------

Define the `Figure` abstract class representing geometric figures and
two abstract methods `area` and `circum` for calculating the area and
circumferece of the figure.

Rectangle
---------

Define the `Rectangle` class representing rectangles. Override the
`toString` method.

Triangle
--------

Define a `Triangle` class representing triangles. Override the
`toString` method. A useful method: `math.sqrt`.

Square
------

Define a `Square` class representing squares. Override the `toString`
method.

FiguresObjects
--------------

Make it possible to create instances of the `Rectangle`, `Triangle`
and `Square` classes without using the `new` keyword and — in addition
to that − make it possible to create a square with the given
circumference.

FiguresEquals
-------------

Add methods for comparing figures. Two squares created by different
methods should be treated as different. The equality relation should
be reflexive, symmetric and transitive.

Optioon
```````

Opis
----

Klasa abstrakcyjna `Optioon` reprezentuje wartości
opcjonalne. Dziedziczący z niej obiekt `Noone` reprezentuje wartości
puste a klasa `Soome` — wartości niepuste. Ćwiczenie polega na
implementacji kolejnych metod z klasy i obiektu `Optioon`.

OptioonIsEmpty
--------------

Zaimplementować metodę `isEmpty` zwracającą `true` dla obiektu `Noone`
i `false` dla instancji klasy `Soome`.

OptioonGetOrElse
----------------

Zaimplementować metodę `getOrElse`. W przypadku instancji klasy
`Soome` metoda ma zwrócić wartość w niej przechowywaną. W przypadku
obiektu `Noone` metoda ma zwrócić swój argument.

OptioonMap
----------

Zaimplementować metodę `map`.

OptioonFlatMap
--------------

Zaimplementować metodę `flatMap`.

OptioonWithFilter
-----------------

Zaimplementować metodę `withFilter`.

OptioonAp
---------

Zaimplementować metodę `ap`. Można utworzyć wiele definicji: z
wykorzystaniem wyrażenia `match`; z wykorzystaniem wyrażenia `for`; z
wykorzystaniem metod `map` i `flatMap`.

OptioonLift2
------------

Zaimplementować metodę `lift2`. Można utworzyć wiele definicji: z
wykorzystaniem wyrażenia `for`; z wykorzystaniem metod `map` i
`flatMap`; z wykorzystaniem metod `map` i `ap`.

OptioonLift3
------------

Zaimplementować metodę `lift3`. Można utworzyć wiele definicji: z
wykorzystaniem wyrażenia `for`; z wykorzystaniem metod `map` i
`flatMap`; z wykorzystaniem metod `map` i `ap`.

OptioonFold
-----------

Zaimplementować metodę `fold`.

OptioonIsEmptyF
---------------

Zaimplementować działającą jak `isEmpty` metodę `isEmptyF` za pomocą
metody `fold`.

OptioonGetOrElseF
-----------------

Zaimplementować działającą jak `getOrElse` metodę `getOrElseF` za
pomocą metody `fold`.

OptioonMapF
-----------

Zaimplementować za pomocą metody `fold` metodę `mapF` działającą jak
`map`.

OptioonFlatMapF
---------------

Zaimplementować za pomocą metody `fold` metodę `flatMapF` działającą
jak `flatMap`.

OptioonWithFilterF
------------------

Zaimplementować za pomocą metody `fold` metodę `withFilterF`
działającą jak `withFilter`.

OptioonApF
----------

Zaimplementować za pomocą metody `fold` metodę `apF` działającą jak
`ap`.


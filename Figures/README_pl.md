Figures
=======

Opis
----

Ćwiczenie polega na implementacji klas reprezentujących figury
geometryczne. W tym ćwiczeniu nie wolno używać klas ani obiektów
przypadków.

    $ scalac Figures.scala FiguresTest.scala

    $ scala FiguresTest

AbstractFigure
--------------

Zdefiniować klasę abstrakcyjną `Figure` reprezentującą figury
geometryczne z dwoma abstrakcyjnymi metodami `area` i `circum`
służącymi do obliczenia pola i obwodu figury.

Rectangle
---------

Zdefiniować klasę `Rectangle` reprezentującą prostokąty. Nadpisać
metodę `toString`.

Triangle
--------

Zdefiniować klasę `Triangle` reprezentującą prostokąty. Nadpisać
metodę `toString`. Przydatna metoda: `math.sqrt`.

Square
------

Zdefiniować klasę `Square` reprezentującą kwadraty. Nadpisać metodę
`toString`.

FiguresObjects
--------------

Dodać możliwość tworzenia instancji klas `Rectangle`, `Triangle` i
`Square` bez użycia słowa kluczowego `new` oraz dodatkowo możliwość
utworzenia kwadratu o określonym obwodzie.

FiguresEquals
-------------

Dodać metody pozwalające na porównywanie figur ze sobą. Prostokąt
mający równe boki powinien być traktowany jako równy z odpowiednim
kwadratem. Relacja równości powinna być zwrotna, symetryczna i
przechodnia.





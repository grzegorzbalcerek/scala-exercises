Liist
=====

Opis
----

Klasa abstrakcyjna `Liist` reprezentuje listy. Dziedziczący z niej
obiekt `Niil` reprezentuje listę pustą a klasa `:::` — węzeł niepustej
listy składający się z głowy i ogona. Głowa to wartość elementu listy
znajdującego się w tym węźle. Ogon jest pozostałą częścią
listy. Ćwiczenie polega na implementacji kolejnych metod z klasy i
obiektu `Liist`.

LiistToString
-------------

Nadpisać metodę `toString`.

LiistCons
---------

Zaimplementować metodę `:::` pozwalającą skonstruować nową listę
poprzez dopisanie nowego elementu na początku istniejącej listy.

LiistIsEmpty
------------

Zaimplementować metodę `isEmpty` zwracającą `true` dla obiektu `Niil`
i `false` dla instancji klasy `:::`.

LiistContains
-------------

Zaimplementować metodę `contains`. Metoda sprawdza czy lista zawiera
podany element.

LiistPlus
---------

Zaimplementować metodę `+` tworzącą listę z dodanym na końcu
elementem.

LiistPlusPlus
-------------

Zaimplementować metodę `++` tworzącą nową listę złożoną z elementów
dwóch list. Elementy listy na której jest wołana metoda mają być
dopisane przed elementami listy podanej jako argument.

LiistReverse
------------

Zaimplementować metodę `reverse` tworzącą listę z odwróconą
kolejnością elementów.

LiistTake
---------

Zaimplementować metodę `take` zwracającą listę złożoną z pierwszych
*n* elementów listy.

LiistZip
--------

Zaimplementować metodę `zip` zwracającą listę złożoną z
dwuelementowych krotek zawierających elementy dwóch list w taki sposób
że w pierwszej krotce są pierwsze elementy obu list; w drugiej —
drugie; itd. Utworzona lista ma mieć długość równą krótszej z dwóch
list wejściowych.

LiistMap
--------

Zaimplementować metodę `map`.

LiistFlatMap
------------

Zaimplementować metodę `flatMap`.

LiistWithFilter
---------------

Zaimplementować metodę `withFilter`.

LiistTakeWhile
--------------

Zaimplementować metodę `takeWhile` zwracającą listę złożoną z
pierwszych elementów listy spełniających podany predykat logiczny.

LiistAp
-------

Zaimplementować metodę `ap`. Metoda powinna wykonać każdą z funkcji
znajdującej się na liście `fs` na każdym z elementów listy na której
jest wykonana.

17.16 LiistZipap
-----------------

Zaimplementować metodę `zipap`. Metoda powinna wykonać każdą kolejną z
funkcji znajdującej się na liście `fs` na każdym kolejnym z elementów
listy na której jest wykonana: pierwszą funkcję na pierwszym elemencie
listy; drugą na drugim itd.

LiistLift2
----------

Zaimplementować metodę `lift2`. Metoda powinna wykonać funkcję `f` na
każdej z kombinacji wartości list `a` i `b`.

LiistLift3
----------

Zaimplementować metodę `lift3`. Metoda powinna wykonać funkcję `f` na
każdej z kombinacji wartości list `a`

LiistZiplift2
-------------

Zaimplementować metodę `ziplift2`. Metoda powinna wykonać funkcję `f`
na kolejnych elementach list `a` i `b`: najpierw na pierwszych
elementach tych list; potem na drugich itd.

LiistZiplift3
-------------

Zaimplementować metodę `ziplift3`. Metoda powinna wykonać funkcję `f`
na każdej kolejnej kombinacji wartości list `a` `b` i `c`: najpierw na
pierwszych elementach tych list; potem na drugich itd.

LiistFoldRight
--------------

Zaimplementować metodę `foldRight`. Metoda przetwarza listę w ten
sposób że lista pusta jest zastępowana pierwszym argumentem a wartość
znajdująca się w węźle listy oraz wynik wywołania rekurencyjnego na
ogonie listy są przekazywane funkcji z drugiego argumentu.

LiistFoldLeft
-------------

Zaimplementować metodę `foldLeft`. Metoda przetwarza listę od jej
początku wykonując podaną funkcję na kolejnych elementach oraz
dotychczasowym wyniku.

LiistUnfold
-----------

Zaimplementować metodę `unfold`. Metoda wywołuje funkcję `g` na
argumencie `b` a potem kolejno na drugim elemencie krotki z
poprzedniego wywołania — aż do momentu zwrócenia wartości `None` —
oraz tworzy listę wartości z pierwszych elementów krotek.

LiistToStringF
--------------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `toStringF` działającą jak `toString`.}}

LiistContainsF
--------------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `containsF` działającą jak `contains`.

LiistPlusF
----------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `F_+` działającą jak `+`.

LiistPlusPlusF
--------------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `F_++` działającą jak `++`.

LiistReverseF
-------------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `reverseF` działającą jak `reverse`.

LiistTakeF
----------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `takeF` działającą jak `take`.

LiistZipF
---------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `zipF` działającą jak `zip`.

LiistMapF
---------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `mapF` działającą jak `map`.

LiistFlatMapF
-------------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `flatMapF` działającą jak `flatMap`.

LiistWithFilterF
----------------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `withFilterF` działającą jak `withFilter`.

LiistTakeWhileF
---------------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `takeWhileF` działającą jak `takeWhile`.

LiistApF
--------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `apF` działającą jak `ap`.

LiistZipapF
-----------

Zaimplementować za pomocą metody `foldLeft`; `foldRight` lub `unfold`
metodę `zipapF` działającą jak `zipap`.

LiistFoldRightT
---------------

Zaimplementować za pomocą rekurencji ogonowej metodę `foldRightT`
działającą jak `foldRight`.

LiistFoldLeftR
--------------

Zaimplementować za pomocą metody `foldRightT` metodę `foldLeftR`
działającą jak `foldLeft`.

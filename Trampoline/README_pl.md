Trampoline
==========

Obiekt `IsOddEven` definiuje metody sprawdzające czy podana liczba
całkowita dodatnia jest parzysta czy nieparzysta.  Rozwiązanie to ma
wadę: dla zbyt dużych liczb wyrzucany jest wyjątek.

  scala> IsOddEven.isOdd(99999) // StackOverflowError

Obiekt `TrampolineIsOddEven` implementuje inne rozwiązanie tego
problemu — wykorzystujące obiekt `Trampoline` i technikę zwaną
trampoliną. Rozwiązanie polega na tym że metoda zamiast rekurencyjnego
wywołania innej metody zwraca rezultat który zawiera informację
dotyczącą kontynuowania obliczeń. Może to być informacja że obliczenie
zostało zakończone albo informacja o tym jak kontynuować
obliczenia. Do uruchomienia obliczeń służy metoda o nazwie
`trampoline`. Zadanie polega na implementacji obiektu `Trampoline`.

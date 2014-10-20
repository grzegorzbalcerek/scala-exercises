Using
=====

Utworzyć metodę `using` która ma dwie listy parametrów z jednym
parametrem w każdej z nich. Pierwszy parametr reprezentuje referencję
do obiektu implementującego metodę `close`. Drugi reprezentuje funkcję
do wykonania. Metoda `using` wykona funkcję przekazując jej instancję
przekazaną w pierwszym parametrze. Rezultatem funkcji oraz metody
`using` jest `Unit`. Po wykonaniu funkcji a także w przypadku gdy ta
funkcja wygeneruje wyjątek metoda `using` wykonuje metodę `close`
instancji przekazanej w pierwszym parametrze i kończy działanie. Do
sprawdzenia działania metody `using` wykorzystać klasę `Resource`.

Chain
=====

Obiekt `Dict` definiuje funkcję `translate` służącą do tłumaczenia
podanego słowa angielskiego na język polski. Metody `nouns` i `colors`
z tego obiektu tłumaczą wybrane słowa z angielskiego na
polski. Funkcja `translate` jest zbudowana za pomocą metody `chain` z
obiektu `Chain`. Metoda ta pobiera jako argumenty funkcje utworzone z
metod `nouns` i `colors`. Metoda `chain` przyjmuje dowolną liczbę
funkcji typu `A => Option[B]` i zwraca funkcję tego samego
typu. Zwrócona funkcja działa w taki sposób że po kolei przekazuje
poszczególnym funkcjom-argumentom swój argument aż do momentu gdy
jedna z funkcji zwróci instancję klasy `Some`. Ta wartość staje się
wynikiem funkcji złożonej. Jeśli żadna z funkcji-argumentów nie zwróci
instancji klasy `Some` to wynikem funkcji złożonej jest `None`.

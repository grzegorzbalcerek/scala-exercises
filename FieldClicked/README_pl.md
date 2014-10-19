FieldClicked
============

Klasa `Point` reprezentuje punkt na ekranie. Obiekt `Board`
reprezentuje planszę do gry w kółko i krzyżyk zawierającą 9 pól
ułożonych w trzech wierszach i trzech kolumnach. Każde z pól ma
wysokość i szerokość stu pikseli. Kolumny i wiersze mają współrzędne
od 1 do 3. Pierwsza kolumna odpowiada współrzędnym od 0 do 99. Druga —
od 100 do 199. Trzecia — od 200 do 299. W przypadku wierszy jest
podobnie. Obiekt `Board` zawiera definicję metody `field` która
pobiera jako argument instancję klasy `Point` i zwraca informację
mówiącą o tym któremu wierszowi i kolumnie odpowiada ten punkt — taka
informacja opakowana jest w instancję klasy `Right` — lub komunikat
mówiący o tym że punkt jest poza planszą — opakowany w instancję klasy
`Left`. Metoda `field` wykorzystuje ekstraktor zdefiniowany w obiekcie
`FieldClick`. Zadanie polega na implementacji tego ekstraktora.

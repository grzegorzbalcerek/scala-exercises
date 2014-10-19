FieldClicked
============

The `Point` class represents a point on the screen. The `Board` object
represents the board of the Tic Tac Toe game with 9 fields composed of
3 rows and 3 columns. Every field has the width and height of 100
pixels. The rows and columns have the coordinates from 1 to 3. The
first columns covers the points with the coordinates between 0 and
99. The second column — the points with coordinates between 100 and
199. The third column — the points with coordinates between 200 and
299. The similar relations hold for rows. The `Board` object contains
the definition of the `field` method which has a parameter of the
`Point` type and returns the information about the row and column
corresponding to the point. The information is wrapped in an instance
of the `Right` class. Alternatively the method retuns a message saying
that the point is out of board wrapped in an instance of the `Left`
class. The `field` method uses the extractor defined in the
`FieldClick` object. The exercise consists of implementing that
extractor.

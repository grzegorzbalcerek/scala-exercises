Using
=====

Implement the `using` method which has two parameter lists with one
parameter each. The first parameter represents a reference to an
object implementing the `close` method. The second one represents a
function to be called. The `using` method will call the function
passing it the instance from the first parameter. The result of the
function and of the `using` method is `Unit`. After the function
execution finishes — including if it is stopped by an exception being
thrown — the `using` method calls the `close` method and finishes. You
can use the `Resource` class to test the `using` method.

Trampoline
==========

The `IsOddEven` object defines methods for verifying whether a given
number natural number is even or odd.  The solution has a flaw: for
big numbers an exception is thrown.

  scala> IsOddEven.isOdd(99999) // StackOverflowError

The `TrampolineIsOddEven` object implements another solution using the
`Trampoline` object and a technique called trampolining. When
trampolining is used then a method does not directly calls another
method but instead returns a result which contains an information
about how to continue the calculation. It may be an information which
says that the calculation has finished or an information about how to
continue the calculation. The `trampoline` method is used to start the
calculation. The task consists of implementing the `trampoline`
object.

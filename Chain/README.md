Chain
=====

The `Dict` object defines the `translate` function which translates a
given English word to Polish. The `nouns` and `colors` methods from
that object translate selected words from English to Polish. The
`translate` function uses the `chain` method from the `Chain`
object. That method takes as arguments the functions created from the
`nouns` and `colors` methods. The `chain` method takes an arbitrary
number of individual functions of type `A => Option[B]` and returns a
compound function of the same type. The returned function calls the
individual functions one by one until one of them returns an instance
of the `Some` class. That instance then becomes the result of the
compound function. If all of the individual functions return `None`
then the compound function also returns `None`.

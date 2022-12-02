# Array Library

## Short Description

You are to implement a functional library for working with arrays.

## Estimation (h)

20

## Topics

* Closure
* "this" keyword
* Functional Programming
* ES6 features
* Memoization

## Requirements

* The library should provide the following functionality:

  `1. take(array, n)`

  `2. skip(array, n)`

  `3. map(array, callback)`

  `4. reduce(array, callback, initialValue)`

  `5. filter(array, callback)`

  `6. foreach(array, callback)`

  Here is an example of calling:

  `nameOfYourLibrary.take([1, 2, 3, 4], 2)` will return `[1, 2]`

  The rest of the functions work the same way.

  `nameOfYourLibrary.map([1, 2, 3], a => a * 2 )` will return `[2, 4, 6]`

* After finishing the implementation of these methods, you should implement new `chain` and `value` functions, which
  will allow using the library in the following way:

  `arrayLib.chain([1, 2, 3]).take(2).skip(1).value()` will return `[2]`

  **NOTE: it should still be possible to call the function in the old way.**

* First, you should implement the library using ES5, after completing the `chain` and `value` functions, the same task
  should be implemented with ES6.

## Advanced Requirements

* Cover the code with unit tests.
* Implement memoization function, for example, `sum`.

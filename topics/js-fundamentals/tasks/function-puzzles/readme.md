# Function Puzzles

## Short Description

You are to solve some functional puzzles.

## Estimation (h)

40

## Topics

* Functional Programming
* JS Types
* "this" keyword
* Currying
* Partial Application
* Linear Fold
* Lazy Evaluation
* Memoization

## Requirements

### Problem 1: Partial Application

Implement function F that allows doing partial function application in a form of:
`G(x, y, z ... ) = N`
`F(x, G(x, y, z ... )) → H(y, z ... ) = N`

`F` should accept any number of parameters to apply.
`G` may accept any number of parameters.
Is there any JavaScript built-in alternative?

In order to solve this problem you have to be familiar with the next concepts:

1. Partial Application
2. High-order and First-class functions
3. Activation Object and handling of a variable number of function arguments

### Problem 2: Currying

Implement function curry that allows doing currying like:
`f(x, y, z) = N`
`curry(f) = x → (y → (z → N))`

Function `f` may accept any number of explicit parameters.
Implicit parameters are not subject to `curry`.
How is it differ from Partial Application?

In order to solve this problem you have to be familiar with the next concepts:

1. Currying and Partial Application
2. High-order and First-class functions
3. Activation Object and handling of a variable number of function arguments

### Problem 3: Linear fold

Implement a linear fold function that works on arrays:
`F(array, callback[, initialValue])`
`array` is the array fold was called upon.
`callback` is a function to execute on each value in the array, taking four arguments:

* `previousValue` - the value previously returned in the last invocation of the callback, or initialValue, if supplied.
* `currentValue` -  the current element being processed in the array.
* `index` -  the index of the current element being processed in the array.
* `initialValue` -  object to use as the first argument to the first call of the callback.

Does ES5 has a built-in alternative?

In order to solve this problem you have to be familiar with the next concepts:

1. Folding and unfolding
2. High-order and First-class functions

### Problem 4: Map

Implement a function that creates a new array with the results of calling a provided function on every element in this
array.

Does ES5 has a built-in alternative?

In order to solve this problem you have to be familiar with next concepts:

1. Functional Map
2. High-order and First-class functions

### Problem 5: Filter

Implement a function that filters array based on callback result.

Does ES5 has a built-in alternative?

In order to solve this problem you have to be familiar with next concepts:

1. High-order and First-class functions

### Problem 6: Average of even numbers

Given an array of numbers, find the average of even ones using functions implemented for previous problems.

Example: `[1, 23, 2, 6, 12, 0] -> (2 + 6 + 12 + 0) / 4 = 5`

In order to solve this problem, you have to solve 1-6 problems.

### Problem 7: Lazy evaluation

Implement a function that takes a list of parameters and makes any given function lazy.

In order to solve this problem you have to be familiar with the next concepts:

1. High-order and First-class functions

### Problem 8: Memoization

Implement a function that for any given function `F` produces function `G` that caches its previous calling results.

* Function `F` accepts a single explicit parameter.
* Implicit parameters should not be taken into account.
* Watch out for NaN, undefined and circular references.

In order to solve this problem you have to be familiar with the next concepts:

1. Memoization
2. High-order and First-class functions

### Problem 9: Inheritance

Make hierarchy of geometric figures: base Shape class inherited Rectangle and Square classes.

The rectangle should have "width" and "height" properties. Square should have "sideLength" property. Also, each shape
has "name" property and methods to calculate perimeter and area. Make ShapesStore which contains shapes. It should have
a method which returns the total perimeter of all rectangles and method which return total area of all squares which
contained in it.

### Problem 10: Function with any number of parameters

Write a function that will calculate the multiplication of all parameters that were passed into the function.

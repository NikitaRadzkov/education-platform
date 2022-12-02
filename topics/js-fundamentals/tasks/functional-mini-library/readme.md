# Functional Mini Library

## Short Description

You are to implement a functional library.

## Estimation (h)

16

## Topics

* Functional Programming
* JS Types

## Requirements

* The library should provide the following functionality:

  1. `bool isArray(obj)`
  2. `bool isBoolean(obj)`
  3. `bool isDate(obj)`
  4. `bool isNumber(obj)`
  5. `bool isString(obj)`
  6. `bool isFunction(obj)`
  7. `bool isUndefined(obj)`
  8. `bool isNull(obj)`

* Working with arrays:

  1. `obj first(arr)`
  2. `obj last(arr)`
  3. `newArr skip(arr, number)`
  4. `newArr take(arr, number)`

* Chaining:
  Implement the ability to create chains:
  `asChain(arr).skip(func).take(func)`

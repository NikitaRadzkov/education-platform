# JavaScript Fundamentals

## Version

1.0.0

## Introduction

Here we learn JavaScript, starting from scratch and go on to advanced concepts like OOP. We concentrate on the language
itself here, with the minimum of environment-specific notes.

## Table of Contents

* [Theory](./theory/readme.md)
* [Tasks](./tasks/readme.md)
* [Questions](./questions/readme.md)

## Topics

### Beginner

* JavaScript Fundamentals
  * Language Fundamentals
    * Variables and constants
    * Operators
    * Comparisons
    * Loops and Conditions
  * Type System
    * Data Types
    * Type Casting
  * Scopes, Closures and Functions
    * Lexical Environment
    * Scopes
    * Closure
    * Hoisting
    * Functions
      * Expression and Declaration
      * Arrow functions
  * Objects and Classes
    * Object Instantiation
      * Object methods and "this"
      * Constructor, operator "new"
      * Global object
      * Function object
    * Prototypes
      * Inheritance
      * Chain
      * instanceof
      * proto and function.prototype
    * Classes
      * Inheritance
      * Static properties and methods
      * Private and protected properties and methods
  * Async
    * Scheduling
      * setTimeout
      * setInterval
    * Approaches
      * Callbacks
      * Promises
      * async/await

### Intermediate

* JavaScript Fundamentals
  * Type System
    * Data Types
      * Methods of primitives
      * Numbers
      * Strings
      * Date and time
      * Arrays
      * Array methods
      * Map and Set
      * Destructuring assignment
  * Scopes, Closures and Functions
    * Currying
    * Functions
      * Expression and Declaration
      * Bind, call, apply
      * Rest parameters and spread syntax
  * Objects and Classes
    * Object to primitive conversion
    * Property flags and descriptors
    * Property getters and setters
    * Native prototypes
    * Prototype methods
    * Extending built-in classes
    * Chaining
  * Async
    * Promise chaining
    * Promise API
    * Generators
      * Async generators
      * Async iterators
  * Execution
    * Strict Mode
    * Garbage Collection
    * Eval
  * Error handling
    * Error class
    * Custom errors

### Advanced

* JavaScript Fundamentals
  * Type System
    * Data Types
      * BigInt
      * Symbols
      * Iterables
      * WeakMap and WeakSet
      * Object.keys, values, entries
      * JSON methods, toJSON
  * Scopes, Closures and Functions
    * Functions
      * Recursion and stack
      * Arrow functions revisited
  * Objects and Classes
    * Mixins
    * Proxy and Reflect
  * Async
    * Promisification
    * Microtasks
  * Modules
    * Export and import
    * Dynamic imports

## Prerequisites

### Technical

* Javascript will be studied from scratch, so there is no need for any input knowledge.
* However, it would be nice to know the basics of programming: variables, conditions, loops, functions, etc.

### Environment

* Browsers
  * Google Chrome
  * Firefox
  * Microsoft Edge
  * Internet Explorer 11
* Recommended IDE
  * Visual Studio Code
  * WebStorm

## Plan

| Name                                                                                          | Type               | Short Description                                     | Level        | Required | Estimation (h) |
|-----------------------------------------------------------------------------------------------|--------------------|-------------------------------------------------------|--------------|----------|----------------|
| [JS Fundamentals tutorial (Stage 1)](./theory/js-fundamentals-tutorial-stage-1/readme.md)     | documentation part | Learn JS fundamentals.                                | beginner     | required | 24             |
| [JS Fundamentals tutorial (Stage 2)](./theory/js-fundamentals-tutorial-stage-2/readme.md)     | documentation part | Learn JS fundamentals.                                | intermediate | required | 16             |
| [JS Fundamentals tutorial (Stage 3)](./theory/js-fundamentals-tutorial-stage-3/readme.md)     | documentation part | Learn JS fundamentals.                                | advanced     | required | 10             |
| [ES 6 in Depth](https://ponyfoo.com/articles/tagged/es6-in-depth)                             | article            | A series of articles on ES2015.                       | intermediate | optional | 8              |
| [Tasks and microtasks](https://jakearchibald.com/2015/tasks-microtasks-queues-and-schedules/) | article            | Tasks, microtasks, queues and schedules.              | advanced     | required | 1              |
| [Javascript Fundamentals](https://www.pluralsight.com/courses/javascript-fundamentals)        | video              | JS Fundamental Pluralsight course.                    | beginner     | optional | 5              |
| [Event Loop](https://www.youtube.com/watch?v=8aGhZQkoFbQ)                                     | video              | What the heck is the event loop anyway?               | advanced     | required | 0.5            |
| [Functional Mini Library](./tasks/functional-mini-library/readme.md)                          | task               | Create some helper functions for working with arrays. | beginner     | required | 16             |
| [Array Library](./tasks/array-library/readme.md)                                              | task               | Create a functional lib for working with arrays.      | beginner     | optional | 12             |
| [Logger](./tasks/logger/readme.md)                                                            | task               | Create a simple logger.                               | beginner     | optional | 8              |
| [Function Puzzles](./tasks/function-puzzles/readme.md)                                        | task               | Working with functions.                               | intermediate | required | 18             |

## Additional Materials

* [JS Newsletter](https://javascriptweekly.com/) - A newsletter of JavaScript articles, news and cool projects.
* [You Don't Know JS](https://github.com/getify/You-Dont-Know-JS) - A series of books diving deep into the core
  mechanisms of the JS language.

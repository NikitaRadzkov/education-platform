# Python Fundamentals

## Version

1.0.0

## Introduction

This is a Python container with introduction to the language. Here you will learn Python basics: syntax, concepts and
standard library usage. This is a theoretical/practical container, it includes both theory and some practical exercises

## Table of Contents

* [Theory](./theory/readme.md)
* [Tasks](./tasks/readme.md)
* [Questions](./questions/readme.md)

## Topics

### Beginner

* Language fundamentals
  * Scope of variables (LEGB)
    * Global
    * Local
    * Enclosed
    * Built-in
  * Data types
    * Basic types
    * Mutability
    * Iterable basic types
    * List vs Tuple
  * Comprehensions
    * List comprehensions
    * Dict comprehensions
    * Generator comprehensions
    * Iterators and iterable objects
  * Env management
    * virtualenv
    * package managers
      * pip
  * Coding standards
    * PEP8
    * Linters
      * pylint
      * flake8
  * Exceptions

### Intermediate

* Functions
  * Decorators
  * Generator functions
  * Closures
* Built-ins
  * filter
  * map/reduce
  * dir
  * help
  * setattr, getattr
  * pickle
  * os
* File IO
  * open, close
  * context manager
  * modes(read, write, binary, append)
* OOP
  * OOP principles
    * Inheritance
    * Incapsulation
    * Polymorphism
  * property decorator
  * MRO
  * Metaclasses
    * Type
  * Magic methods
  * `__new__` vs `__init__`
  * Context managers

### Advanced

* Asynchronous programming
  * GIL
  * Threading
  * Multiprocessing
  * Asyncio
    * async/await
    * event loop
* Garbage Collection
  * Reference counting
  * Mark and sweep

## Prerequisites

### Environment

* Python >= 3.5
* Python IDE and/or Text Editor
  * Pycharm
  * Vim

## Plan

| Name                                                                       | Type         | Short Description                                   | Level        | Required | Estimation (h) |
| -------------------------------------------------------------------------- | ------------ | --------------------------------------------------- | ------------ | -------- | -------------- |
| [First steps](./theory/first-steps/readme.md)                              | theory group | Steps to setup python environment and python basics | beginner     | required | 3              |
| [Code style](./theory/code-style/readme.md)                                | theory group | Information on python code style practices          | beginner     | required | 2              |
| [Intermediate topics](./theory/intermediate-topics/readme.md)              | theory group | Topics for intermediate level                       | intermediate | required | 10             |
| [File Reader](./tasks/file-reader/readme.md)                               | task         | Implement file reader.                              | intermediate | required | 4              |
| [ETL, Exceptions](./tasks/etl-exceptions/readme.md)                        | task         | Transform data. Handle exceptions.                  | intermediate | required | 6              |
| [Caching Decorator](./tasks/caching-decorator/readme.md)                   | task         | Implement caching mechanism.                        | intermediate | required | 4              |
| [Plugin Registration System](./tasks/plugin-registration-system/readme.md) | task         | Implement plugin registration.                      | intermediate | required | 4              |
| [OOP](./theory/oop/readme.md)                                              | theory group | OOP concepts in python language                     | beginner     | required | 10             |
| [Object Oriented Model](./tasks/object-oriented-model/readme.md)           | tasks group  | Design object oriented system                       | intermediate | required | 8              |
| [Logger](./tasks/logger/readme.md)                                         | task         | Implement logger.                                   | intermediate | required | 8              |
| [Beginner Complex Task](./tasks/beginner-complex-task/readme.md)           | task         | Count number of tags on a web page                  | beginner     | required | 40             |
| [Advanced topics](./theory/advanced-topics/readme.md)                      | theory group | Topics for advanced level                           | advanced     | required | 10             |

## Books

* Learning Python - Mark Lutz
* Learn Python the hard way - Zed Shaw
* Python Programming for the Absolute Beginner - Michael Dawson

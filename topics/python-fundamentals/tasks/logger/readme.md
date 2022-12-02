# Logger

## Short Description

Implement logging of each method call for a class.

## Estimation (h)

8

## Topics

* Metaclasses
* Runtime decorators
* Files
* DB

## Requirements

* Implement a simple class with 3 methods: 1st raising exception, 2nd returning
  None and 3rd returning 'Hello, {name}!' where name is an argument
* Implement a metaclass to log all the method calls
* Use this metaclass for class from 1st point
* Logging should have 3 levels: error, info and warning
* Use info level to log the method call itself with arguments
* Use error level to log the exceptions raised during the method
* Use warning level to log a warning if method call returned None

## Advanced Requirements

* Implement logging to command line, file and sqllite db

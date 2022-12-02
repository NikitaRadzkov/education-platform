# Logger

## Short Description

You are to create your own logger.

## Estimation (h)

20

## Topics

* Execution context
* Inheritance

## Requirements

* Create a simple logger function that logs a message in the console (message is a parameter).
  * Example of execution:
    `log("Hello World!");`
  * Example of output:
    `Hello World!`
* Create another logger function that uses the previous one, and logs table-view row in console (column values are
  parameters).
  * Example of execution:
    `log("Hello", "World", "!");`
  * Example of output:
    `Hello | World | !`
* Create another logger function that uses the previous one, and logs table-view row in the console (the first column is
  the current date and time by default, another column values are parameters).
  * Example of execution:
    `log("Hello", "World", "!");`
  * Example of output:
    `12/16/2016, 2:35:02 PM | Hello | World | !`
* Make 3 previous methods as method "log" of objects `BaseLogger`, `TableLogger`, and `TableTimeLogger`. Implement
  inheritance of objects using all known JS Inheritance patterns.

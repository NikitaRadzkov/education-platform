# Asynchronous methods

## Short Description

Create a console application and work with asynchronous methods

## Estimation (h)

2

## Topics

* Async/await methods
* Getting results from async methods
* Sequential and parallel calls

## Requirements

* Create a console app and create a class which calculates Fibonacci number (e.g. Fib(int i))
* Create an async method (e.g. FibAsync()) which calls Fib(int i) three times and writes result to console in sequential
  mode (use await and Task.Run)
* Rework previous task in parallel mode

## Advanced Requirements

* Call Fib(i) in infinity loop with some counter i (increase i after each iteration). Add CancellationTokenSource and
  cancel calculation Fib(i) when i > 10

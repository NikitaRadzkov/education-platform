# .NET Fundamentals

## Version

1.0.0

## Introduction

Here we learn .NET and C# basics. We concentrate on .NET itself, with minimum of OOP.

## Table of Contents

* [Theory](./theory/readme.md)
* [Tasks](./tasks/readme.md)
* [Questions](./questions/readme.md)

## Topics

### Beginner

* Designing types
  * Value and reference types
  * Classes and interfaces
  * Class, interface members
  * Extension methods
  * Methods overloading
  * Methods overriding
  * Generics
* CLR structure and mechanisms
  * CLR, CTS, CLS, MSIL, JIT
  * Object lifetime and garbage collection
  * IDisposable
  * Reflection
  * Exceptions
  * Serialization
* Essential types
  * Object
  * String and StringBuilder
  * Data structures
  * Attributes
  * Delegates, lambda-expressions, events

### Intermediate

* Asynchronous computing
  * Threads and processes
  * TPL
  * Multithreading
  * Thread synchronization
* Input/Output
  * Streams
  * File streams
  * Network streams

## Prerequisites

### Technical

* C# Syntax

### Environment

* Visual Studio
* .NET Core

## Plan

| Name                                                                                                                                  | Type               | Short Description                                                                                                                                 | Level        | Required | Estimation (h) |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------ | -------- | -------------- |
| [Starter](./theory/starter/readme.md)                                                                                                 | theory group       | The course "Starter" is aimed at those who are not familiar with the .NET Core platform and C# language and who want to learn it from the basics. | beginner     | required | 10.2           |
| [Object oriented programming (Stage 1)](./theory/oop-stage-1/readme.md)                                                               | theory group       | This theory provides basic OOP knowledge and principles in the C# language.                                                                       | beginner     | required | 12.8           |
| [Exception Handling (Stage 1)](./theory/exception-handling-stage-1/readme.md)                                                         | theory group       | This theory provides basic knowledge of throwing and handling exceptions.                                                                         | beginner     | required | 2.8            |
| [Exception Handling (Stage 2)](./theory/exception-handling-stage-2/readme.md)                                                         | documentation part | This theory provides an official Microsoft-guide of throwing and handling exceptions.                                                             | intermediate | optional | 1.9            |
| [Delegates, Events, and Lambda Expressions (Stage 1)](./theory/delegate-event-lambda-stage-1/readme.md)                               | theory group       | This theory provides fundamental knowledge about Delegates, Events, and Lambda Expressions.                                                       | beginner     | required | 3.9            |
| [Delegates, Events, and Lambda Expressions (Stage 2)](./theory/delegate-event-lambda-stage-2/readme.md)                               | theory group       | This theory provides some extra information about Delegates, Events, and Lambda Expressions.                                                      | intermediate | required | 1.4            |
| [Interfaces](./theory/interfaces/readme.md)                                                                                           | theory group       | This theory provides interfaces introduction with common scenarios and usage patterns.                                                            | beginner     | required | 1              |
| [Interface covariance and contravariance](https://metanit.com/sharp/tutorial/3.27.php)                                                | article            | Read about covariance and contravariance in generic interfaces                                                                                    | intermediate | required | 0.2            |
| [CLR](./theory/clr/readme.md)                                                                                                         | theory group       | This theory provides starter information about CLR and related topics.                                                                            | beginner     | required | 2.5            |
| [Introduction to the Common Language Runtime (CLR)](https://github.com/dotnet/coreclr/blob/master/Documentation/botr/intro-to-clr.md) | article            | Read about Common Language Runtime (CLR).                                                                                                         | advanced     | required | 3              |
| [CLR Threading Overview](https://github.com/dotnet/coreclr/blob/master/Documentation/botr/threading.md)                               | article            | Read about CLR Threading.                                                                                                                         | advanced     | required | 2              |
| [Memory management and garbage collection](./theory/memory-management/readme.md)                                                      | theory group       | This theory provides starter information about .NET memory management and garbage collection.                                                     | beginner     | required | 1.7            |
| [Advanced C# OOP capabilities (Stage 1)](./theory/advanced-oop-stage-1/readme.md)                                                     | documentation part | This theory introduces some advanced OOP capabilities available in C#.                                                                            | beginner     | required | 1.5            |
| [Advanced C# OOP capabilities (Stage 2)](./theory/advanced-oop-stage-2/readme.md)                                                     | theory group       | This theory introduces more advanced OOP capabilities available in C#.                                                                            | intermediate | required | 2.2            |
| [Collections](./theory/collections/readme.md)                                                                                         | theory group       | This theory introduces common .NET collection classes and structures.                                                                             | beginner     | required | 2.6            |
| [Advanced classes and structures](./theory/advanced-classes/readme.md)                                                                | documentation part | This theory introduces basic knowledge about advanced utility .NET classes and structures.                                                        | intermediate | required | 1              |
| [Span type](https://metanit.com/sharp/tutorial/2.33.php)                                                                              | article            | Read about built-in Span type.                                                                                                                    | advanced     | required | 0.6            |
| [System.String](./theory/system-string/readme.md)                                                                                     | documentation part | This theory provides basic knowledge about strings in C#.                                                                                         | beginner     | required | 1.7            |
| [String interning](https://www.c-sharpcorner.com/article/c-sharp-string-interning-for-efficient-string-comparison/)                   | article            | Read about string interning mechanism in .NET                                                                                                     | intermediate | required | 0.5            |
| [Multithreading (Stage 1)](./theory/multithreading-stage-1/readme.md)                                                                 | theory group       | This theory provides basic knowledge of multithreading in C#.                                                                                     | beginner     | required | 0.7            |
| [Multithreading (Stage 2)](./theory/multithreading-stage-2/readme.md)                                                                 | theory group       | This theory provides more advanced knowledge of multithreading in C#.                                                                             | intermediate | required | 1.4            |
| [Threads](./tasks/threads/readme.md)                                                                                                  | task               | Create a console application and work whith threads                                                                                               | beginner     | required | 2              |
| [Async programming (Stage 1)](./theory/async-programming-stage-1/readme.md)                                                           | theory group       | This theory provides basic knowledge of async programming in C#.                                                                                  | beginner     | required | 2.3            |
| [Async programming (Stage 2)](./theory/async-programming-stage-2/readme.md)                                                           | theory group       | This theory provides more advanced knowledge of async programming in C#.                                                                          | intermediate | required | 1.3            |
| [Asynchronous methods](./tasks/asynchronous-methods/readme.md)                                                                        | task               | Create a console application and work whith asynchronous methods                                                                                  | beginner     | required | 2              |
| [Write from csv to database](./tasks/csv-to-database/readme.md)                                                                       | task               | Create console application which reads csv file and writes data to the database                                                                   | beginner     | required | 8              |
| [Reflection](https://www.c-sharpcorner.com/UploadFile/keesari_anjaiah/reflection-in-net/)                                             | article            | Read about reflection mechanism in .NET                                                                                                           | beginner     | required | 0.5            |
| [Attributes](./theory/attributes/readme.md)                                                                                           | documentation part | This theory provides basic knowledge of attributes in C#.                                                                                         | beginner     | required | 0.5            |
| [Dynamic Language Runtime](./theory/dynamic-language-runtime/readme.md)                                                               | theory group       | Read about Dynamic Language Runtime                                                                                                               | beginner     | required | 1.2            |
| [Create logging proxy](./tasks/logging-proxy/readme.md)                                                                               | task               | Create logging proxy                                                                                                                              | beginner     | required | 8              |
| [Streams and files](./theory/streams-and-files/readme.md)                                                                             | theory group       | Read about how to work with stream and files                                                                                                      | beginner     | required | 2.4            |
| [Streams](./tasks/streams/readme.md)                                                                                                  | task               | Create a console application and work with streams                                                                                                | intermediate | required | 1              |
| [Create csv enumerable](./tasks/csv-enumerable/readme.md)                                                                             | task               | Implement class which can enumerate records from csv filefile.                                                                                    | beginner     | required | 3              |
| [JSON](./theory/json/readme.md)                                                                                                       | theory group       | Read about how to work witn JSON                                                                                                                  | beginner     | required | 2.7            |
| [XML](./theory/xml/readme.md)                                                                                                         | theory group       | This theory introduces basic knowledge about built-in .NET classes to operate with XML.                                                           | beginner     | optional | 1              |
| [LINQ to XML](./theory/linq-to-xml/readme.md)                                                                                         | documentation part | This theory introduces basic knowledge about in-memory XML programming interface that leverages LINQ.                                             | beginner     | optional | 0.6            |

## Books

* CLR via C# (Developer Reference) - Jeffrey Richter
* [Book of the runtime](https://github.com/dotnet/coreclr/tree/master/Documentation/botr)

# Adapter

## Short Description

You must solve the task using one of the design patterns.

## Estimation (h)

1

## Topics

* OOP
* Design patterns

## Requirements

You have class, which return list of books in XML format. And you have
another class, which accept list of books in json format and return
oldest book from the list. Implement class, which will help to use xml
list of book as a provider of data for second class.

```java
class Library
    method getBooksXML()

class BooksAnalyzer
    method getOldestBook(json booksList)
```

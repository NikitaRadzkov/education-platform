# Proxy

## Short Description

You must solve the task using one of the design patterns.

## Estimation (h)

1

## Topics

* OOP
* Design patterns

## Requirements

You have a class that receives yesterday's exchange rate from an
external resource.

```java
interface IYesterdayRate
    method getRate()

class YesterdayRate implements IYesterdayRate
    method getRate()
```

Implement a class with the same interface that will cache the results of
queries to an external resource?

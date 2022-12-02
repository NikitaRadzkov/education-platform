# Caching decorator

## Short Description

Implement generic proxy and decorator.

## Estimation (h)

4

## Topics

* Decorators
* Designing types
* Classes
* Magic methods

## Requirements

Implement generic proxy which is able to log each object method invocation.
Implement decorator for storing function call results. The function being
memoized is:

```python
def fibonacci_numbers(n):
    assert n >= 0
    if n < 2:
        return n
    else:
        return fibonacci_numbers(n-1) + fibonacci_numbers(n-2)
```

* Implement decorator as class with and store cache as an attribute
* Store  pairs  arg:result in  a  dictionary  in  an attribute of the class object

## Advanced Requirements

* Your decorator should support functions with variable number of arguments

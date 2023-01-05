# Create Logging Proxy

## Short Description

Implement generic proxy which is able to log each object method invocation.

## Estimation (h)

8

## Depends On

[Create Logger](../logger/readme.md)

## Topics

* Designing types
* Reflection
* Dynamic object

## Requirements

* Implement class LoggingProxy\<T> which is able to log each object method invocation which implements interface T. To
    fit this requirement consider inheriting LoggingProxy\<T> from dynamic object.
* LoggingProxy\<T> should have public method T CreateInstance(T obj) which returns logging proxy which acts like T. To
    implement such a method consider using library
    [ImpromptuInterface](https://github.com/ekonbenefits/impromptu-interface)
* Use logger developed at task [Create Logger](../logger/readme.md) to write logs

## Advanced Requirements

* Implement abstract class DynamicProxy\<T> and inherit LoggingProxy\<T> from this class

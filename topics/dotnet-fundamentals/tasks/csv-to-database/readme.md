# Write from csv to database

## Short Description

Create a console application which is able to read data from csv file and write it to the database

## Estimation (h)

8

## Depends On

[Logging Proxy](../logging-proxy/readme.md)
[CSV Enumerable](../csv-enumerable/readme.md)

## Topics

* Designing types
* Asynchronous computing

## Requirements

* Create data access level using [Repository pattern](https://deviq.com/repository-pattern/). The goal of this task is
    not to dig into details of working with database but to understand how asynchronous code works. So there is no need to
    use [Entity Framework](https://docs.microsoft.com/en-us/ef/) or any other ORM to implement this task. You can use any
    Sql/NoSql database and any library/framework which doesn’t require a lot of effort to be set up. You can use
    [RavenDb](https://ravendb.net/) or any other database.
* Each method invocation of Repository\<T> should be logged using [Logging Proxy](../logging-proxy/readme.md)
* Use csv enumerable developed at task [Csv Enumerable](../csv-enumerable/readme.md)

## Advanced Requirements

* Store application configuration settings like connection strings and csv file path in config file

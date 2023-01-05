# Database SQL Fundamentals

## Version

1.0.1

## Introduction

After the course trainees are supposed to have theoretical knowledge and practical experience in SQL.

## Topics

* The Basics
  * Relational Databases
  * Normalization
* Creating tables
* SQL constraints
* Alter statements
* Indexes
* Getting data
  * Conditions
  * Sorting
  * Grouping
  * Subqueries
  * Joins
  * Requests to JSON
* Modifying data
* Transactions
* SQL Views
* SQL functions
* Stored procedures

## Prerequisites

### Technical

Basic knowledge of databases principles.

### Environment

* Any command-line tool
* MS SQL
  * MS SQL Server Management Studio
* Postgre SQL
  * dbForge Studio

## Plan

| Name                                                                                                                             | Type          | Short Description                                                                                                    | Priority | Estimation (h) |
| -------------------------------------------------------------------------------------------------------------------------------- | ------------- | -------------------------------------------------------------------------------------------------------------------- | -------- | -------------- |
| [Transact-SQL Reference](https://docs.microsoft.com/en-us/sql/t-sql/language-reference?view=sql-server-2017)                     | documentation | Read about Transact SQL capabilities                                                                                 | 1        | 16             |
| [Transact-SQL Tutorial](https://www.youtube.com/watch?v=GOvQUd6-ttE&list=PLvItDmb0sZw_ALKpj5uy5k71w28L5Xmol)                     | video         | Watch screencasts about Transact SQL                                                                                 | 1        | 16             |
| [A Visual Explanation of SQL Joins](https://blog.codinghorror.com/a-visual-explanation-of-sql-joins/)                            | article       | Read about sql joins                                                                                                 | 1        | 2              |
| [SQL Interactive Tutorial](https://sqlzoo.net/wiki/SQL_Tutorial)                                                                              | interactive          | SQL Interactive Tutorial                                                   | 1        | 3             |
| [SQL Injection Attack](https://sqlzoo.net/hack/)                                                                              | interactive          | SQL Injection Attack                                                   | 1        | 2             |
| [SQL Server Management Studio](https://docs.microsoft.com/en-us/sql/ssms/sql-server-management-studio-ssms?view=sql-server-2017) | documentation | Read about integrated environment for managing, administering, and developing all components of MS SQL Server        | 3        | 8              |
| [PostgreSQL Tutorial](https://www.youtube.com/watch?v=AjUVGzSuO_k&list=PLvItDmb0sZw_9bh2KeIKe4KkqKmhLbj3Z&index=2)               | video         | Watch screencasts about PostgreSQL                                                                                   | 2        | 4              |
| [PostgreSQL Manuals](https://www.postgresql.org/docs/manuals/)                                                                   | documentation | Read about PostgreSQL                                                                                                | 3        | 24             |
| [PostgreSQL JSON](https://www.postgresql.org/docs/9.5/functions-json.html)                                                       | documentation | Read documentation about JSON function in PostgreSQL                                                                 | 3        | 2              |
| [Medical Research](./tasks/medical-research/readme.md)                                                                           | task          | Write sql queries to perform CRUD operations                                                                         | 1        | 24             |
| [Update Great Star Financial Profile](./tasks/update-great-star-financial-profile/readme.md)                                     | task          | Implement a stored procedure that will update user data in the database table based on the values from another table | 2        | 16             |
| [Requests to JSON](./tasks/json-requests/readme.md)                                                                              | task          | Implement a list of tasks related to work with PostgreSQL JSON data                                                  | 3        | 12             |

## Table of Contents

* [Theory](./theory/readme.md)
* [Tasks](./tasks/readme.md)
* [Questions](./questions/readme.md)

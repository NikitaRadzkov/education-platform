# Console store

## Short Description

Console store, which allows you to execute CRUD operations with Products and Users.

## Estimation (h)

16

## Topics

* Collection Framework
* Exception Handling
* Java IO, NIO and NIO.2
* JDBC

## Requirements

* User
  * Id
  * Name
  * Last Name
  * Role
  * Email
  * Password
  * Additional fields
* Product
  * Id
  * Name
  * Price
  * Description
  * Additional fields

1. Implement simple console menu. For example: store | basket | profile | login. Navigate throw pages by Users input:
   "1" leads to "store".
2. All pages but "login" available only for logged in Users.
3. Implement login / registration.
4. Users should be able to execute only Read operations and add(remove) Products to(from) the basket.
5. Admins should be able to execute all CRUD operations with Users / Products. Create additional menu for Admins to
   save/update Products.
6. Implement validation for new Users / Products.
7. Use JDBC and PostgreSQL as a Database.
8. Create custom exceptions for all cases.
9. Implement logging of all events.

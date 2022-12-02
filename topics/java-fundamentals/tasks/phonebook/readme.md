# Console phonebook

## Short Description

Console application for using the phonebook. Contact information is stored in a file with which the application
interacts.

## Estimation (h)

10

## Topics

* Strings
* Collection Framework
* Exception Handling
* Aggregate Operations and Stream API
* Java File IO
* Regular Expressions
* Java Date and Time
* Serialization/Deserialization
* Reflection

## Requirements

* Contact
  * First Name
  * Last Name
  * Phone Number
  * Creating date
  * Additional fields

1. Implement simple console menu for application. For example: add contact | update contact | delete contact | select
   all | log off. Navigate throw pages by Users input: "1" leads to "add contact".
2. All fields must be validated before entering.
3. All information should be stored in a file.
4. The user enters first name, last name, phone number and other additional fields into the console, then the date of
   creation of this contact is automatically added.
5. The user can perform all CRUD operations with the phonebook.
6. After reading the data from the file, it must be converted to an object with the appropriate fields.
7. Create custom exceptions for all cases.
8. Implement logging of all events.

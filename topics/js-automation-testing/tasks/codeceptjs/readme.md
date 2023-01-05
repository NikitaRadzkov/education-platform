# CodeceptJS

## Short Description

Creating data necessary for the test using Hooks via API

## Estimation (h)

8

## Topics

* CodeceptJS
* API
* Hooks

## Requirements

* Automate the test case below using CodeceptJS
* Use hooks for precondition and postcondition
* Add error messages in assertions

### Test Case

Resource: <https://petstore.swagger.io/>

Precondition:

1. Create user (POST v2/user) and verify response message

Case:

1. Login created user (GET v2/user/login) and verify response message
2. Logout user (GET v2/user/logout) and verify response message

Postcondition:

1. Delete created user (DELETE v2/user/{username})

# Rest/Api testing

## Short Description

Create a solution for API tests with help of RestSharp or/and HTTP libraries.

## Estimation (h)

18

## Topics

* .Net Automation testing. Test framework
* REST/API testing

## Requirements

* Create a solution for API testing of resource [source](https://gorest.co.in/public-api/users) . Information for this
  service you could find here: [information](https://gorest.co.in/).
* The solution should test the following cases:
  * Create User. Verify the user is created and the status code of the response
  * Update User. Verify the user is updated and the status code of the response
  * Delete User. Verify the user is deleted, verify the status code
  * Get user by Id. Verify the response body and status code
  * Get user by fake Id. Verify that response returns the 404 error
  * Try to create User without Bearer token. Verify 401 error in response
* Create class User and deserializes JSON response to an User class.

Note: Pay attention that request methods PUT, POST, PATCH, DELETE need access token, which needs to be passed in
"Authorization" header as Bearer token.

## Advanced Requirements

* Tests should be independent
* Tests should be idempotent
* Request's Content type should be JSON

# Postman

## Short Description

Learn in practice how to use Postman to test API.

## Estimation (h)

12

## Topics

* Tools for Testing

## Requirements

### Target API

[Discogs](https://www.discogs.com/developers/#page:authentication,header:authentication-oauth-flow)

### Task

* Explore the public API by reading its documentation
* Send the following requests to the API:
  * Get information about a release
  * Create a custom folder in the Collection
  * Add several releases to this folder
  * Change the rating of a release in the Collection
  * Add a release to the Wantlist using a PUT request
  * Delete a release from the Wantlist
* You should do the following in the Postman app:
  * Create a workspace for the API and add at least 2 collections
  * Fill in the Authorization tab for at least one collection
  * Create a custom environment and add several variables
  * Use these variables in your requests
  * Export your collections
  * Run your collection(s) and export results

### Result

* Exported collections and results

## Advanced Requirements

* Add pre-request scripts for requests

    You can use pre-request scripts in Postman to execute JavaScript before a request runs. By including code in the
    Pre-request Script tab for a request, collection, or folder, you can carry out pre-processing such as setting variable
    values, parameters, headers, and body data.

* Add tests for requests

    You can write test scripts for your Postman API requests in JavaScript. Tests allow you to ensure that your API is
    working as expected, to establish that integrations between services are functioning reliably, and to verify that new
    developments haven't broken any existing functionality.

# Fiddler

## Short Description

Learn in practice how to use Fiddler to monitor all HTTP(S) traffic, compose and mock requests.

## Estimation (h)

6

## Topics

* Tools for Testing

## Requirements

### Target API

[Discogs](https://www.discogs.com/developers/#page:authentication,header:authentication-oauth-flow)

### Task

* Explore OAuth Flow for the Discogs API
* Using [Fiddler Everywhere](https://www.telerik.com/download/fiddler-everywhere) send at least one authenticated
  request through Discogs OAuth. A successful request should yield a response that contains information about the
  authenticated user: `GET <https://api.discogs.com/oauth/identity>`
* Inspect all requests on the [Discogs page](https://www.discogs.com/) and find a request that contains JSON data in
  response. Use the "Auto Responder" feature to mock the response:
  * Change 200 Ok response to 404 Page Not Found
  * Modify JSON data in the response
  * Redirect the response to another page

### Result

* Screenshots and/or video describing the authorization process for Discogs API
* Exported rules for the mocked requests

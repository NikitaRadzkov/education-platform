# Web and API Testing

## Version

1.0.0

## Introduction

After this course you will be able to test Web applications and API. You will get fundamental knowledge of what is Web
and how Web Applications work, learn Web specific testing types, get familiar with API and tools for its testing.

## Table of Contents

* [Tasks](./tasks/readme.md)
* [Questions](./questions/readme.md)

## Topics

### Beginner

* Web Basics
  * MAC Address
  * DNS
  * URI, URL, URN
  * HTTP
  * Cookies, Sessions, Tokens
  * HTML and CSS
* Web Browsers
  * Introduction
* Responsive and Adaptive Design
* Types of Testing
  * Cross-Browser (Compatibility)
  * Globalization
* Tools for Testing
  * Browser Dev Tools

### Intermediate

* Web Browsers
  * Browser Architecture
  * Renderer Process
  * Browser Engine
* Web Application Architecture
* Types of Testing
  * Usability
  * Accessibility
  * Load and Performance
  * Security
* API
  * Web Services
  * REST API
  * API Data Formats
  * API Testing
* Tools for Testing
  * Postman
  * Fiddler and Charles

## Plan

| Name                                                                                                                                                                                                                    | Type         | Short Description                                                                               | Level        | Required | Estimation (h) |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------ | ----------------------------------------------------------------------------------------------- | ------------ | -------- | -------------- |
| [MAC Address](https://www.geeksforgeeks.org/introduction-of-mac-address-in-computer-network/)                                                                                                                           | article      | Read introduction into MAC addressing.                                                          | beginner     | required | 1              |
| [DNS](https://habr.com/ru/post/137587/)                                                                                                                                                                                 | article      | Read about Domain Name System.                                                                  | beginner     | required | 1.5            |
| [URI, URL & URN](https://habr.com/ru/post/232385/)                                                                                                                                                                      | article      | Read the article to get common information about URI, URL & URN.                                | beginner     | required | 1.5            |
| [URI, URL & URN Differences](https://www.youtube.com/watch?v=vpYct2npKD8)                                                                                                                                               | video        | Watch video to understand differences between URI, URL & URN.                                   | beginner     | optional | 0.5            |
| [HTTP](https://habr.com/ru/post/215117/)                                                                                                                                                                                | article      | Read HTTP introduction.                                                                         | beginner     | required | 1.5            |
| [Cookies Overview](https://javascript.info/cookie/)                                                                                                                                                                     | article      | Read about Web Cookies.                                                                         | beginner     | required | 1.5            |
| [Types of Cookies](https://www.makeuseof.com/tag/types-browser-cookies-to-know-about/)                                                                                                                                  | article      | Read the article and watch the videos inside about different types of Web Cookies.              | beginner     | required | 1              |
| [Sessions & Cookies](https://www.youtube.com/watch?v=64veb6tKTm0)                                                                                                                                                       | video        | Watch video explaining differences between Sessions and Cookies.                                | beginner     | required | 0.5            |
| [Cookies, Session & Tokens](https://www.youtube.com/watch?v=44c1t_cKylo)                                                                                                                                                | video        | Watch video explaining differences between Cookies, Sessions and Tokens.                        | beginner     | required | 0.5            |
| [Internet Technologies](https://en.ppt-online.org/167958)                         | presentation | Learn about the World Wide Web and its components.                                              | beginner     | required | 0.5            |
| [HTML and CSS](https://www.youtube.com/watch?v=IOk-S5h8rpc&ab_channel=ArtsiomRusauQALife)                                                                                               | video        | Watch video about HTML and CSS.                                                           | beginner     | required | 2.5            |
| [Web Browser](https://en.wikipedia.org/wiki/Web_browser)                                                                                                                                                                | article      | Read about what is Web Browser.                                                                 | beginner     | required | 0.5            |
| [Inside Web Browser (Part 1)](https://developers.google.com/web/updates/2018/09/inside-browser-part1)                                                                                                                   | article      | Read about browser architecture.                                                                | intermediate | required | 1              |
| [Inside Web Browser (Part 2)](https://developers.google.com/web/updates/2018/09/inside-browser-part2)                                                                                                                   | article      | Read about what happens in browser on navigation.                                               | intermediate | required | 1              |
| [Inside Web Browser (Part 3)](https://developers.google.com/web/updates/2018/09/inside-browser-part3)                                                                                                                   | article      | Read about how browser renders pages.                                                           | intermediate | required | 1              |
| [Inside Web Browser (Part 4)](https://developers.google.com/web/updates/2018/09/inside-browser-part4)                                                                                                                   | article      | Read about what happens in browser on user input.                                               | intermediate | required | 1              |
| [Web Application Architecture](https://svitla.com/blog/web-application-architecture)                                                                                                                                    | article      | Read about architecture of Web Apps.                                                            | intermediate | required | 1              |
| [Browser Engines](https://www.lambdatest.com/blog/browser-engines-the-crux-of-cross-browser-compatibility/)                                                                                                             | article      | Learn about Browser Engine and different engines in the most popular browsers.                  | intermediate | required | 1              |
| [Browser Dev Tools](https://www.youtube.com/watch?v=a3vRm9neKhs&ab_channel=ArtsiomRusauQALife)                             | presentation | Learn useful features of Browser Dev Tools.                                                     | beginner     | required | 1              |
| [Responsive and Adaptive Design](https://www.youtube.com/watch?v=BGAI4U683_A&ab_channel=uxable-learninguxtogether)                          | video        | Watch video about Responsive & Adaptive design.                                            | beginner     | required | 1              |
| [Responsive and Adaptive Design](https://xd.adobe.com/ideas/process/ui-design/adaptive-design-vs-responsive-design/#:~:text=The%20responsive%20design%20will%20reconfigure,to%20the%20users%20screen%20size.) | article | Read about Responsive & Adaptive design.                                                        | beginner     | optional | 1              |
| [Responsive Design](https://www.youtube.com/watch?v=zF6VSky4SIc&ab_channel=JesseShowalter)                                                    | video        | Watch video about the best practices in Responsive design.                                      | beginner     | required | 0.5            |
| [Responsive and Adaptive Design](./tasks/responsive-and-adaptive-design/readme.md)                                                                                                                                      | task         | Practice in defining application layout and testing on different viewports.                     | beginner     | required | 10             |
| [Compatibility and Cross-Browser Testing](https://www.testquality.com/blog/tpost/0oxdc9dez1-what-is-cross-browser-compatibility-test#:~:text=Cross%20Browser%20Testing%20is%20a,is%20compatible%20with%20many%20browsers.)       | article | Read about Compatibility testing for Web Applications.                                          | beginner     | required | 0.5            |
| [Cross-Browser Testing](./tasks/cross-browser-testing/readme.md)                                                                                                                                                        | task         | Test an application in different browsers.                                                      | beginner     | required | 8              |
| [Compatibility Testing](./tasks/compatibility-testing/readme.md)                                                                                                                                                        | task         | Test an application on devices with different screen sizes/resolutions.                         | beginner     | required | 8              |
| [Usability Testing](https://www.youtube.com/watch?v=nYCJTea1AUQ&ab_channel=GoogleCareerCertificates)                                       | video        | Watch screencast about Usability testing.                                                       | intermediate | required | 1              |
| [Usability Testing](https://www.interaction-design.org/literature/topics/usability-testing)              | article | Read about Usability testing.                                                                   | intermediate | optional | 1              |
| [Usability Testing Principles](https://medium.com/@ysfqwe1/ten-principles-of-usability-testing-heuristic-evaluation-in-singapore-e24b891cbe3a)                                                                           | article | Read about the most important principles of Usability testing.                                  | intermediate | optional | 1              |
| [Usability Testing](./tasks/usability-testing/readme.md)                                                                                                                                                                | task         | Find good and bad examples of usability.                                                        | intermediate | required | 8              |
| [Globalization Testing](https://www.softwaretestinghelp.com/globalization-testing/)                                                                                                                                     | article      | Read about Globalization, Internationalization and Localization testing.                        | beginner     | required | 1              |
| [Localization Testing](./tasks/localization-testing/readme.md)                                                                                                                                                          | task         | Test an application in different languages.                                                     | beginner     | required | 5              |
| [Introduction to Web Accessibility](https://webaim.org/intro/)                                                                                                                                                          | article      | Read the article to understand what accessibility means in terms of Web.                        | intermediate | required | 1              |
| [Accessibility Testing](https://www.softwaretestinghelp.com/what-is-web-accessibility-testing/)                                                                                                                         | article      | Read Accessibility testing tutorial.                                                            | intermediate | required | 2              |
| [Manual Tests for Accessibility Compliance](https://medium.com/@lsnrae/12-manual-tests-for-accessibility-compliance-you-should-do-now-f8246eb59dde)                                                                     | article      | Read description of some manual tests from Web Content Accessibility Guidelines.                | intermediate | required | 1              |
| [Web Testing](./tasks/web-testing/readme.md)                                                                                                                                                                            | task         | Test a website using the knowledge that you got learned from the topic.                     | intermediate | required | 12             |
| [Load and Performance Testing](https://www.blazemeter.com/blog/performance-testing-vs-load-testing-vs-stress-testing)                  | article | Read about Load and Performance testing and tools to perform these types of testing.            | intermediate | required | 1              |
| [Security Testing](https://www.guru99.com/what-is-security-testing.html)                              | article | Read about Security testing and types of attacks.                                               | intermediate | required | 2.5            |
| [Web Services](https://www.ics.uci.edu/~cs237/lectures/webservices.ppt)                                  | presentation | Read about Web Services and tools for their testing.                                            | intermediate | required | 1              |
| [What is a RESTful API?](https://www.youtube.com/watch?v=Q-BpqyOT3a8&feature=youtu.be)                                                                                                                                  | video        | Watch video about REST API.                                                                     | intermediate | required | 0.5            |
| [Difference Between API and Web Service](https://medium.com/@programmerasi/difference-between-api-and-web-service-73c873573c9d)                                                                                         | article      | Read article to understand the differenct between API and Web Service.                          | intermediate | required | 0.5            |
| [Data Formats](https://nordicapis.com/what-data-formats-should-my-api-support/)                                                                                                                                         | article      | Learn about different data formats.                                                             | intermediate | required | 1.5            |
| [JSON vs XML](https://www.w3schools.com/js/js_json_xml.asp)                                                                                                                                                             | article      | Read about JSON and XML comparison.                                                             | intermediate | required | 0.5            |
| [API Testing](https://www.youtube.com/watch?v=BmLsefTC0tQ&ab_channel=Test-O-Blog)                                                                                                                                       | video        | Watch video explaining what is API and how to test it.                                          | intermediate | required | 0.5            |
| [Testing API with Postman](https://www.youtube.com/watch?v=zfrQtU8eCEo&ab_channel=ArtsiomRusauQALife)                                             | video        | Watch video about how to test API with Postman.                                                 | intermediate | optional |               |
| [Postman](./tasks/postman/readme.md)                                                                                                                                                                                    | task         | Learn in practice how to use Postman to test API.                                               | intermediate | required | 12             |
| [Fiddler Overview](https://docs.telerik.com/fiddler-everywhere/introduction)                                                                                                                                            | article      | Read about Fiddler and its usage scenarios.                                                     | intermediate | required | 0.5            |
| [Fiddler](./tasks/fiddler/readme.md)                                                                                                                                                                                    | task         | Learn in practice how to use Fiddler to monitor all HTTP(S) traffic, compose and mock requests. | intermediate | required | 6              |
| [Charles Overview](https://www.charlesproxy.com/overview/about-charles/)                                                                                                                                                | article      | Read about Charles and its key features.                                                        | intermediate | required | 0.5            |

## Additional Materials

* [Chrome Extension: ColorZilla](https://chrome.google.com/webstore/detail/colorzilla/bhlhnicpbhignbdhedgjhgdocnmhomnp?hl=en)
  \- Allows you to identify colors from web pages and find colors by codes.
* [Chrome Extension: Page Ruler](https://chrome.google.com/webstore/detail/page-ruler-redux/giejhjebcalaheckengmchjekofhhmal)
  \- Allows you to measure elements on web pages and distances between them.
* [Chrome Extension: PerfectPixel](https://chrome.google.com/webstore/detail/perfectpixel-by-welldonec/dkaagdgjmgdmbnecmcefdhjekcoceebi)
  \- Allows you to create layers and compare them by pixels.
* [User Inyerface](https://userinyerface.com/) - A fun game to understand usability better.

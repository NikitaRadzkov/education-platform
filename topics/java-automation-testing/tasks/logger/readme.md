# Add logger, webdriver manager to test

## Short Description

Add logger to your framework, add webdrivermanager lib and create new test

## Estimation (h)

2

## Topics

* Java
* Selenium
* TestNG
* PageObject
* Log4J
* WebdriverManager

## Requirements

* Get your last task and add [Logger](https://www.baeldung.com/java-logging-intro)
* Use [webdriver manager](https://github.com/bonigarcia/webdrivermanager) to get driver
* Create a new test and use logger for each action(click, type)

### Case 1

* Open yandex.ru page
* Check that page was opened(select uniq element on the page and check that element is exist)
* Type 'java' in search input
* Click search button
* Check that page was opened
* Check that page title has typed text
* Check that input has typed text
* Check that recommended page titles contains 'java'
* Type 'selenium' in search input
* Click search button
* Check that page was opened
* Check that page title has typed text
* Check that input has typed text
* Check that recommended page titles contains 'selenium'

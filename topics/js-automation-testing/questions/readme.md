# Questions

## Beginner

### Playwright

<details>
<summary>1. What is Playwright?</summary>

> **Answer:**
> Playwright can be best described as a new cross-browser, cross-language automation tool that helps in the complete end-to-end testing of a web application.
>
> Playwright also enables testing your code on the mobile emulation of Google Chrome on Android and Mobile Safari for iOS devices.

</details>

<details>
<summary>2. Which browsers are supported by Playwright?</summary>

> **Answer:**
> When you’re downloading Playwright, it comes with it’s own bundle of browsers. As of now, Playwright has support for
>
> * Chromium
> * Google Chrome
> * Firefox
> * MS Edge
> * Webkit

</details>

<details>
<summary>3. Which browsers are supported by Playwright?</summary>

> **Answer:**
> No. Playwright doesn’t has any dependency on any Webdriver bindings.

</details>

<details>
<summary>4. Does Playwright support handling network level request intercepting and mocking?</summary>

> **Answer:**
> Yes, Playwright has full capabilities regarding handling request intercepting and mocking. It can be used for making API requests as well.

</details>

<details>
<summary>5. Can I use Playwright to run tests in parallel?</summary>

> **Answer:**
> Running tests in parallel is the property of a test-runner. If you’re using a third party test runner like Jest/Mocha, then capabilities are provided at test-runner level for parallelism.

</details>

### Cypress

<details>
<summary>1. What is Cypress?</summary>

> **Answer:**
> Cypress is a javascript based entry and testing framework.
>
> It is built on top of the mocha which is again a feature in the javascript test framework learning on Algiers and in the browser making asynchronous testing simple and fun.
>
> Cypress also uses chai or BDD and TDD assertions library for note and the browser that can be paired with any javascript testing framework.
>
> Additionally, Cypress is a free open source which is focused on developers and QA engineers. You can do Unit testing, integration testing, and internal testing by writing test cases using Cypress.

</details>

<details>
<summary>2. Does Cypress use Selenium?</summary>

> **Answer:**
> Cypress does not use selenium. Cypress is one of the free popular test automation tools that does not run on Selenium along with puppeteer. Cypress runs tests directly inside a browser.
>
> Basically, Cypress executes in the same loop as your application runs which is one of its greatest advantages.
>
> Compared to the selenium frameworks, Cypress executes commands outside your application through the network.

</details>

<details>
<summary>3. What is a fixture?</summary>

> **Answer:**
> Basically, fixtures are used as external pieces of data that can be used by your test. fixture files are located in Cypress fixtures by default but you can configure them to other directories.
>
> You will typically use them with the `cy.fixture()` command and most often manually stubbing your network requests.

</details>

<details>
<summary>4. Does Cypress support Xpath?</summary>

> **Answer:**
> Cypress has no native support for Xpath. Cypress basically leverages the Jquery powerful selector engine to help make that familiar and readable format for developers.
>
> In effect, Cypress bundles Jquery and exposes many of its elements. So you're going to work with the complex HDMI structures with ease.
>
> But there are few third-party libraries that allow you to use Xpaths in your Cypress test.

</details>

<details>
<summary>5. How do you handle multiple Windows in Cypress?</summary>

> **Answer:**
> No, we can't handle multiple windows in Cypress

</details>

<details>
<summary>6. Which browsers are supported in Cypress?</summary>

> **Answer:**
> Cypress supports Google Chrome, electron, firefox, chromium, Microsoft edge.

</details>

<details>
<summary>7. How to assert something in Cypress?</summary>

> **Answer:**
> Cypress bundles the popular Chai assertion library, as well as helpful extensions for Sinon and jQuery, bringing you dozens of powerful assertions for free.
>
> BDD assertions:
>
>```javascript
>     expect(something).to.equal(someotherthing)
>```
>
> TDD assertions
>
>```javascript
>     assert.equal(something,someotherthing)
>```

</details>

<details>
<summary>8. What reporters are supported by Cypress?</summary>

> **Answer:**
>
> * Spec reporter is a default reporter on Mocha.
> * Dot Matrix
> * Nyan
> * Mochawesome
> * Other custom Mocha reporters

</details>

### TestCafe

<details>
<summary>1. What is TestCafe?</summary>

> **Answer:**
> TestCafe is an open source automation tool which is built on top of Node.js.
> It supports various browsers such as Google Chrome, Internet Explorer etc. to automate its scripts.

</details>

<details>
<summary>2. Give an example of a simple script in TestCafe</summary>

> **Answer:**
>
>```javascript
>     import { Selector } from 'testcafe';
>
>     fixture `Getting Started`
>        .page `http://devexpress.github.io/testcafe/example`;
>
>     test('My first test', async t => {
>        await t
>            .typeText('#developer-name', 'John Smith')
>            .click('#submit-button');
>     });
>```

</details>

<details>
<summary>3. How to assert something in TestCafe?</summary>

> **Answer:**
> TestCafe provides a comprehensive set of assertions that are based on the Behavior-Driven Development style (BDD-style).
>
> The following example shows the structure of the deep equality assertion:
>
>```javascript
>     await t.expect( actual ).eql( expected, message, options );
>```

</details>

<details>
<summary>4. What reporters are supported by TestCafe?</summary>

> **Answer:**
> TestCafe ships with the following reporters:
>
> * [spec](https://github.com/DevExpress/testcafe-reporter-spec)﻿ - used by default
> * [list](https://github.com/DevExpress/testcafe-reporter-list)
> * [minimal](https://github.com/DevExpress/testcafe-reporter-minimal)
> * [xUnit](https://github.com/DevExpress/testcafe-reporter-xunit)
> * [Json](https://github.com/DevExpress/testcafe-reporter-json)
>
> You can also create a custom reporter that fulfills your needs.

</details>

### WebDriverIO

<details>
<summary>1. What is WebDriverIO?</summary>

> **Answer:**
> WebdriverIO is an open source testing utility for nodejs.
>
> It makes it possible to write super easy selenium tests with Javascript in your favorite BDD or TDD test framework
>
> It basically sends requests to a Selenium server via the WebDriver Protocol and handles its response.
>
> These requests are wrapped in useful commands and can be used to test several aspects of your site in an automated way.
>
> **In Simple Terms:** WebdriverIO is a custom implementation for selenium’s W3C webdriver API. It is written in Javascript and packaged into ‘npm’ and runs on Node.js.

</details>

<details>
<summary>2. Which browsers are supported in WebDriverIO?</summary>

> **Answer:**
> WebDriverIO supports Google Chrome, Safari, firefox, PhantomJs, Microsoft edge.

</details>

<details>
<summary>3. What are the different testing frameworks supported by WebDriverIO?</summary>

> **Answer:**
> Some of the popular testing frameworks supported by WebDriverIO: Jasmine, Mocha, Cucumber.

</details>

### CodeceptJs

<details>
<summary>1. What is CodeceptJs?</summary>

> **Answer:**
> CodeceptJS is a modern end to end testing framework with a special BDD-style syntax. The tests are written as a linear scenario of the user's action on a site.

</details>

<details>
<summary>2. Give an example of a simple script in CodeceptJS</summary>

> **Answer:**
>
>```javascript
>     Feature('CodeceptJS demo');
>
>     Scenario('check Welcome page on site', ({ I }) => {
>      I.amOnPage('/');
>      I.see('Welcome');
>     });
>```

</details>

### NightwatchJS

<details>
<summary>1. What is NightwatchJS?</summary>

> **Answer:**
> NightwatchJS is an automated testing framework for web applications and websites, written in Node.js and using the W3C WebDriver API. This is a complete End-to-End testing framework that aims to simplify the process of setting up continuous integration and creating automatic tests.

</details>

### Protractor

<details>
<summary>1. What is Protractor?</summary>

> **Answer:**
> Protractor is an end-to-end test framework, designed for Angular and Angular JS applications. Protractor is a node.js port of the webdriver.io , which is the JavaScript implementation of Selenium framework.

</details>

<details>
<summary>2. What is ElementFinder and ElementArrayFinder?</summary>

> **Answer:**
> **ElementFinder**
>
> The ElementFinder simply represents a single element of an ElementArrayFinder (and is more like a convenience object). As a result, anything that can be done with an ElementFinder, can also be done using an ElementArrayFinder.
>
> The ElementFinder can be treated as a WebElement for most purposes, in particular, you may perform actions (i.e. click, getText) on them as you would a WebElement. Once an action is performed on an ElementFinder, the latest result from the chain can be accessed using the then method. Unlike a WebElement, an ElementFinder will wait for angular to settle before performing finds or actions.
>
> **ElementArrayFinder**
>
> ElementArrayFinder is used for operations on an array of elements (as opposed to a single element).
>
> The ElementArrayFinder is used to set up a chain of conditions that identify an array of elements. In particular, you can call all(locator) and filter(filterFn) to return a new ElementArrayFinder modified by the conditions, and you can call get(index) to return a single ElementFinder at position ‘index’.
>
> Similar to jquery, ElementArrayFinder will search all branches of the DOM to find the elements that satisfy the conditions (i.e. all, filter, get). However, an ElementArrayFinder will not actually retrieve the elements until an action is called, which means it can be set up in helper files (i.e. page objects) before the page is available, and reused as the page changes.
>
> SO, basically, if you’ve ever worked with Selenium in the past, you’d recognise that it is nothing but the difference between FindElement and FindElements.

</details>

<details>
<summary>3. What frameworks can be used with Protractor?</summary>

> **Answer:**
> Protractor can be used with a variety of frameworks. By default, Protractor comes bundled with Jasmine 2.0. You can also pair Protractor to use mocha, CucumberJS, Serenity.

</details>

<details>
<summary>4. How to assert something in Protractor?</summary>

> **Answer:**
> It depends on the assertion framework you’re using. In general , most of the e2e implementation done is based out of the default Jasmine 2.0 , which provides the assertion in this format.
>
>```javascript
>     expect(something).toEqual(someotherthing)
>```
>
> In case you’re using Mocha with a Chai as the assertion engine, you can use either of the three assertion types provided by Chai as
>
>```javascript
>     expect(something).to.equal(someotherthing)
>     something.should.equal(someotherthing)
>     assert.equal(something,someotherthing)
>```

</details>

<details>
<summary>5. I am using the getText() method but it is not returning the result. Why?</summary>

> **Answer:**
> This is faced by a lot of beginners and a lot of people who are moving from languages like Java, Python over to Protractor.
> In Java, or Python, if you simply write the getText() method, it returns the corresponding text from the element.
>
> In Protractor, however, this is a bit different, and so many times people will see that the result of the getText() method is something like \[objectObject].
> This is because the getText() method returns a Promise, which you need to resolve in order to get the text. So what you need to do is
>
>```javascript
>     element.getText().then(function(text){
>     console.log(text);
>     });
>```
>
> or using the arrow operator syntax, which I prefer,
>
>```javascript
>     element.getText().then((text)=>{
>     console.log(text);
>     });
>```

</details>

<details>
<summary>6. How can you do reporting in Protractor?</summary>

> **Answer:**
> Protractor doesn’t comes bundled with any reporting tool. However based on the framework that you’re using, you can use a lot of reporters. For eg, you can use Allure with Jasmine 2.0 with Protractor, Mochawesome when using with Mocha and Cucumber specific reporters when working with Cucumber.

</details>

<details>
<summary>7. How to run multiple specs in Protractor?</summary>

> **Answer:**
> In order to run multiple spec files in Protractor, you just need to mention them in the spec flag in an array.
> For eg, let’s say I have two different spec files `test1_spec.js` and `test2_spec.js`, so I can do this
>
>```javascript
>     specs : ['./test/test1_spec.js','./test/test2_spec.js']
>```
>
> This will make Protractor run these multiple spec files.

</details>

<details>
<summary>8. How to run a headless Chrome in Protractor?</summary>

> **Answer:**
> This can be done using the `--headless` flag inside the `ChromeOptions` in your capabilities in the `conf.js` file.\
> A simple example, inside your `conf.js` file, you can have this
>
>```javascript
>     capabilities: {
>            browserName: 'chrome',
>
>            chromeOptions: {
>                args: [ "--headless", "--disable-gpu", "--window-size=800,600" ]
>            }
>        }
>```

</details>

<details>
<summary>9. What is an onPrepare function used for in Protractor configuration?</summary>

> **Answer:**
> The `onPrepare` method in Protractor is used for any global configuration.

</details>

<details>
<summary>10. How to use async/await in Protractor?</summary>

> **Answer:**
> In order to use the `async/await` feature, you’ll have to disabled the promise manager first.
> So you need to do `SELENIUM_PROMISE_MANAGER: false` in the `conf.js` file and then in your tests you can do something like this
>
>```javascript
>     it('is a simple implementation of async', async()=>{
>
>     await (expect(something).toEqual(something));
>
>     })
>```

</details>

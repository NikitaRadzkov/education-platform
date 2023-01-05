# Exam questions

<details>
<summary>1. What is Selenium IDE?</summary>

> **Answer:**
> Selenium IDE is browser extension that is designed to record your interactions with websites to help you generate and maintain site automation, tests, and remove the need to manually step through repetitive takes.

</details>

<details>
<summary>2. Which steps are included in script creation process?</summary>

> **Answer:**
> Recording, Playing Back, Saving.

</details>

<details>
<summary>3. Pros and cons of Selenium IDE?</summary>

> **Answer:**
> Pros:
>
> 1. Low barrier for entry
> 2. Test suites are light-weight and very portable
> 3. It’s free
> 4. Well Documented
> 5. Supports plug-ins
> 6. Code Export.
>
> Cons:
>
> 1. Hard to maintain
> 2. No data driven scripts
> 3. No built in reporting capabilities
> 4. No technical support
> 5. The tool offers very limited functionality and doesn’t work on all types of web applications.

</details>

<details>
<summary>4. What is Selenium Grid?</summary>

> **Answer:**
> Selenium Grid is a part of the Selenium Suite that specializes in running multiple tests across different browsers, operating systems, and machines in parallel. It is achieved by routing the commands of remote browser instances where a server acts as a hub. A user needs to configure the remote server in order to execute the tests.

</details>

<details>
<summary>5. What is the main reasons to use Selenium Grid?</summary>

> **Answer:**
> Run your tests against different browsers, operating systems, and machines all at the same time.

Save time in the execution of your test suites.

</details>

<details>
<summary>6. What is Selenium Grid architecture?</summary>

> **Answer:**
> The Hub
>
> * The hub is the central point where you load your tests into.
> * There should only be one hub in a grid.
> * The hub is launched only on a single machine, say, a computer whose O.S is Windows 7 and whose browser is IE.
> * The machine containing the hub is where the tests will be run, but you will see the browser being automated on the node.
>
> The Nodes
>
> * Nodes are the Selenium instances that will execute the tests that you loaded on the hub.
> * There can be one or more nodes in a grid.
> * Nodes can be launched on multiple machines with different platforms and browsers.
> * The machines running the nodes need not be the same platform as that of the hub.

</details>

<details>
<summary>7. How to configure test scripts to run on the Grid?</summary>

> **Answer:**
>
> * DesiredCapabilites is used to set the type of browser and OS that we will automate
> * RemoteWebDriver is used to set which node (or machine) that our test will run against.

</details>

<details>
<summary>8. What is Selenium Webdriver?</summary>

> **Answer:**
> Selenium WebDriver is a browser automation framework that accepts commands and sends them to a browser. It is implemented through a browser-specific driver. It controls the browser by directly communicating with it. Selenium WebDriver supports Java, C#, PHP, Python, Perl, Ruby.

</details>

<details>
<summary>9. How do selenium wedbriver scripts communicate with browser?</summary>

> **Answer:**
> When the automation script is executed, the following steps happen:
>
> * for each Selenium command, a HTTP request is created and sent to the browser driver
> * the browser driver uses a HTTP server for getting the HTTP requests
> * the HTTP server determines the steps needed for implementing the Selenium command
> * the implementation steps are executed on the browser
> * the execution status is sent back to the HTTP server
> * the HTTP server sends the status back to the automation script.

</details>

<details>
<summary>10. How page DOM can be inspected?</summary>

> **Answer:**
> Developer tools => Elements tab or right-click on element => inspect.

</details>

<details>
<summary>11. What types of locators can be used in selenium?</summary>

> **Answer:**
> Id, Name, LinkText, Tag Name, Class Name, DOM Locator, Css Selector, Xpath.

</details>

<details>
<summary>12. How to find div with text “TextElement” using Xpath?</summary>

> **Answer:**
>
> ```xpath
> //div[contains(text(), ‘TextElement’)] or //div[text() = ‘TextElement’]
> ```

</details>

<details>
<summary>13. How to get element in code?</summary>

> **Answer:**
`_driver.FindElement(By.Id("user[login]"));`
// OR
`_driver.FindElements(By.Xpath("//div[contains(text(), ‘TextElement’)]"));`
>
> (syntax depends on language)

</details>

<details>
<summary>14. How to understand if element is displayed on page?</summary>

> **Answer:**
> IWebElement interface have Displayed property.

</details>

<details>
<summary>15. What will return Displayed property if element is not present in DOM?</summary>

> **Answer:**
> “NoSuchElementException” exception will be thrown as before accessing Displayed property  - element should be found in DOM.

</details>

<details>
<summary>16. How to enter text in input?</summary>

> **Answer:**

`_element. SendKeys();`

> (Syntax depends on programming language)

</details>

<details>
<summary>17. How to get any element attribute value?</summary>

> **Answer:**

`_element.GetAttribute(“Attribute name”);`

> (Syntax depends on programming language)

</details>

<details>
<summary>18. How to refresh page?</summary>

> **Answer:**

`_driver.Navigate.Refresh();`

> (Syntax depends on programming language)

</details>

<details>
<summary>19. How to switch to another tab?</summary>

> **Answer:**
> Command to switch to tab is – \_driver.SwitchTo().Window(“Tab Name”). But to use it you firstly need to find tab name. So the whole flow should be like:
>
>```java
> var tab = _driver.WindowHandles.Last(); // Get name of the last opened tab
> _driver.SwitchTo().Window(tab);
> ```
>
> (Syntax depends on programming language)

</details>

<details>
<summary>20. How to get current focused tab?</summary>

> **Answer:**

`_driver.CurrentWindowHandle;`

> (Syntax depends on programming language)

</details>

<details>
<summary>21. How to drag and drop element?</summary>

> **Answer:**

`_actions.DragAndDrop(Sourcelocator, Destinationlocator)`

> (Syntax depends on programming language)

</details>

<details>
<summary>22. What types of waits can be used in selenium?</summary>

> **Answer:**
> Explicit waits are available to Selenium clients for imperative, procedural languages. They allow your code to halt program execution, or freeze the thread, until the condition you pass it resolves. The condition is called with a certain frequency until the timeout of the wait is elapsed. This means that for as long as the condition returns a falsy value, it will keep trying and waiting.

There is a second type of wait that is distinct from explicit wait called implicit wait. By implicitly waiting, WebDriver polls the DOM for a certain duration when trying to find any element. This can be useful when certain elements on the webpage are not available immediately and need some time to load.

> Implicit waiting for elements to appear is disabled by default and will need to be manually enabled on a per-session basis. Mixing explicit waits and implicit waits will cause unintended consequences, namely waits sleeping for the maximum time even if the element is available or condition is true.

</details>

<details>
<summary>23. What are the conditions for explicit waits?</summary>

> **Answer:**
> Because it is quite a common occurrence to have to synchronise the DOM and your instructions, most >clients also come with a set of predefined expected conditions. As might be obvious by the name, >they are conditions that are predefined for frequent wait operations.
> The conditions available in the different language bindings vary, but this is a non-exhaustive list >of a few:
>
> * alert is present
> * element exists
> * element is visible
> * title contains
> * title is
> * element staleness
> * visible text
>
> Also custom conditions can be set by user.

</details>

<details>
<summary>24. How to handle Alerts?</summary>

> **Answer:**

`_driver.SwitchTo().Alert().Dismiss();`
`_driver.SwitchTo().Alert().Accept()`
`_driver.SwitchTo().Alert().SendKeys("Text");`

> (Syntax depends on programming language)

</details>

<details>
<summary>25. What is iFrame and how to handle it?</summary>

> **Answer:**
> An iframe is also known as the inline frame. It is a tag used in HTML5 to embed an HTML document within a parent HTML document. An iframe tag is defined using <iframe></iframe> tags.
> To switch to iFrame next commands can be used:

`WebDriver.SwitchTo().Frame(int  frame number);`
`WebDriver.SwitchTo().Frame(string  frameNameOrId);`
`WebDriver.SwitchTo().Frame(WebElement  frameElement);`

> (Syntax depends on programming language)

</details>

<details>
<summary>26. How to scroll down the page is Actions does not work?</summary>

> **Answer:**
>
>```java
> var js = (IJavascriptExecutor)_driver;
> js.ExecuteScript("window.scrollBy(0,600)");
>```
>
> (Syntax depends on programming language)

</details>

<details>
<summary>27. How to check expected result?</summary>

> **Answer:**
> Using assert mechanism.

</details>

<details>
<summary>28. What the difference between _driver.Close and_driver.Quit();</summary>

> **Answer:**
> Close – closes only current tab. Quit – browser with all tabs.

</details>

<details>
<summary>29. Why “Stale reference exception” can be thrown?</summary>

> **Answer:**
> Element was found once, and before interaction – it changed it\`s state (as an example – it was moved a bit, or was resized).

</details>

**[⬆ back to top](#exam-questions)**

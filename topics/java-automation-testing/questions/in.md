# Interview Questions

## Test Frameworks

<details>
<summary>What is a framework?</summary>
 
>**Answer:**
> The framework is a constructive blend of various guidelines, coding standards, concepts, processes, practices,
> project hierarchies, modularity, reporting mechanism, test data injections etc. to pillar automation testing.
</details>

<details>
<summary>What are the different types of frameworks?</summary>
 
>**Answer:**
> Data Driven Testing Framework: Data Driven Testing Framework helps the user segregate the test script logic and the
> test data from each other. It lets the user store the test data into an external database. The data is conventionally
> stored in “Key-Value” pairs. Thus, the key can be used to access and populate the data within the test scripts.
> 
> Keyword Driven Testing Framework: The Keyword Driven testing framework is an extension to Data-driven Testing
> Framework in a sense that it not only segregates the test data from the scripts, it also keeps the certain set of
> code belonging to the test script into an external data file.
>
> Hybrid Testing Framework: Hybrid Testing Framework is a combination of more than one above mentioned frameworks.
> The best thing about such a setup is that it leverages the benefits of all kinds of associated frameworks.
> Behavior Driven Development Framework: Behavior Driven Development framework allows automation of functional
> validations in an easily readable and understandable format to Business Analysts, Developers, Testers, etc.
</details>

<details>
<summary>What is Junit?</summary>
 
>**Answer:**
> Junit is a unit testing framework introduced by Apache. Junit is based on Java.
</details>

<details>
<summary>What are Junit annotations?</summary>
 
>**Answer:**
> Following are the JUnit Annotations:
> ```
> @Test: Annotation lets the system know that the method annotated as @Test is a test method. There can be multiple test methods in a single test script.
> @Before: Method annotated as @Before lets the system know that this method shall be executed every time before each of the test methods.
> @After: Method annotated as @After lets the system know that this method shall be executed every time after each of the test method.
> @BeforeClass: Method annotated as @BeforeClass lets the system know that this method shall be executed once before any of the test methods.
> @AfterClass: Method annotated as @AfterClass lets the system know that this method shall be executed once after any of the test methods.
> @Ignore: Method annotated as @Ignore lets the system know that this method shall not be executed.
</details>

<details>
<summary>What are Junit annotations?</summary>
 
>**Answer:**
> TestNG is an open source framework which is distributed under the Apache Software License and is readily available
> for download. TestNG has an inbuilt exception handling mechanism which lets the program to run without
> terminating unexpectedly.
</details>

<details>
<summary>Why is TestNG better than Junit?</summary>
 
>**Answer:**
> There are various advantages that make TestNG superior to JUnit. Some of them are:
> ```  
> Added advance and easy annotations
> Execution patterns can set
> Concurrent execution of test scripts
> Test case dependencies can be set
</details>

<details>
<summary>Explain what is ignore test in JUnit?</summary>
 
>**Answer:**
> When your code is not ready, and it would fail if executed then you can use @Ignore annotation.
> ```
> It will not execute a test method annotated with @Ignore
> It will not execute any of the test methods of test class if it is annotated with @Ignore
</details>

<details>
<summary>How to set test case priority in TestNG?</summary>
 
>**Answer:**
> ```@Test(priority=0)
> public void method1() {
> }
> @Test(priority=1)
> public void method2() {
> }
> @Test(priority=2)
> public void method3() {
> }
> }
> ``` 
> Test Execution Sequence:
> ``` 
> Method1
> Method2
> Method3
</details>

<details>
<summary>Explain how you can run TestNG from the command window?</summary>
 
>**Answer:**
> To run JUnit from the command window, you have to follow the steps
> ```     
> Set the CLASSPATH
> Invoke the runner:
> java -jar org.testng.TestNg
</details>

<details>
<summary>What is @Test annotation? </summary>
 
>**Answer:**
> @Test annotation is used to denote that the method is a test method. 
</details>

<details>
<summary>What is default test execution order in TestNG</summary>
 
>**Answer:**
> Prioritized by alphabet ASC 
</details>

<details>
<summary>What is soft assert?</summary>
 
>**Answer:**
> Soft assert is the assertion where first you get all assertion, then afters special command throw an AssertionError
> if some assertions was failed
> ```
> //TestNG example
> SoftAssert assert = new SoftAssert();
> assert.assertTrue(true, "First assertion");
> assert.assertFalse(true, "Second assertion");
> assert.assertTrue(false, "Third assertion");
> assert.assertAll();
> ```
> The result:
> ```
> Second assertion shouuld be false, but found true
> Third assertion shouuld be true, but found false
</details>

<details>
<summary>Does Junit have soft assertions</summary>
 
>**Answer:**
> No. We can implement custom soft assertion
</details>

<details>
<summary>What is Java "assert" statement?</summary>
 
>**Answer:**
> The assert keyword is used in assert statement which is introduced in Java 1.4.
> It helps the code developers to test assumptions and to assert if the outcome is as expected that enables detecting
> bug and fixing it.
>
> When this statement is executed:
> ``` 
> If boolean_expression evaluates to true, the statement will pass normally.
> If boolean_expression evaluates to false, the statement will fail with an "AssertionError"
</details>

<details>
<summary>Mention what are parameterized tests?</summary>
 
>**Answer:**
> Parameterized tests enable developer to perform the same test over and again using different values.
</details>

<details>
<summary>What is Cucumber? What are the advantages of Cucumber?</summary>
 
>**Answer:**
> To run functional tests written in a plain text Cucumber tool is used. It is written in a Ruby programming language.
> Advantages of Cucumber are:
> ``` 
> You can involve business stakeholders who cannot code
> End-user experience is a priority
> High code reuse
</details>

<details>
<summary>What are the two files required to execute a Cucumber test scenario?</summary>
 
>**Answer:**
> Two files required to execute a Cucumber test scenario are
> ```
> Features
> Step Definition
</details>

<details>
<summary>Explain the use of Background keyword in Cucumber?</summary>
 
>**Answer:**
> Background keyword is used to group multiple given statements into a single group. The keyword mostly used when
> the same set of given statements are repeated in each scenario of the feature file. 
</details>

<details>
<summary>Give an example of a behavior is driven test in plain text?</summary>
 
>**Answer:**
> ```
> Feature: Visit XYZ page in abc.com
> Scenario: Visit abc.com
> Given: I am on abc.com
> When: I click on XYZ page
> Then: I should see ABC page
</details>

<details>
<summary>What is Scenario Outline in feature file?</summary>
 
>**Answer:**
> Scenario Outline is the same scenario can be executed for multiple sets of data using the scenario outline.
> The data is provided by a tabular structure separated by (I I)
</details>

<details>
<summary>Explain the term step definition in Cucumber?</summary>
 
>**Answer:**
> A step definition is the actual code implementation of the feature mentioned in the feature file.
</details>

<details>
<summary>Give an example for step definition using “Given” function?</summary>
 
>**Answer:**
> For example to make visitor visit the site “Yahoo” the command we use for given
> ``` 
> Given (/^ I am on www.yahoo.com$/) do
> Browser.goto "http://www.yahoo.com."
> end – This will visit www.yahoo.com 
</details>

<details>
<summary>What is the language used for expressing scenario in feature file?</summary>
 
>**Answer:**
> Gherkin language is used to express scenario in feature files and ruby files containing unobtrusive automation testing
> for the steps in scenarios 
</details>

<details>
<summary>What are regular expressions?</summary>
 
>**Answer:**
> A regular expression is a pattern describing a certain amount of text. The most basic regular expression consists of
> a single literal character. 
</details>

<details>
<summary>What is a Feature file?</summary>
 
>**Answer:**
> Features file contain a high-level description of the Test Scenario in simple language.
> It is known as Gherkin which is a plain English text language. Feature File consists of the following components like:
> ```  
> Feature: It describes the current test script which has to be executed.
> Scenario: It is steps and expected outcome for a specific test case.
> Scenario outline: Scenario can be executed for multiple sets of data using scenario outline.
> Given: It specifies the context of the text to be executed.
> When: specifies the test action which has to perform.
> Then: Expected outcome of the test can be represented by “Then”
</details>

##Selenium Java
<details>
<summary>Why should Selenium be selected as a test tool?</summary>
 
>**Answer:**
> ```
> is a free and open source
> have a large user base and helping communities
> have cross Browser compatibility (Firefox, Chrome, Internet Explorer, Safari etc.)
> have great platform compatibility (Windows, Mac OS, Linux etc.)
> supports multiple programming languages (Java, C#, Ruby, Python, Pearl etc.)
> has fresh and regular repository developments
</details>

<details>
<summary>What is Selenium? What are the different Selenium components?</summary>

>**Answer:**
> Selenium is one of the most popular automated testing suites. Selenium is designed in a way to support and encourage
> automation testing of functional aspects of web-based applications and a wide range of browsers and platforms.  
> ```
> The suite package constitutes the following sets of tools:
> * Selenium Remote Control (RC) – Selenium RC is a server that allows a user to create test scripts in the desired
>   programming language. It also allows executing test scripts within the large spectrum of browsers.
> * Selenium WebDriver – WebDriver is a different tool altogether that has various advantages over Selenium RC.
>   WebDriver directly communicates with the web browser and uses its native compatibility to automate.
> * Selenium Grid – Selenium Grid is used to distribute your test execution on multiple platforms and environments concurrently.
</details>

<details>
<summary>What is Selenium? What are the different Selenium components?</summary>

>**Answer:**
> Selenium is one of the most popular automated testing suites. Selenium is designed in a way to support and encourage
> automation testing of functional aspects of web-based applications and a wide range of browsers and platforms.  
> ```
> The suite package constitutes the following sets of tools:
> * Selenium Remote Control (RC) – Selenium RC is a server that allows a user to create test scripts in the desired
>   programming language. It also allows executing test scripts within the large spectrum of browsers.
> * Selenium WebDriver – WebDriver is a different tool altogether that has various advantages over Selenium RC.
>   WebDriver directly communicates with the web browser and uses its native compatibility to automate.
> * Selenium Grid – Selenium Grid is used to distribute your test execution on multiple platforms and environments concurrently.
</details>

<details>
<summary>What are the different types of locators in Selenium?</summary>

>**Answer:**
> ```
> ID
> ClassName
> Name
> TagName
> LinkText
> PartialLinkText
> Xpath
> CSS Selector
> DOM
</details>

<details>
<summary>What is an XPath?</summary>

>**Answer:**
> XPath is used to locate a web element based on its XML path. XML stands for Extensible Markup Language and is used to
> store, organize and transport arbitrary data. It stores data in a key-value pair which is very much similar to HTML
> tags.
>
> The fundamental behind locating elements using XPath is the traversing between various elements across the entire page
> and thus enabling a user to find an element with the reference of another element.
</details>

<details>
<summary>What is the difference between “/” and “//” in Xpath?</summary>

>**Answer:**
> Single Slash “/” – Single slash is used to create Xpath with absolute path i.e. the xpath would be created to start
> selection from the document node/start node.
>
> Double Slash “//” – Double slash is used to create Xpath with relative path i.e. the xpath would be created to start
> selection from anywhere within the document.
</details>

<details>
<summary>How do I launch the browser using WebDriver?</summary>

>**Answer:**
> ```
> The following syntax can be used to launch Browser:
> WebDriver driver = new FirefoxDriver();
> WebDriver driver = new ChromeDriver();
> WebDriver driver = new InternetExplorerDriver();
</details>

<details>
<summary>When should I use Selenium Grid?</summary>

>**Answer:**
> Selenium Grid can be used to execute same or different test scripts on multiple platforms and browsers concurrently
> so as to achieve distributed test execution, testing under different environments, saving execution time remarkably.

</details>

<details>
<summary>What is the difference between Implicit Wait and Explicit Wait?</summary>
 
>**Answer:**
> An Implicit Wait is an instruction for the Driver to wait for a certain amount of time when trying to find an element
> if it’s not immediately available and is generally implemented using keywords like – Wait Until Element Contains,
> Wait Until Element is Enabled, Wait Until Element is Visible. Explicit Wait, on the other hand, instructs the Driver
> to sleep for a certain time before proceeding further in the code and
> is generally implemented using sleep n (does nothing for n seconds)
</details>

<details>
<summary>What is Stale Element Reference Exception?</summary>
 
>**Answer:**
> It means the element is no longer in the DOM, or it changed.
> Example: something changes when you click on the element
</details>

<details>
<summary>How to type in a textbox using Selenium?</summary>
 
>**Answer:**
> The user can use sendKeys(“String to be entered”) to enter the string in the textbox.
> ```
> WebElement username = drv.findElement(By.id(“Email”));
> // entering username
> username.sendKeys(“sth”);
</details>

<details>
<summary>How can you find if an element in displayed on the screen?</summary>
 
>**Answer:**
> WebDriver facilitates the user with the following methods to check the visibility of the web elements.
> These web elements can be buttons, drop boxes, checkboxes, radio buttons, labels etc.
> ```  
> isDisplayed():
>  boolean buttonPresence = driver.findElement(By.id(“gbqfba”)).isDisplayed();
> 
> isSelected():
> boolean buttonSelected = driver.findElement(By.id(“gbqfba”)).isSelected();
>  
> isEnabled():
> boolean searchIconEnabled = driver.findElement(By.id(“gbqfb”)).isEnabled();
</details>

<details>
<summary>How can we get a text of a web element?</summary>
 
>**Answer:**
> Get command is used to retrieve the inner text of the specified web element.
> The command doesn’t require any parameter but returns a string value. It is also one of the extensively used commands
> for verification of messages, labels, errors etc displayed on the web pages.
> ```  
> Syntax:
> String Text = driver.findElement(By.id(“Text”)).getText();
</details>

<details>
<summary>How to select value in a dropdown?</summary>
 
>**Answer:**
> The value in the dropdown can be selected using WebDriver’s Select class.
> ```  
> selectByValue:
> Select selectByValue = new Select(driver.findElement(By.id(“SelectID_One”)));
> selectByValue.selectByValue(“greenvalue”);
>
> selectByVisibleText:
> Select selectByVisibleText = new Select (driver.findElement(By.id(“SelectID_Two”)));
> selectByVisibleText.selectByVisibleText(“Lime”);
>
> selectByIndex:
> Select selectByIndex = new Select(driver.findElement(By.id(“SelectID_Three”)));
> selectByIndex.selectByIndex(2);
</details>

<details>
<summary>How to click on a hyper link using linkText?</summary>
 
>**Answer:**
> ``` 
> driver.findElement(By.linkText(“Google”)).click();
> ``` 
> The command finds the element using link text and then click on that element and thus the user would be re-directed
> to the corresponding page.
> The above-mentioned link can also be accessed by using the following command.
> ```
> driver.findElement(By.partialLinkText(“Goo”)).click();
> ```  
> The above command finds the element based on the substring of the link provided in the parenthesis and this
> partialLinkText() finds the web element with the specified substring and then clicks on it.
</details>

<details>
<summary>How to handle frame in WebDriver?</summary>
 
>**Answer:**
> An inline frame acronym as iframe is used to insert another document within the current HTML document or simply a web
> page into a web page by enabling nesting.
> ``` 
>  Select iframe by id
>  driver.switchTo().frame(“ID of the frame“);
>  
>  Locating iframe using tagName
>  driver.switchTo().frame(driver.findElements(By.tagName(“iframe”).get(0));
>  
>  Locating iframe using index
>  
>  frame(index)
>  driver.switchTo().frame(0);
>
> frame(Name of Frame)
> driver.switchTo().frame(“name of the frame”);
> 
> Select Parent Window
> driver.switchTo().defaultContent();
</details>

<details>
<summary>When do we use findElement() and findElements()?</summary>
 
>**Answer:**
> findElement() is used to find the first element in the current web page matching to the specified locator value.
> Take a note that only first matching element would be fetched.
> ```  
> WebElement element = driver.findElements(By.xpath(“//div[@id=’example’]//ul//li”));
> ```
> findElements() is used to find all the elements in the current web page matching to the specified locator value.
> Take a note that all the matching elements would be fetched and stored in the list of WebElements.
> ```  
> List <WebElement> elementList = driver.findElements(By.xpath(“//div[@id=’example’]//ul//li”));
</details>

<details>
<summary>What is the difference between driver.close() and driver.quit command?</summary>
 
>**Answer:**
> close(): WebDriver’s close() method closes the web browser window that the user is currently working on or we can also
> say the window that is being currently accessed by the WebDriver.
> The command neither requires any parameter nor does it return any value.
>
> quit(): Unlike close() method, quit() method closes down all the windows that the program has opened. Same as close()
> method, the command neither requires any parameter nor does is return any value.
</details>

<details>
<summary>Can Selenium handle windows based pop up?</summary>
 
>**Answer:**
> Selenium is an automation testing tool which supports only web application testing. Therefore,
> windows pop up cannot be handled using Selenium.
</details>

<details>
<summary>How can we handle web-based pop-up?</summary>
 
>**Answer:**
> WebDriver offers the users a very efficient way to handle these pop-ups using Alert interface. There are the four methods that we would be using along with the Alert interface.
> ```
> void dismiss() – The dismiss() method clicks on the “Cancel” button as soon as the pop-up window appears.
> void accept() – The accept() method clicks on the “Ok” button as soon as the pop-up window appears.
> String getText() – The getText() method returns the text displayed on the alert box.
> void sendKeys(String stringToSend) – The sendKeys() method enters the specified string pattern into the alert box.
</details>

<details>
<summary>How to assert the title of the web page?</summary>
 
>**Answer:**
> ```
> assertTrue(“The title of the window is incorrect.”,driver.getTitle().equals(“Title of the page”));
</details>

<details>
<summary>How to mouse hover on a web element using WebDriver?</summary>
 
>**Answer:**
> WebDriver offers a wide range of interaction utilities that the user can exploit to automate mouse and keyboard
> events. Action Interface is one such utility which simulates the single user interactions.
> ```
> // Instantiating Action Interface
> Actions actions=new Actions(driver);
> // howering on the dropdown
> actions.moveToElement(driver.findElement(By.id("id of the dropdown"))).perform();
> // Clicking on one of the items in the list options
> WebElement subLinkOption=driver.findElement(By.id("id of the sub link"));
> subLinkOption.click();
</details>

<details>
<summary>Can captcha be automated?</summary>
 
>**Answer:**
> No
</details>

<details>
<summary>What is the last version of selenium?</summary>
 
>**Answer:**
> Selenium3
</details>

**[⬆ back to top](#interview-questions)**

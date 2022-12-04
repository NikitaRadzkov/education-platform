# Interview Questions

## Test Frameworks

<details>
<summary>1. Name the supported file formats for the Robot Framework?</summary>
 
>**Answer:**
> The Robot Framework files can be plain text format (most commonly .robot format, or .txt format) or in tab-separated
> format (TSV format). Plain text test data can be embedded in reStructured Text Files.
</details>

<details>
<summary>2. Where can the keywords in the Robot Framework be imported from?</summary>
 
>**Answer:**
> Keywords can be imported from test libraries or resource files. Keywords can also be created in the keyword table of
> the test case file itself.
</details>

<details>
<summary>3. What are the test setup and teardown? Give examples</summary>
 
>**Answer:**
> A test setup is something that is executed before a test case, and a test teardown is executed after a test case.In 
> Robot Framework setups and teardowns are just normal keywords with possible arguments. For example, opening a browser 
> before the start of a test case and closing the browser post-execution can be examples of test setup and teardown
</details>

<details>
<summary>4. Can you increase or decrease the speed of execution of test cases using Selenium library</summary>
 
>**Answer:**
> Yes, we can control the speed of execution using Set Selenium Speed keyword
</details>

<details>
<summary>5. How can we increase test execution? </summary>

>**Answer:**
> Run tests in parallel using pabot
</details>

<details>
<summary>6. How will you convert keyword-driven test cases into data-driven test cases? Explain with example.</summary>
 
>**Answer:**
> Data driven test, performing the same functionality with multiple input values by using parametarization with the help
> of data table or data source is called Data Driven Test. Robot has `Template` and `datadriver lib` to work with DDT.  
</details>

<details>
<summary>7. What are the 3 different types of variables in the Robot Framework?</summary>
 
>**Answer:**
> Scalar variable, List variable, and Dictionary variable
</details>

<details>
<summary>8. What is a Jenkins freestyle project?</summary>
 
>**Answer:**
> A Jenkins project is simply a repeatable build job that can contain steps and post-build actions.
> Standard options are available within a Jenkins freestyle project and include the ability to configure build triggers,
> enable project-based security and parameterize the Jenkins project.
</details>

<details>
<summary>9. What keyword should you use to hover mouse on Web Element?</summary>
 
>**Answer:**
> The keyword is Mouse Over in the Selenium2Library
</details>

<details>
<summary>10. What are standard libraries in the Robot Framework? Name the standard libraries.</summary>
 
>**Answer:**
> Some test libraries are distributed with Robot Framework and these libraries are called standard libraries.
> The BuiltIn library is special because it is taken into use automatically and thus its keywords are always available.
> Other standard libraries need to be imported in the same way as any other libraries,
> but there is no need to install them. The available normal standard libraries are
> BuiltIn, Collections, DateTime, Dialogs, OperatingSystem, Process, Screenshot, String, Telnet, XML.
</details>

<details>
<summary>11. What is the difference between Run Keyword If and Run Keyword Unless?</summary>
 
>**Answer:**
> Run Keyword If will run the keyword with the given arguments if the condition is true, whereas Run Keyword Unless will
> run the keyword with the given keywords if the condition is false. Additionally,
> Run Keyword If support ELSE and ELSE IF branches, but Run Keyword Unless doesn’t support
</details>

<details>
<summary>12. How will install a library in the Robot Framework?</summary>
 
>**Answer:**
> We can install by running the command – pip install from Command prompt. Alternatively, you can download the zip
> package, extract it and install it by running setup.py install on the command prompt in the created directory.
</details>

<details>
<summary>13. How will you upgrade the Robot Framework?</summary>
 
>**Answer:**
>pip install --upgrade robot framework
</details>

<details>
<summary>14. What are the different types of automation framework?</summary>
 
>**Answer:**
> Different types of the framework include:
> * Keyword-driven framework
> * Data-Driven framework
> * Hybrid Framework (Combination of the above two)
</details>

<details>
<summary>15. How pytest identifies the test files and test methods</summary>
 
>**Answer:**
> By default pytest only identifies the file names starting with test_ or ending with _test as the test files.
> We can explicitly mention other filenames though (explained later). 
> Pytest requires the test method names to start with "test." All other method names will be ignored even if we
> explicitly ask to run those methods.
> Examples of valid and invalid pytest file names:
> ``` 
> test_login.py - valid
> login_test.py - valid
> testlogin.py -invalid
> logintest.py -invalid
</details>

<details>
<summary>16. What the way to run a subset of entire test</summary>
 
>**Answer:**
> Sometimes we don't want to run the entire test suite. Pytest allows us to run specific tests. We can do it in 2 ways
> * Grouping of test names by substring matching
> * Grouping of tests by markers
</details>

<details>
<summary>17. How to run tests in parallel</summary>
 
>**Answer:**
> Pytest allows us to run tests in parallel. For that we need to install pytest-xdist by running:
> `pip install pytest-xdist` and run `py.test -n 4`, where `-n <num>` runs the tests by using multiple workers.
> In the above command, there will be 4 workers to run the test.
</details>

<details>
<summary>18. How to create parametrized test</summary>
 
>**Answer:**
> The purpose of parameterizing a test is to run a test against multiple sets of arguments.
> We can do this by `@pytest.mark.parametrize`
</details>

<details>
<summary>19. What is Xfail/Skip option</summary>
 
>**Answer:**
> There will be some situations where we don't want to execute a test,
> or a test case is not relevant for a particular time.
> In those situations, we have the option to xfail the test or skip the tests
> The xfailed test will be executed, but it will not be counted as part failed or passed tests. 
> ```
> @pytest.mark.xfail
> ```
> Skipping a test means that the test will not be executed. We can skip tests using
> ```
> @pytest.mark.skip
> ```
</details>

## REST/API testing

<details>
<summary>1. Mention a couple of libraries that you can use for Web Services automation in Robot Framework?</summary>
 
>**Answer:**
> HTTP library.HTTP and Requests
</details>

<details>
<summary>2. Name the important HTTP REST methods?</summary>
 
>**Answer:**
>HTTP methods supported by REST are:
> ```
> GET: It requests a resource at the request URL. It should not contain a request body as it will be discarded
> POST: It submits information to the service for processing; it should typically return the modified or new resource
> PUT: At the request URL it updates the resource
> DELETE: At the request URL it removes the resource
> OPTIONS: It indicates which techniques are supported
> HEAD: About the request URL it returns meta information
</details>

<details>
<summary>3. Name the protocol which is used by RESTful web services?</summary>
 
>**Answer:**
>RESTful web services use a famous web protocol i.e. HTTP protocol. This serves as a medium of data communication
> between client and server. HTTP standard methods are used to access resources in RESTful web service architecture.
</details>

<details>
<summary>4. What are RESTful web services?</summary>
 
>**Answer:**
> RESTful web service implementation defines the method of accessing various resources that are required by the client
> and he has sent the request to the server through the browser. The important aspects of this implementation include:
> ```
> Resources
> Request Headers
> Request Body
> Response Body
> Status codes
</details>

## Python Selenium

<details>
<summary>1. What is the difference between Implicit Wait and Explicit Wait??</summary>
 
>**Answer:**
> An Implicit Wait is an instruction for the Driver to wait for a certain amount of time when trying to find an element
> if it’s not immediately available and is generally implemented using keywords like – Wait Until Element Contains,
> Wait Until Element is Enabled, Wait Until Element is Visible. Explicit Wait, on the other hand, instructs the Driver
> to sleep for a certain time before proceeding further in the code and
> is generally implemented using sleep n (does nothing for n seconds)
</details>

<details>
<summary>2. What is Stale Element Reference Exception?</summary>
 
>**Answer:**
> It means the element is no longer in the DOM, or it changed.
> Example: something changes when you click on the element
</details>


<details>
<summary>3. What is python Standart Expected Condition</summary>
 
>**Answer:**
> There are a standard conditions which you may commonly encounter while automating the web pages.
> Python contains below conditions:
> ```
> alert_is_present
> element_located_selection_state_to_be(ui_locator, is_selected)
> element_located_to_be_selected(ui_locator)
> element_selection_state_to_be(ui_element, is_selected)
> element_to_be_clickable(ui_locator)
> class element_to_be_selected(ui_element)
> frame_to_be_available_and_switch_to_it(ui_locator)
> invisibility_of_element_located(ui_locator)
> staleness_of(ui_element)
> text_to_be_present_in_element(ui_locator, inner_text)
> text_to_be_present_in_element_value(ui_locator, value)
> title_contains(title_text)
> title_is(title)
> visibility_of(ui_element)
> visibility_of_all_elements_located(ui_locator)
> visibility_of_any_elements_located(ui_locator)
> visibility_of_element_located(ui_locator)
</details>
 
**[⬆ back to top](#interview-questions)**


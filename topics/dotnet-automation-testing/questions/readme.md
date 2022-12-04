# Interview Questions

## Test Frameworks

### Nunit
 
<details>
<summary>1. What makes NUnit a Popular Selenium C# Framework?</summary>
 
>**Answer:**
 
>* NUnit runs very well with .NET programming languages.
>* It is open source and it is free.
>* It is easy to integrate it with testing projects.
>* NUnit has frequent version updates.
>* Very easy integration with Visual Studio and other IDEs.
>* Using NUnit, you can execute test cases from console runner by either a third-party automation testing tool or by the NUnit Test Adapter inside the Visual Studio.
>* NUnit framework can be integrated with Selenium by creating a NUnit test class and running the test class using NUnit framework.
>* Suite attribute - can aggregate tests and execute them separately (useful for large projects with fast and slow tests for example)
>* Expected exception message assertion - can be done using attribute in NUnit but must be done using Try-Catch in MSTest
>* NUnit allows parameterized tests and helps in speeding up test development & execution as tests can be executed with numerous input values.
>* Nunit provides you the ability to run your test cases in parallel.
 
</details>
 
<details>
<summary>2. Which annotations are used to mark the test suite and test?</summary>
 
>**Answer:**
>* [*TestFixture*] annotation is used for the Test suite.
>* [*Test*] annotation is used for tests. 
</details>   
 
<details>
<summary>3. Which annotations do you use to for code that needs to be executed before and after executing test?</summary>
 
>**Answer:**
>* [SetUp] - indicate a method of a TestFixture called immediately before the test method 
>* [TearDown] - indicate a method of a TestFixture called immediately after the test method 
</details>   
 
<details>
<summary>4. Which annotations do you use before Test Fixture and after?</summary>
 
>**Answer:**
>OneTimeSetUp (The TestFixtureSetUp attribute has been deprecated in NUnit 3.0 and later ) - is used for one-time setup per test-run. If you run n tests, this event will only occur once.
>OneTimeTearDown(TestFixtureTearDown attribute has been deprecated in NUnit 3.0 and later) is used for one-time teardown per test-run. If you run n tests, this event will only occur once
 
</details>  
 
<details>
<summary>5. What is TestContex in Nunit?</summary>
 
>**Answer:**
>Each NUnit test runs in an execution context.
 The TestContext class allows tests to access certain information about the execution context which includes information about the environment as well as the test itself.
</details>     
 
 
<details>
<summary>6. Which annotation do you use to cause test rerun up to 3 times if it fails?</summary>
 
>**Answer:**
> [Retry(3)]
>* Note:If a test has an unexpected exception, an error result is returned and it is not retried
</details>   
 
 
<details>
<summary>7. How are multiple asserts implemented in Nunit?</summary>
 
>**Answer:**
> Multiple asserts are implemented using the Assert.Multiple method.
> Assert.Multiple method allows us to perform all checks and report all failures encountered in the block.
>Here is an example of its use:
```c#
  Assert.Multiple(() =>
    {
        Assert.AreEqual(5.2, result.RealPart, "Real part");
        Assert.AreEqual(3.9, result.ImaginaryPart, "Imaginary part");
    }); 
 
``` 
</details>  
 
 
<details>
<summary>8. Which assertion will you use to check condition is true?</summary>
 
>**Answer:**
> * Assert.True test that the specified condition is true.
>* You may also use Assert.That with a boolean argument to achieve the same result.
</details>    
 
<details>
<summary>9. Which assertion method will you use to generate a failure?</summary>

>**Answer:**
>Assert.Fail()
</details>    
 
<details>
<summary>10. Which assertion is used to test whether an object is contained in a collection?</summary>
 
>**Answer:**
 
>* Assert.Contains is used to test whether an object is contained in a collection. 
>* Here is an example of its use:
```c#
  string[] sarray = new string[] { "a", "b", "c" }; 
  Assert.Contains("a", sarray);
``` 
Note: also the constraints model can be used:
```c#
int[] iarray = new int[] { 1, 2, 3 };
string[] sarray = new string[] { "a", "b", "c" };
Assert.That(iarray, Has.Member(3));
Assert.That(sarray, Has.Member("b"));
Assert.That(sarray, Contains.Item("c"));
``` 
 
</details>  
 
<details>
<summary>11. Which Nunit attributes can be used for Data-Driven testing?</summary>
 
>**Answer:**
NUnit supports parameterized tests.  Some attributes allow you to specify arguments inline - directly on the attribute (TestCase Attribute) while others use a separate method (TestCaseSource).  
>* `TestCase` Attribute serves the dual purpose of marking a method with parameters as a test method and providing inline data to be used when invoking that method  
TestCase is limited in that the constructor will accept only constant, typeof, or array creation expressions.
>* `TestCaseSource` is used on a parameterized test method to identify the source from which the required arguments will be provided. The data is kept separate from the test itself and may be used by multiple test methods.  
 
> Also extra parameterization with the help of the TestFixture attribute is available . Test fixtures may take constructor arguments. Argument values are specified as arguments to the TestFixture attribute. NUnit will construct a separate instance of the fixture for each set of arguments. 
 
When data is specified for individual arguments, special attributes may be added to the test method itself in order to tell NUnit how to go about combining the arguments.
>  * The *Combinatorial* Attribute is used on a test to specify that NUnit should generate test cases for all possible combinations of the individual data items provided for the parameters of a test.
> * The *Pairwise* Attribute is used on a test to specify that NUnit should generate test cases in such a way that all possible pairs of values are used. This is a well-known approach for combating the combinatorial explosion of test cases when more than two features (parameters) are involved.
> * The *Sequential* Attribute is used on a test to specify that NUnit should generate test cases by selecting individual data items provided for the parameters of the test, without generating additional combinations 
 
</details>      
 
 
<details>
<summary>12. Which Nunit attribute will you use to forbid the run test in parallel?</summary>
 
>**Answer:**
>* [NonParallelizable] - This attribute is used to indicate that the test on which it appears may not be run in parallel with any other tests.
 
</details>  
 
<details>
<summary>13. Which Nunit attribute will you use to indicate that a test may be run in parallel?</summary>
 
>**Answer:**
> [Parallelizable] 
The `Parallelizable` attribute is used to indicate that a test and/or its descendants may be run in parallel with other tests. By default, no parallel execution takes place.
</details>   
 
 
<details>
<summary>14. What is default scope for Paralelizable attribute?</summary>
 
>**Answer:**
>The ParallelizableAttribute constructor takes an optional ParallelScope enumeration argument. 
>* The ParallelScope.Self is default false.  This option indicates that the test itself may be run in parallel with other tests.
</details> 
 
### Xunit
  
<details>
<summary>1. What makes XUnit a Popular Selenium C# Framework?</summary>
 
>**Answer:**
>* xUnit.net is a free, open source, community-focused unit testing tool  
>* It is part of the .NET Foundation, and operates under their code of conduct.
>* xUnit was also created by one of the original authors of NUnit. Hence, the majority of the shortcomings of the NUnit framework are not carried forward while designing the xUnit framework.
>* xUnit is aimed at improving test isolation and trying to codify a set of rules to establish a testing standard.
>* xUnit [Fact] and [Theory] attributes are extensible. 
>* Parallel test execution using a Selenium Grid which is an essential part of automated browser testing can be achieved at the thread level in xUnit. 
>* xUnit allows parameterized tests, it can be used for data-driven testing. 
>* xUnit.Net supports configuration via both XML and JSON. 
 
</details> 
 
<details>
<summary>2. Which attribute will you use to mark a test method?</summary>
 
>**Answer:**
>Since xUnit.net supports for two different major types of tests: facts and theories  the following attributes may be used to make a test method:
> `[Fact]` and `[Theory]`.
 
>* The [Fact] attribute is used to identify tests to verify that some criteria must be met, regardless of data .
>* xxUnit ships with support for data-driven tests call Theories. Tests should be marked with the [Theory] attribute (instead of [Fact]) in this case. 
</details>   
 
<details>
<summary>3. What is the difference between [Fact] and [Theory] ?</summary>
 
>**Answer:**
>* [Fact] attribute is used to mark a method as a test without incoming parameters.
>* [Theory] attribute is used to mark a method as a test and setup incoming parameters .
>
</details>
 
<details>
<summary>4. How may be implemented the code execution before and after test running?</summary> 
 
>**Answer:**
>* A constructor of the test class is used for running code before test execution .
>xUnit creates a new instance of the test class for every test that is run, so any code which is placed into the constructor of the test class will be run for every single test. This makes the constructor a convenient place to put reusable context setup code where you want to share the code without sharing object instances (meaning, you get a clean copy of the context object(s) for every test that is run).
 
>*  IDisposable interface is used for de-initialization.
>The IDisposable interface should be implemented and the cleanup code should be put in the Dispose method. This method is called every time a test is finished. 
 
</details>    
 
<details>
<summary>5. Which attributes are used for data-driven testing?</summary>
 
>**Answer:**
>The [Theory] attribute denotes a parameterised test that is true for a subset of data. That data can be supplied in a number of ways.
 
>* The data is provided by the `[InlineData]` attribute. 
 > The [InlineData()] attribute passes data into the test method. Each instance of [InlineData] will create a separate execution of the test method. The values passed in the constructor of [InlineData] are used as the parameters for the method. 
>* If the values you need to pass to your [Theory] test aren't constants, then you can use an alternative attribute, `[ClassData]`, to provide the parameters.
 This attribute takes a Type which xUnit will use to obtain the data:
>* The `[MemberData]` attribute can be used to fetch data for a [Theory] from a static property or method of a type.
</details> 
 
<details>
<summary>6. By default, how Tests are run the same test collection - in parallel or sequentially?</summary>
 
>**Answer:**
> *Sequentially*.
>If we need to indicate that multiple test classes should not be run in parallel against one another, then we place them into the same test collection.
>
 
</details>  
<details>
<summary>7. By default, how Tests are run within the same test class - in parallel or sequentially?</summary>
 
>**Answer:**
>*Sequentially*.
>Tests within the same test class which means that they are in the same test collection, so they cannot be run in parallel against one another.
>
</details>  
 
 <details>
<summary>8. What is Interface IClassFixture<TFixture> used for?</summary>
 
>**Answer:**
>IClassFixture<TFixture> used to decorate xUnit test classes and collections to indicate a test which has per-test-class fixture data. An instance of the fixture data is initialized just before the first test in the class is run, and if it implements IDisposable, is disposed after the last test in the class is run. 
 
</details>
 
<details>
<summary>9. Which assertion will you use to ensure that the code throws an exact exception?</summary>
 
>**Answer:**
> Assertion Throws<T> is used to ensure that the code throws an exact exception.
</details>
 
<details>
<summary>10. Which assertion will you use to ensure that a value is within a given range?</summary>
 
>**Answer:**
> Assertion Assert.InRange is used to verify that a value is within a given range.
</details> 
 
 
### MSTest
 
<details>
<summary>1. What makes MSTest a Popular Selenium C# Framework?</summary>
 
>**Answer:**
>* Open-source and community-driven framework.
>* Data-driven testing is possible with the MSTest framework.
>* V2 version of MSTest framework comes with cross-platform support i.e. developers can write tests for the .NET framework, .NET Core, and ASP.NET Core on varied platforms like Windows, Mac, and Linux. 
>* Using in-assembly parallelism features, multiple tests can be executed in parallel
>* As MSTest framework comes pre-bundled with Visual Studio, many developers prefer using the framework for Selenium automation testing.
</details>
 
<details>
<summary>2. Which annotations do you use to create a test?</summary>
 
>**Answer:**
>To create a test, you have to write a method with the attribute [TestAttribute] in a class decorated with the [TestClass] attribute.
 
</details>   
 
<details>
<summary>3. Which annotations do you use to for code that needs to be executed before and after executing test?</summary>
 
>**Answer:**
> *  The method decorated by [TestInitialize] is called before running each test of the class.
>*  The method decorated by [TestCleanup] is called after running each test of the class.
 
 
</details>   
 
<details>
<summary>4. Which annotations do you use to for code that needs to be executed before and after executing all the tests of the class ?</summary>
 
>**Answer:**
> * The method decorated by [ClassInitialize] is called once before running the tests of the class. In some case, you can write the code in the constructor of the class. 
>* The method decorated by [ClassCleanup] is called after all tests from all classes are executed.
</details>   
 
<details>
<summary>5. Which assertion will you use to test whether the specified object is null?</summary>
 
>**Answer:**
>Assert.IsNull(object value)
</details>   
 
<details>
<summary>6. Which assertion will you use to test whether the specified string contains the specified substring?</summary>
 
>**Answer:**
>StringAssert.Contains(string value, string substring)
</details>   
 
<details>
<summary>7. Which assertion will you use to test whether the specified collections have the same elements in the same order and quantity?</summary>
 
>**Answer:**
>CollectionAssert.AreEqual(ICollection expected, ICollection actual)
</details>   
 
 
<details>
<summary>8. Which assertion will you use to test an exception is thrown?</summary>
 
>**Answer:**
>* Assert.ThrowsException<T>(Action action): Tests whether the code specified by delegate throws an exact given exception of type T (and not of derived type).
>* Note: Assert.ThrowsExceptionAsync<T>(Func<Task> action): Same as ThrowsException with async code
</details>  
 
 
<details>
<summary>9. What does assert method Fail do?</summary>
 
>**Answer:**
> The assert methods Fail immediately change the status of the test to "error". 
>This can be useful to write your own assert method.
</details>    
 
 
<details>
<summary>10. Which assertion is used to test whether the specified string matches a regular expression?</summary>
 
>**Answer:**
> StringAssert.Matches(string value, Regex regex)
</details>  
 
 
 
<details>
<summary>11. How Data-Driven testing is implemented in MSTest?</summary>
 
 
>**Answer:**
MSTest v2 provides 3 ways to create parameterized tests.
1. The [DataRow] attribute allows to set the values of the parameter of the test. You can set as many [DataRow] attributes as you want. Also you need to replace [TestMethod] by [DataTestMethod].
2. If your data cannot be set into attribute parameters (non constant values or complex objects), you can use the [DynamicData] attribute. This attribute allows you to get the values of the parameters from a method or a property. The method or the property must return an IEnumerable<object[]>. 
3. You can create your own attribute. The attribute must implement ITestDataSource. This interface has 2 methods: GetData and GetDisplayName. GetData returns the data rows. GetDisplayName returns the name of the test for a data row.  
 
</details>      
 
 
<details>
<summary>12. Which MSTest attribute will you use to forbid the run test in parrallel?</summary>
 
>**Answer:**
>* [DoNotParallelize]
>* This attribute is used to indicate that the test on which it appears may not be run in parallel with any other tests.
</details>  
 
<details>
<summary>13. Which attribute in the assembly is responsible for parallel execution of the tests?</summary>
 
>**Answer:**
> `[Parallelize]`
> The attribute has 2 properties: Workers et Scope.
>* Workers: The number of threads to run the tests. Set it to 0 to use the number of cores of your computer.
>* Scope: Determine if the runner must parallelize tests at method or class level. 
</details>   
 
 
### REST/API testing
### RestSharp
 
<details>
<summary>1. What is a RestSharp?</summary>
 
>**Answer:**
>*  RestSharp is the HTTP client library for .NET featuring automatic serialization and deserialization, request and response type detection, variety of authentications and other useful features.
</details>    
 
 
<details>
<summary>2. Which serialization and deserialization does RestSharp support?</summary>
 
>**Answer:**
> JSON, XML and custom serialization and deserialization
</details>    
 
<details>
<summary>3. Which type of Authenticators does RestSharp support?</summary>
 
>**Answer:**
>RestSharp provides authentication support for different systems like HTTP, NTLM and other parameter based programs. It also lets you create your own Authenticator.  
 
</details>   
<details>
<summary>4. How can HTTP Method type of request be specified?</summary>
 
>**Answer:**
> The Method property of the RestRequest class is used to specify the HTTP method type. 
</details>   
 
<details>
<summary>5. How can parameter be added to request?</summary>
 
>**Answer:**
> AddParameter adds the parameter to your request. 
</details>   
 
<details>
<summary>6. What method is used for request execution?</summary>
 
>**Answer:**
> You can execute your request using RestClient.Execute(request). 
</details>  
  
 
<details>
<summary>7. What the property of the RestResponse object will contain the HTTP status response code?</summary>
 
>**Answer:**
 
>RestResponse.StatusCode 
 
</details>    
 
### HttpClient
 
<details>
<summary>1. What is a HttpClient?</summary>
 
>**Answer:**
> HttpClient is a library in the Microsoft .NET framework 4+ for sending HTTP requests and receiving HTTP responses i.e from REST services.
</details>    
 
 
<details>
<summary>2. How to make GET HTTP requests using HttpClient?</summary>
 
>**Answer:**
> Depending of needs the following methods can be used: 
>* GetAsync - Send a GET request to the specified Uri as an asynchronous operation.
>* GetByteArrayAsync -  Sends a GET request to the specified Uri and return the response body as a byte array in an asynchronous operation.
>* GetStreamAsync -  Send a GET request to the specified Uri and return the response body as a stream in an asynchronous operation.
 
</details> 
 
<details>
<summary>3. What does GetAsync method return when the method completes?</summary>
 
>**Answer:**
> The GetAsync method sends the HTTP GET request. When the method completes, it returns an HttpResponseMessage that contains the HTTP response. 
</details>  
 
 
<details>
<summary>4. Which method can be used to send asynchronous POST request?</summary>
 
>**Answer:**
> An asynchronous POST request can be made with the PostAsync() method.
 
</details>  
 
<details>
<summary>5. What the property of the HttpResponseMessage will contain the HTTP status response code ?</summary>
 
>**Answer:**
 
>`StatusCode` 
 
</details>      
 
**[⬆ back to top](#interview-questions)**


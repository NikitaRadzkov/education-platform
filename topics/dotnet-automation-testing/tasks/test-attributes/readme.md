# Test framework attributes

## Short Description

Add test framework attributes for the tasks complition.

## Estimation (h)

4

## Topics

* MsTest framework.
* Nunit framework.
* Xunit framework.

## Requirements

* The [template](./assets/test-framework-template.zip "Download template") may be used or your own solution.
* Add required dependencies to solution
* Add attributes of test framework to specify tests in classes TestSuite1-TestSuite3
* Add attributes of test framework and modify classes if it's needed to meet the following requirements:
  * TestSuite1:
    * all test cases of TestSuite1 should be run in parallel
    * one test should not be executed (choose any one of tests)
  * TestSuite2:
    * all test cases of TestSuite2 shouldn't be run in parallel with each other
    * TestSuite2 can't be run simultaneously with the other fixtures/suites
  * TestSuite3:
    * categorize the test cases of TestSuite3 (for instance "Bug", "Integration Test" )
    * one test should be rerun 3 times if it fails Note: Some tests are inherently incosistent, like tests that touch
      some type of physical artifact, like the network, files, or a web browser. Such tests may fail for reasons outside
      of your control. Rerun option allows a test to try again if it fails and help to fix flaky test.

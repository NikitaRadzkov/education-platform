# Exam Questions

## Introduction to Testing

<details>
<summary>1. What is software testing?</summary>

> **Answer:**
>
> Software Testing is a method to check whether the actual software product matches expected requirements and to ensure
> that software product is defect free. It involves execution of software/system components using manual or automated
> tools to evaluate one or more properties of interest. The purpose of software testing is to identify errors, gaps or
> missing requirements in contrast to actual requirements.

</details>

<details>
<summary>2. What's the difference between Quality Assurance and Quality Control?</summary>

> **Answer:**
>
> **Quality Assurance** is the process of managing the quality of the software under development. QA is more of a
> comprehensive activity in which establishing long-term good quality management systems and assessing that those
> systems help to conform to the customer requirements is done. Thus, QA is process-oriented.
>
> **Quality Control** is the set of methods used to verify the quality of the output delivered by the software. QC is
> more of a product-specific activity in which tools and equipment are used to confirm that the customer's requirements
> are continually met. Thus, QC is product-oriented.

</details>

<details>
<summary>3. What's the difference between verification and validation?</summary>

> **Answer:**
>
> **Verification** is testing that your product meets the specifications / requirements you have written. "Did I build
> what I said I would?"
>
> **Validation** tests how well you addressed the business needs that caused you to write those requirements. It is also
> sometimes called acceptance or business testing. "Did I build what I need?"

</details>

<details>
<summary>4. List the SDLC phases.</summary>

> **Answer:**
>
> * Requirement gathering and analysis
> * Design
> * Implementation
> * Testing
> * Deployment
> * Maintenance

</details>

## Testing Process

<details>
<summary>1. What does the testing process include?</summary>

> **Answer:**
>
> * Test planning
> * Test preparation
> * Test execution
> * Test reporting and metrics

</details>

## Test Documentation

<details>
<summary>1. What is the difference between a test case and a checklist?</summary>

> **Answer:**
>
> **Checklists** are simplified versions of test cases, which aim to cover all user actions that are possible within a
> given functionality. Checklists provide a shorthand way of writing the functionality, putting the core action at the
> top. It's thus much more easy to write a checklist item than a test case.
>
> Creating **test cases** is extremely time-consuming. Much like code, its requirements can change with every sprint,
> rendering your test cases obsolete, and warranting an update.

</details>

<details>
<summary>2. What a test plan consists of?</summary>

> **Answer:**
>
> The most important content of the Test Plan is:
>
> * The Product / Feature under test
> * What is In Scope / Out of Scope
> * Risks
> * Assumptions
> * Tools
> * Environments
> * Resources
> * Estimates

</details>

## Bug Reporting

<details>
<summary>1. Explain the Bug Life Cycle.</summary>

> **Answer:**
>
> The status flags below define a life cycle whereby a defect will progress from "New" through "Assigned" to (hopefully)
> "Fixed" and "Closed":
>
> * **New** – a new defect has been raised by testers and is awaiting assignment to a developer for resolution.
> * **Assigned** – the defect has been assigned to a developer for resolution.
> * **Rejected** – the developer was unable to reproduce the defect and has rejected the defect report, returning it to
>
> the tester that raised it.
>
> * **Fixed** – the developer has fixed the defect and checked in the appropriate code.
> * **Ready for test** – the release manager has built the corrected code into a release and has passed that release to
>
> the tester for retesting.
>
> * **Failed retest** – the defect is still present in the corrected code and the defect is passed back to the
>
> developer.
>
> * **Closed** – the defect has been correctly fixed and the defect report may be closed, subsequent to review by a test
>
> lead.

</details>

<details>
<summary>2. What fields should the bug report contain?</summary>

> **Answer:**
>
> * **Title** - A unique, concise and descriptive title for a defect is vital. It will allow the defect to be easily
>
> identified and discussed.
>
> * **Severity** - An assessment of the impact of the defect on the end user.
> * **Status** - The current status of the defect.
> * **Initial configuration** - The state of the program before the actions in the "steps to reproduce" are to be
>
> followed. All too often this is omitted and the reader must guess or intuit the correct pre-requisites for reproducing
> the defect.
>
> * **Software Configuration** - The version and release of software-under-test as well as any relevant hardware or
>
> software platform details.
>
> * **Steps to Reproduce** - An ordered series of steps to reproduce the defect
> * **Expected behaviour** - What was expected of the software, upon completion of the steps to reproduce.
> * **Actual behaviour** - What the software actually does when the steps to reproduce are followed.
> * **Impact** - An assessment of the impact of the defect on the software-under-test. It is important to include
>
> something beyond the simple "severity" to allow readers to understand the context of the defect report.
>
> * **Proposed solution** - An optional item of information testers can supply is a proposed solution. Testers often
>
> have unique and detailed information of the products they test and suggesting a solution can save designers and
> developers a lot of time.
>
> * **Priority** - An optional field to allow development managers to assign relative priorities to defects of the same
>
> severity
>
> * **Root Cause** - An optional field allowing developers to assign a root cause to the defect such as "inadequate
>
> requirements" or "coding error"

</details>

<details>
<summary>3. Explain the difference between bug severity and bug priority. Give examples of bugs:

* with high priority and low severity
* with high severity and low priority</summary>

> **Answer:**
>
> **Priority**, as the name suggests, is about prioritizing a defect based on business needs and severity of the defect.
> Priority signifies the importance or urgency of fixing a defect.
>
> **Severity** defines the extent to which a particular defect could create an impact on the application or system.
>
> Example: high priority and low severity - The logo of the company in the front-page is wrong.
>
> Example: high severity and low priority - In a social networking site, if a beta version of a new feature is released
> with not many active users using that facility as of today. Any defect found on this feature can be classified as a
> low priority as the feature takes back seat due to business classification as not important.

</details>

<details>
<summary>4. What methods can be applied to reproduce the unrepeatable bug?</summary>

> **Answer:**
>
> There isn't a set formula to repeating an unrepeatable case. It takes a combination of activities to narrow down the
> cause.
>
> When you find a high-impact unrepeatable bug, continue to gather evidence as you perform other testing tasks. Whenever
> you see the bug, *save all the information* you can. Create a special folder and save stack traces, screen shots,
> notes, and anything else that seems relevant to the case. Revisit the folder and review the data, so that when you
> work with developers on these kinds of bugs, you have information to help them troubleshoot.
>
> Check the bug database for *similar bugs*. Unrelated unrepeatable bugs can have identical stack traces in the bug
> reports. They can be related to the same problem.
>
> Instead of focusing on details, *start by finding patterns*. It is often more important to look at the big picture
> than to look at the steps you took to get there. Watch for patterns among the different sightings of the bug. When
> talking to others, ask questions and watch for patterns in their answers. If you get a hunch about a particular
> pattern, ask if anyone noticed that pattern.
>
> Remember that the GUI may not be the best place to repeat all bugs. Many unrepeatable bugs are caused by conditions
> deep in the program code or in the thirdparty software that the application uses. In many cases, the bugs can
> consistently be reproduced when using a testable interface *behind the GUI*.
>
> *Use automated testing tools* to help track down unrepeatable bugs. Automated tests can quickly simulate conditions
> that are difficult for a single tester to repeat. Sporadic errors can be repeated more often when running certain
> tests quickly with a tool, and test scripts can be developed when a scenario seems to cause the bug more frequently.

</details>

## Testing Methodology

<details>
<summary>1. Name four Levels of testing. Briefly describe each.</summary>

> **Answer:**
>
> * **Unit Testing.** Checks if software components are fulfilling functionalities or not.
> * **Integration Testing.** Checks the data flow from one module to other modules.
> * **System Testing.** Evaluates both functional and non-functional needs for the testing. Tests the entire system.
> * **Acceptance Testing.** Checks the requirements of a specification or contract are met as per its delivery.

</details>

<details>
<summary>2. What is the difference between Black Box Testing and White Box Testing?</summary>

> **Answer:**
>
> **Black Box Testing** is a software testing method in which the functionalities of software applications are tested
> without having knowledge of internal code structure, implementation details and internal paths. Black Box Testing
> mainly focuses on input and output of software applications and it is entirely based on software requirements and
> specifications.
>
> **White Box Testing** is software testing technique in which internal structure, design and coding of software are
> tested to verify flow of input-output and to improve design, usability and security. In white box testing, code is
> visible to testers.

</details>  

<details>
<summary>3. How Functional Testing differs from Non-Functional Testing?</summary>

> **Answer:**
>
> **Functional testing** is a type of testing which verifies that each function of the software application operates in
> conformance with the requirement specification.
>
> **Non-functional testing** is a type of testing to check non-functional aspects (performance, usability, reliability,
> etc.) of a software application. It is explicitly designed to test the readiness of a system as per nonfunctional
> parameters which are never addressed by functional testing.

</details>  

<details>
<summary>4. What are the types of non-functional testing?</summary>

> **Answer:**
>
> * Performance Testing
> * Scalability Testing
> * Usability Testing
> * Security Testing
> * Recovery Testing
> * Compliance Testing
> * Documentation Testing

</details>  

<details>
<summary>5. Explain the difference between Retesting and Regression testing.</summary>

> **Answer:**
>
> **Regression Testing** is carried out to confirm whether a recent program or code change has not adversely affected
> existing features. **Retesting** is carried out to confirm the test cases that failed in the final execution are
> passing after the defects are fixed.
>
> **Regression Testing** checks for unexpected side-effects while **Retesting** makes sure that the original fault has
> been corrected.
>
> **Regression Testing** doesn't include defect verification whereas **Retesting** includes defect verification.
>
> **Regression Testing** is known as generic testing whereas **Retesting** is planned testing.
>
> **Regression Testing** is possible with the use of automation whereas **Retesting** is not possible with automation.

</details>  

## Test Design Techniques

<details>
<summary>1. What is test design and why to use test design techniques?</summary>

> **Answer:**
>
> Test design is the activity of deriving and specifying test cases from test conditions to test software.
>
> Test design techniques always include test selection criteria determining when to stop designing more test cases. They
> differ from test creation, which are based on the test data adequacy criteria by selecting appropriate test data in
> order to reduce the risks to an acceptable level.
>
> Software test design refers to the process of designing different tests answering the questions: Which test case? How
> many? How to get these test cases? Using Test design techniques reduces time required for testing because of the small
> number of test cases.
>
> Each test design technique is suitable for identifying a particular type of software defect. The selected test design
> technique should meet the testing objectives and the result of risk and complexity analysis.

</details>  

<details>
<summary>2. Explain the essence of the following techniques: Equivalence Partitioning, Boundary Value Analysis, Pairwise
Testing.</summary>

> **Answer:**
>
> **Equivalence Partitioning** - in this technique, input data units are divided into equivalent partitions that can be
> used to derive test cases which reduces time required for testing because of the small number of test cases. We use
> equivalence partitioning hypothesis where we divide the possible values of tickets into groups or sets where the
> system behavior can be considered the same. The divided sets are called Equivalence Partitions or Equivalence Classes.
> Then we pick only one value from each partition for testing. The hypothesis behind this technique is that if one
> condition/value in a partition passes all others will also pass. Likewise, if one condition in a partition fails, all
> other conditions in that partition will fail.
>
> **Boundary Value Analysis** - in Boundary Value Analysis, you test boundaries between equivalence partitions.
>
> **Pairwise Testing** (or All-Pairs Testing) - black-box test design technique in which test cases are designed to
> execute all possible discrete combinations of each pair of input parameters.

</details>  

<details>
<summary>3. Provide examples of White Box Test Techniques.</summary>

> **Answer:**
>
> * **Statement Coverage** is a white box testing technique in which all the executable statements in the source code
>
> are executed at least once. It is used for calculation of the number of statements in source code which have been
> executed. The main purpose of Statement Coverage is to cover all the possible paths, lines and statements in source
> code.
>
> * **Decision Coverage** is a white box testing technique which reports the true or false outcomes of each boolean
>
> expression of the source code. The goal of decision coverage testing is to cover and validate all the accessible
> source code by checking and ensuring that each branch of every possible decision point is executed at least once.
>
> * **Branch Coverage** is a white box testing method in which every outcome from a code module(statement or loop) is
>
> tested. The purpose of branch coverage is to ensure that each decision condition from every branch is executed at
> least once. It helps to measure fractions of independent code segments and to find out sections having no branches.
>
> * **Condition Coverage** or expression coverage is a testing method used to test and evaluate the variables or
>
> sub-expressions in the conditional statement. The goal of condition coverage is to check individual outcomes for each
> logical condition. Condition coverage offers better sensitivity to the control flow than decision coverage. In this
> coverage, expressions with logical operands are only considered.

</details>

<details>
<summary>4. What is Exploratory testing? What is the difference between Exploratory and Ad-hoc testing?</summary>

> **Answer:**
>
> **Exploratory testing** is an approach to software testing that is often described as simultaneous learning, test
> design, and test execution. It focuses on discovery investigation and learning. For Exploratory testing test cases are
> not created in advance, testers check the system on the fly but they may note down ideas about what to test before
> test execution. Exploratory testing also relies on thorough documentation of each action taken, so that any defects
> discovered during the test are easy to reproduce later in development.
>
> On the surface, **Ad-hoc testing** offers many of the same benefits as Exploratory testing. It is an informal,
> free-form method of software testing that offers the possibility of unearthing critical bugs missed by automated or
> regression testing. However, Ad-hoc testing is random, unstructured testing. It doesn’t have any rules, boundaries,
> goals, plan, or target. Without these specifications, Ad-hoc testing is difficult to manage or measure and any bugs
> that are discovered will be a challenge to reproduce. The testers who perform this testing should have a very good and
> in-depth knowledge of the product or application.

</details>

## Requirements Analysis

<details>
<summary>1. What techniques can be used to collect requirements?</summary>

> **Answer:**
>
> * **Brainstorming** - can be used to gather a good number of ideas from a group of people (development team, customers
>
> or user representatives, stakeholders).
>
> * **Document Analysis** - evaluating the documentation of a present system can assist when making AS-IS process
>
> documents and also when driving the gap analysis for scoping of the migration projects.
>
> * **Observation** - by watching users, a process flow, pain points, awkward steps and opportunities can be determined by
>
> an analyst for improvement.
>
> * **Prototyping** - people are not able to articulate a specific need in the abstract, but they can swiftly review
>
> whether a design approach would satisfy the need, so prototypes are very effectively done with fast sketches of
> storyboards and interfaces.

</details>

<details>
<summary>2. How many requirements levels exist? Briefly describe each.</summary>

> **Answer:**
>
> There are three main levels of requirements:
>
> * **Business Requirements** describe why we're developing the product, what benefits of the new product on the market,
>
> business objectives, etc.
>
> * **User Requirements** are needed to answer the question: "What will users be able to do with the system?"
> * **Functional Requirements** describe functionality that is going to be developed and that is important for users to
>
> reach their goals.

</details>

<details>
<summary>3. List several characteristics of good requirements.</summary>

> **Answer:**
>
> * **Complete.** A requirement is self-contained and there is no missing information.
> * **Consistent.** Requirements are consistent with each other in terms of requirement format, content, meaning
>
> interpretation, and interrelationship among requirements that are related.
>
> * **Atomic.** A requirement can't be divided into several more detaied requirements without losing completeness.
> * **Relevant.** A requirement hasn't become obsolete after time has passed.
> * **Estimable.** You must always be able to estimate the size of a requirement.

</details>

**[⬆ back to top](#exam-questions)**

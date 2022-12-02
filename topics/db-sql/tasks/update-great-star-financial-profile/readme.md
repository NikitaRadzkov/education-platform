# Update Great Star Financial Profile

## Short Description

Implement a stored procedure that will update user data in the database table based on the values from another table.

## Estimation (h)

16

## Topics

* Creating tables
* Getting data
  * Conditions
  * Joins
* Modifying data
* Stored procedures

## Requirements

Use MS SQL Server

Instructions to create database:

* Create database with name **GreatStarFinancial**;
* Create login **gsfuser**;
* Run script: [createGreatStarFinancialDB.sql](./assets/createGreatStarFinancialDB.sql)

Technical Scope:

* Call **ResetMembers** stored procedure;
* Take data from the **UserImportData** table after stored procedure is called and on the base of the values of it
  update user information in the Members table in accordance with the requirements specified below:
* If **RegisteredRep = true**, then do the following:
  * Find the user’s account in the Members table.
  * Append **“, Financial Adviser”** to the AppearsAs field. I.e., Current value is **John Doe** after the upload take
    the value in the first name and last name and then append **, Financial Adviser** to create a string of **John Doe,
    Financial Adviser** and replace the value in the **Appears as** field with the new string i.e. **John Doe, Financial
    Adviser**
  * Update **Disclaimer** field with the following value: **Financial Adviser offering investment advisory services
    through Great Star LLC, a Registered Investment Adviser Registered Representative, Great Star LLC, A Licensed
    Insurance Agency**
  * Add user to the company which name is in the Company Name field of the UserImportData table.
* If **EagleStrategies = true**, then do the following:
  * Find the user’s account in the Members table.
  * Append “**, Financial Services Professional**” to the **Appears as** field. I.e., current value is **John Doe**
    after the upload take the value in the first name and last name and then append **, Financial Services
    Professional** to create a string of **John Doe, Financial Services Professional** and replace the value in the
    **Appears as** field with the new string i.e. **John Doe, Financial Services Professional**
  * Update **Disclaimer** field with the following value: **Registered Representative, Great Star Inc, A Licensed
    Insurance Agency. Agent with Great Star Incorporated**
  * Add user to the company which name is in the CompanyName field of the UserImportData table.
* If **DBA = true**, then do the following:
  * Find the user’s account in the Members table.
  * Append “**, Investment Professional**” to the **Appears as** field. I.e., current value is **John Doe** after the
    upload take the value in the first name and last name and then append **, Investment Professional** to create a
    string of **John Doe, Investment Professional** and replace the value in the **Appears as** field with the new
    string i.e. **John Doe, Investment Professional**
  * Update **Disclaimer** field with the following value: **Registered Representative, Great Star Securities LLC. %DBA
    Name% is not owned or operated by Great Star Securities LLC or its affiliates. %DBA Name% should be replaced with
    the value from the same field in the UserImportData table**
  * Add user to the company which name is in the CompanyName field of the UserImportData  table.
* If Members table doesn't contain user, this user should be inserted into it and columns should contain values as
  specified above.
* Put entire logic into a new stored procedure.

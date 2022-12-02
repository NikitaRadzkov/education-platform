# Medical Research

## Short Description

Write sql queries and functions to perform CRUD operations in the medical research database.

## Estimation (h)

24

## Topics

* Creating tables
* SQL constraints
* Alter statements
* Indexes
* Getting data
  * Conditions
  * Sorting
  * Grouping
  * Subqueries
  * Joins
* Modifying data
* SQL Functions

## Requirements

Create the following tables:

* Clinics — information about clinics (Name, Address1, Address2, etc).

* DrugUnits — information about drug units (DrugUnitId, Name, DrugType etc.)

* DrugType — enum-like table with information about possible drug types. E.g., A,B,C or Placebo, Paracetamol etc.

  | DrugTypeId | Value |
  | ---------- | ----- |
  | 1          | A     |
  | 2          | B     |
  | 3          | C     |

* Patients — information about patients (Date of Birth, Initials, SelectedDrugType, Status etc.)

* Status — enum-like table with possible patient statuses (Screend, Randomized, Completed, EarlyTerminated etc.) E.g.

  | StatusId | Value          |
  | -------- | -------------- |
  | 1        | Screened       |
  | 2        | Randomized     |
  | 3        | EarlyCompleted |
  | 4        | Completed      |

* Gender — enum-like table with gender values

* Visits — information about patient visits. Think about necessary columns. Assume that one drug unit is dispensed at
  one visit for one patient.

* Users — information about users (Id, Email, Password, Role). Possible Roles are sponsor, investigator or manager.

Think about relationships between the tables, primary keys etc.

Create necessary indexes to spead up the search operations.

Requirements to data population:

* All data should be close to real data. That is, there shouldn't be "test", "123" etc. There should be something, for
  example, "St. Mary Hospital", "John Doe" etc.
* At least two patient with one visit
* At least two patient with several visits
* At least two patient completed all visits
* At least two clinic without patients
* At least two clinic without drugs
* At least two clinic with drugs and patients
* At least three drug types

Insert data queries must be written manually. UI tools usage is prohibited.

Queries:

* Write a query that will choose patients with only one visit.
* Write a query that will choose patients who completed all visits.
* Write a query that will choose clinics with patients who performed at least one visit.
* Write a query that will choose clinics with no patients.
* Write a query that will choose clinics with patients who completed all visits.
* Write a query that will show the number of visits performed at each clinic.
* Write a query that will show the number of drugs of each type.
* Write a query that will show the number of drugs of what type were dispensed.
* Write a query that will show the number of patients of each status.
* Write a query that will select drug units of the drug type that was not dispensed for any patient.
* Write a query that will add Expiration Date to the drug units and fill that column.
* Write a query that will select the expired drug units.
* Write a SQL function to count the required number of drug units to complete the rest patients' visits at the specified
  clinic.
* Write a SQL function that will randomly choose the drug type and assign it to the specified patient.
* Write a SQL function that will randomly choose available drug unit of the specified drug type and assign it to the
  specified patient.

The result should be a sql file with requests and comments for each request that it does.

# ETL, Exceptions

## Short Description

Transform data according to the requirements below. Handle exceptions where it is necessary.

## Estimation (h)

6

## Topics

* Serialization/Deserialization
* JSON
* YAML
* CSV
* Exceptions

## Requirements

* Using ([json file](./assets/persons.json)) added to this task deserialize data from the file to python object
  and save it to CSV file.
  * Every action should be done in a separate function.
  * One person - one row for CSV.
  * CSV file should have column headers in first line.
* Load CSV file to a python object and save it to YAML file.
  * Every action should be done in a separate function.
  * YAML structure should correspond to the original JSON.
* Add exceptions blocks to handle exceptional cases where it is necessary.

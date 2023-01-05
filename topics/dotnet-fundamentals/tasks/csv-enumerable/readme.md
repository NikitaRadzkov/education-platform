# Create CSV Enumerable

## Short Description

Create custom implementation of IEnumerable\<T> which is able to iterate through records from csv file

## Estimation (h)

3

## Topics

* Designing types
* Data structures
* IDisposable

## Requirements

* Implement generic class CsvEnumerable\<T> which is able to iterate through csv file records
* CsvEnumerable\<T> should implement IEnumerable\<T>
* To read csv file use library [CsvHelper](https://joshclose.github.io/CsvHelper/)

## Advanced Requirements

* Don't use CsvHelper to read records from csv file. Implement reading csv file using class StreamReader

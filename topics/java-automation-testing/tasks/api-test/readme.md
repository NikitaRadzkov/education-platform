# Create NBRB api test

## Short Description

Use bank api to create api test

## Estimation (h)

4

## Topics

* Java
* API
* TestNG
* Jacson

## Requirements

* Get [national bank dev api](https://www.nbrb.by/apihelp/exrates)

###Case 1

* Get currency exchange rates for today: GET /api/exrates/rates?periodicity=0
* Parse currencies into Object
* Get currency exchange rates for this day last year
* Parse currencies into Object
* Compare that today's USD, EURO rates not less then last year rates
* Get USD, EURO currency exchange rates for today by ID(Store ids from first response)
* Compare that USD, EURO rates by id and from first requests are the same

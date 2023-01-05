# Requests to JSON

## Short Description

Implement a list of tasks related to work with PostgreSQL JSON data

## Estimation (h)

12

## Topics

* Requests to JSON

## Requirements

1. Generate data for your database [here](https://www.json-generator.com/) and write it to the rable of the following
    structure:

| Id       | Data  | ModifiedOn |
| -------- | ----- | ---------- |
| objectId | jsonb | date       |

Data should be generated from two templates:

```js
[
  '{{repeat(1, 2)}}',
  {
    VehicleId: '{{objectId()}}',
    Make: '{{random("Toyota", "Honda", "BMW")}}',
    IsSold: '{{bool()}}',
    SoldPrice: '{{floating(1000, 4000, 2)}}',
    PriceHistory: [
      '{{repeat(10)}}',
      {
        PricedBy: '{{random("Auto", "Manual")}}',
        OfferedPrice: '{{floating(1000, 6000, 2)}}'
      }
    ],
    Metadata: {
      CreatedOn: '{{date(new Date(2014, 0, 1), new Date(), "YYYY-MM-ddThh:mm:ss.ZZZZZZZ")}}',
      ModifiedOn: '{{date(new Date(2014, 0, 1), new Date(), "YYYY-MM-ddThh:mm:ss.ZZZZZZZ")}}'
    }
  }
]
```

```js
[
  '{{repeat(1, 2)}}',
  {
    VehicleId: '{{objectId()}}',
    Make: '{{random("Toyota", "Honda", "BMW")}}',
    PriceHistory: [
      '{{repeat(10)}}',
      {
        PricedBy: '{{random("Auto", "Manual")}}',
        OfferedPrice: '{{floating(1000, 6000, 2)}}'
      }
    ],
    Metadata: {
      CreatedOn: '{{date(new Date(2014, 0, 1), new Date(), "YYYY-MM-ddThh:mm:ss.ZZZZZZZ")}}',
      ModifiedOn: '{{date(new Date(2014, 0, 1), ne  ZZZZZZ")}}'
    }
  }
]
```

2 row with particular `VehicleId`.
3.  Write a query to select r is greater than particular date.
4. s average ofy whicoarhrflws by th5.IsSold = tr late sum offf sum offff5.IsSold =  late sum offff sum offfor them. =  late sum of `SoldPrice` for them.
6.  Write a query tandect all rows which have `IsSold` and `SoldPrice` fields.

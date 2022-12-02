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
      ModifiedOn: '{{date(new Date(2014, 0, 1), new Date(), "YYYY-MM-ddThh:mm:ss.ZZZZZZZ")}}'
    }
  }
]
```

2. Write a query to select any row with particular `VehicleId`.
3. Write a query to select rows which `Metadata.CreatedOn` is greater than particular date.
4. Write a query which groups all price histories for all rows by the `PricedBy` field and calculates average of
   `OfferedPrice`.
5. Write a query which groups all rows with `IsSold = true` by `Make` field and calculate sum of `SoldPrice` for them.
6. Write a query to select all rows which have `IsSold` and `SoldPrice` fields.

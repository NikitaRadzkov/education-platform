# Create Logger

## Short Description

Create a simple Logger.

## Estimation (h)

5

## Topics

* Designing types
* SOLID principles

## Requirements

* Create a class Logger which implements the next interface:

```csharp
  public interface ILogger
  {
    void Error(string message);
    void Error(Exception ex);
    void Warning(string message);
    void Info(string message);
  }
```

* Logger should be able to write logs to different destinations (console, text file, database etc.)
* If there are no logging destinations provided, logger should write logs to console
* Logger and each of logging destinations should be configurable to write logs of particular level (Error, Warning,
    Info)

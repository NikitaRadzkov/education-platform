# Threads

## Short Description

Create a console application and work with threads

## Estimation (h)

2

## Topics

* Threads creation
* Threads synchronization

## Requirements

* Create console app and create class Worker with static method DoWork:

```csharp
    private static Random _random = new Random();
    private static int _counter = 0;

    public static void DoWork(object msg)
    {
        Thread.Sleep(_random.Next(1, 4) * 300);
        for (var i = 0; i < 3; i++)
        {
            Console.WriteLine($"Message: {msg}; Counter: {_counter}; Inner iteration number: {i}");
        }
        _counter++;
    }
```

* In Main method create 10 threads (in loop) and run them after creation. Each thread should call DoWork with thread
    number
* Sync WriteLine inside DoWork(object msg) in two ways on your choice
* Modify Main method and run threads sequentially

## Advanced Requirements

* Implement sending of two integer parameters to DoWork method

# Facade

## Short Description

You must solve the task using one of the design patterns.

## Estimation (h)

1

## Topics

* OOP
* Design patterns

## Requirements

You have next classes:

```java
class VideoFile
    consturctor(string filename)

class MPEG4Codec implements Codec
    consturctor()

class OGGCodec implements Codec
    consturctor()

class VideoCoverter
    consturctor()
    method convert(VideoFile file, Codec codec)
```

Implement class that will provide simple interface with one method

```java
class SimpleConverter
    methdod convert(string filename, string format)
```

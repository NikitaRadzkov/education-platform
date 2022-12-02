# Memory Leaks Testing

## Short Description

Practice in testing of memory leaks of an Android mobile application.

## Estimation (h)

12

## Topics

* Tools for Mobile Testing
* Memory Leaks

## Requirements

### Prerequisites

* Install Android Studio on your PC or laptop
* Download target application
* Extract 'SinsOfMemoryLeaks-LEAK2' project from archive
* Run 'SinsOfMemoryLeaks-LEAK2' project in Android Studio:
  * Open the project in Android Studio:
    * File > New > Import Project > path to the folder with the project
    * You should add the whole folder to Android Studio (the folder will have the icon of Android Studio)
  * Wait for the project to load and all processes to finish
  * Click on Run App ("⯈" icon)
    * You should see the window with available emulators or connected via USB devices
  * Select emulator
  * The app should build and open on the selected emulator

### Target Application

[SinsOfMemoryLeaks](./assets/SinsOfMemoryLeaks-LEAK2.zip)

### Task

* The training app contains 9 buttons tapping on which you can review different memory leaks
* Follow the instructions in the app to test each of the memory leak
* If you need more detailed instructions, you can refer to the presentation in the plan
* Remember to reset Memory Analyzer (end session and reload the app) before testing the next memory leak for more exact
  and correct results

### Result

* Report containing:
  * Name of each button where memory leak was detected
  * Screenshot of each memory leak and its class from Android Studio

## Advanced Requirements

### Target Application

[My Shows](./assets/MyShows_v3.1.1.apk)

### Task

* Install the target application on an Android smartphone
* Try to find memory leaks in the app by our own

### Result

* Bug reports

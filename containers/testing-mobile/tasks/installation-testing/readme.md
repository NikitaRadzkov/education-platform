# Installation Testing

## Short Description

Work with tools for mobile testing and train installation of Android mobile apps.

## Estimation (h)

8

## Topics

* Tools for Mobile Testing
* Types of Testing

## Requirements

### Prerequisites

* iTunes / Xcode
* Android Studio
* Charles

### Task 1

* Find UDID of an iOS device

### Result 1

* Screenshot of iTunes / Xcode with visible UDID

### Task 2

* Download [My Shows app](./assets/MyShows_v3.1.1.apk)
* Open any emulator in Android Studio
* Install the app on the emulator via ADB

### Result 2

* Screenshot of console with visible commands and the message about successfull installation
* Screenshot of the emulator with the opened My Shows app

### Task 3

* Download [My Shows app](./assets/MyShows_v3.1.1.apk)
* Install the app on an Android device
* Configure Charles Proxy on your PC and mobile device
  * Remember to install the required certificate
* Open My Shows app on the mobile device
* Log into the app (create an account before that if required)
* Make sure you can see the decrypted requests from the app in Charles

### Result 3

* Screenshot of configured proxy on the mobile device
* Screenshot of decrypted requests from My Shows app in Charles

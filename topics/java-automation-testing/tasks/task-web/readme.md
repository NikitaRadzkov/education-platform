# Using custom test framework

## Short Description

Create steam test, using your test framework

## Estimation (h)

20

## Topics

* Java
* Selenium
* TestNG
* PageObject
* Log4J
* WebdriverManager
* Framework

## Requirements

### Case 1

* Open <https://store.steampowered.com/>
* Login with incorrect credentials
* Assert account invalid dialog

### Case 2

Open main page

Click install steam

![Click install steam](./assets/installsteam.jpg)

Download steam app

![Download steam app](./assets/installsteam2.jpg)

Check that file was downloaded

### Case 3

Open main page

Select random game genres

![Select random game genres](./assets/steamgame.jpg)

Get three game and save name, price, discount

![Get three game and save name, price, discount](./assets/steamgame.jpg)

Find this game using search

![Find this game using search](./assets/steamgame3.jpg)

Open selected game

Navigate to gave can contains age validation dialog

![Navigate to gave can contains age validation dialog](./assets/agedialog.jpg)

Compare saved data and data from game page

![Compare saved data and data from game page](./assets/steamgame4.jpg)

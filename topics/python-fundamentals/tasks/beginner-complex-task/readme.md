# Beginner Complex Task

## Short Description

In the task below trainee fulfills a number of subtasks which help to try in practice different Python libraries and
tools and get experience in Python programming.

## Estimation (h)

40

## Topics

* Algorithms
* Strings
* Collections
* Sorting
* Regular Expressions
* TKinter (UI)
* Logging
* SQLite
* Pickle
* Unittest
* YAML

## Requirements

* Create a program to count number of tags on a web page.
  * The app. returns total amount of tags on a page and a descending sorted dictionary with unique tags and number
    of how many times a tag is present on a page. Example {\<div>:10, \<span>:8, \header>:2, ....}.
  * The program should work from the console and from GUI.
  * For creation GUI app. use standard TKinter library.
  * If the program gets command line keys then console version starts.
  * If the program is started without parameters then GUI version is open.
  * Console start format: 'tagcounter command (options)'.
  * Write processed web pages in special log files. Log format: data time siteUrl.
  * Save dictionary with tags into SQLite DB.
  * Dictionary with tags is saved in one DB field using Pickle library.
  * Site name, URL, check date, tag data should be saved in DB.
  * For more comfortable work add YAML file with site name synonyms. This YAML file defines synonyms for every site.
    For example:
    * ydx: yandex.ru
    * ggl: google.com
  * YAML file with several synonyms is attached to the program.
  * Users can add/delete data from/to YAML file.
  * Create unit tests for key functions.
  * Approximate contents of GUI window:
    * The combo box with list of available sites is located in the top.
    * The field for manual input of a page URL is located under the combobox.
    * The buttons "Load" and "Show from DB" are located under the field.
    * The row with status is located under the buttons.
  * How to run console version:
    * To get list of tags:  tagcounter --get "yandex.ru"
    * Synonyms are accepted by the app. like regular URLs: tagcounter --get "ydx"
  * How to get saved data from DB, console version: tagcounter --view "yandex.ru"
  * How to design the package:
    * The program contains setup.py file in order the package might be built using "sdist" command or using PIP.

# Automation test cases

## Short Description

Create test cases for auto tests using BDD and DDD approaches

## Estimation (h)

4

## Topics

* BDD approach
* DDD approach

## Requirements

### Rewrite following scenarios using Gherkin format

Given ...

When ...

Then ...

| Var1 | Var2 |

| Value1 | Value2 |

### Step 1

* Open <http://automationpractice.com/>
* Click Sign in link
* Input your Email and PW
* Click Sign in button
* Verify your login name is displayed in top right corner

### Step 2

* Open <http://automationpractice.com/>
* Input "Dress" in search box
* Sort the search results by Product name A-Z
* Verify A-Z sorting is correct

Repeat test for Z-A sorting, Price (Lowest first), Price (Highest first)

### Step 3

* Open <http://automationpractice.com/>
* Switch to "Dress" tab
* Select 1, 3, 5 items, remember their names and prices and add them to the Cart
* Verify Cart block - it should contain label "3 products"
* Hover over Cart section
* Verify expanded section contains 3 products with remembered names and prices

# Test Driven Development with Java
Test Driven Development has 3 simple lifecycles.
1. Write simple test first
2. Implement it.
3. Fix the errors.
   * Compilation Error - Use IDE to fix. (Intellij and Eclipse can fix the error in no time.)
   * Test Failures     - Fix the **bugs**   
 
There could also be 4th lifecycle for refactoring. It is applied as and when needed.

##Getting Started
Clone it in your local with ssh `git clone git@github.com:rajsenthil/tdd-java.git` 
or with https `git clone https://github.com/rajsenthil/tdd-java.git`

##Prerequisites
* Java IDE ([Intellij](https://www.jetbrains.com/idea/download/) or [Eclipse](https://www.eclipse.org/downloads/)) 
* Maven 3.5+
* JDK 1.8  

## Running the tests
Either the tests cases are run in IDE or with maven command `mvn clean test` 

##Built With
[Maven](https://maven.apache.org/) - Dependency Management

## TDD details
#### TDD with Array rotation in Java
The array rotation is implemented with TDD and try to complete it.

Array rotation is that in a given array the rotation takes in counter clockwise (alternate to this at later stage).

For example: 
* For an array of size with elements [8, 3, 4, 9, 1] with two rotations will give [4, 9, 1, 8, 3] 

![Array with Two rotation](https://github.com/rajsenthil/tdd-java/raw/master/docs/images/ArrayRotateBy2.png "Array with Two rotations")

* The same array with 3 rotaion will be 

![Array with Two rotation](https://github.com/rajsenthil/tdd-java/raw/master/docs/images/ArrayRotateBy3.png "Array with Three rotations")

#### Project Structure
The project is divided into 4 chapters to complete this assignment. 
The chapters are cumulative and the last chapter is completed assignment.

* Chapter 01 - Module to write a first simple test
* Chapter 02 - Implement the algorithm
* Chapter 03 - Add more test cases and verify it 
* Chapter 04 - Add more test, implement and refactor if needed. [alternate case](https://github.com/rajsenthil/tdd-java/raw/master/docs/images/AlternateArrayRotate.png)

#### Scope
The scope of this project is to give an hands-on introduction with TDD, suffice enough
to cover it in an hour or so.

#### Reference
There are many available resources online to look at:
* [youtube](https://www.youtube.com/results?search_query=test+driven+development+java)
* [Udemy](https://www.udemy.com/courses/search/?q=test%20driven%20development&src=sac&kw=test%20dr)

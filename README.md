# TestProject
# Web Automation assessment 
A UI test automation solution using Selenium,Java, Maven and Cucumber

## Overvie of the Project 

**Web Automation assessment**

Develop a Web test solution that automates a few simple tests, composed as BDD scenarios.
The target for the test is the dummy web site: http://automationpractice.com

- **Scenario 1**: Order T-Shirt (and Verify in Order History)
- **Scenario 2**: Update Personal Information (First Name) in My Account

**Secnario Requirements to devlop the scripts**:
- Build a test project that includes automation of the 2 scenario above.
- Solution to be coded in Java and driven using a BDD tool (see potential solution components below)
- Share code in a public GitHub repository for review. Include execution instructions.
- Share further improvements that could be considered to develop the framework (Optional)

**Components are used to complete the Web Automation assessment **

The following suggested tools and libraries (or similar substitutes) should be used:
- CucumberJVM
- WebDriver
- Maven

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Technical stack used

- [JAVA SE 8](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html) (Java 9 is not yet supported by Cucumber) 
- [Maven](https://maven.apache.org/index.html) - version 3.3.1 or higher
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (community edition is free)
	- [IntelliJ IDEA Cucumber for Java plugin](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java)
- [Chrome](https://www.google.co.uk/chrome/?brand=CHBD&gclid=EAIaIQobChMI8fKl0aqw3QIVTb7tCh0lLgBWEAAYASABEgK5W_D_BwE&gclsrc=aw.ds&dclid=CPPZrNiqsN0CFUQs4AodO8EIZQ)

## Execution of test scenarios

There are 2 way to run the tests:
1. Open the project in IntelliJ navigate to src > test > resources > webautoexercise to find the feature files, right click webautoexercise, select Run tests to run all tests. To run tests for an individual feature file, right click the feature and Run tests. 

2. Open a command/terminal window, CD to the directory where the project is located and run the following:

### Test results
Test result screen shots are provided for reference  - TestProject>TestResults

## Improvements
1. Currently username and password test data sits in the TestBase class. A better test data strategy is required which could include:
 	- Better way to give the Userid and password test data in the Cucumber examples as scenario outline which gives more reusablitly to execute with different users with 		 different roles.
2. It would be good to add the Screenshots method after every step completes in the cucumber.
3. Execution report also can be added through TestNg or other Plugins so that after all the tests are completed it can be generate test execution report.
4. Lastly, i think it would be nicer to add the glue in the cucumber runner file, so that it will pick up all the feature files when we just run the Runner file.
5.  Update Personal Information (First Name) in the scenario2, the test should also verify the name has changed either via the UI or checking the database. 



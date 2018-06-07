# ValtechTest
Summary:

1. BDD Framework tests written using Eclipse, Selenium, Java, Cucumber, Junit, Maven

2. Design Pattern Used: POM(Page Factory)

3. Project guide:

	a) Maven is used to create this project and required jars has defined in 'pom.xml'
	
	b) BDD Tests are described in cucumber feature files under the 'com.qa.features' package. 
	
	   Single scenario tests are described using cucumber annotation 'Scenario'. 
	   
	   Multiple scenario tests are described using 'Scenario Outline'
	   
	c) BDD feature steps are defined in steps files under the 'com.qa.stepdefinitions' package
	
	d) Steps files business logics are written in page object under the 'com.qa.pages' package, which also include functions and reusable codes
	
	e) Webdriver is initialized in 'TestBase.java' under the 'com.qa.util' package which also includes closing of webdriver. 
	
    f) Config.properties file for project configuration data like URL etc

	g) Page objects are extending their functions from BasePage and also have own functions
	
	h) Test are running from different options such as feature file or Junit with RunnerTest.java or Mvn
	
	i) Test reports are generating in html format in target folder 
	
4. To Run the tests 

	a) Download/clone the repository to your local git folder
	
	b) import above git project in to your eclipse projects - project path will be git
	
	c) Go to > TestRunner.java
	
	d) Right click and run as JUnit Test
	
	
						

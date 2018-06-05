Feature: Valtech Homepage 

Background:
Given user opens browser
	
Scenario: User is one homepage and verify whether Latest News section is displaying 

	And user validates homepage title 
	When user search for latest news section on homepage 
	Then user able to see latest news successfully 
	And user close the browser 
	
Scenario: Find contact us page 
	When user scroll to contact us 
	Then user verify branches details 
	And user close the browser 
	
	

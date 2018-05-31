Feature: Valtech Homepage 


Scenario: User is one homepage and verify whether Latest News section is displaying

 Given user opens browser
 And user validates homepage title
 When user search for latest news section on homepage
 And close the browser
 
  Scenario: Find contact us page    	
    	When user scroll to contact us
    	Then user verify branches details 
 
 

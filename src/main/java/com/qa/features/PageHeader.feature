Feature: Page Header Validation

Scenario Outline: About page header validation
    Given I go to <pagetype> pages
    When I search for page header text
    Then I veify page header <content> in the page
    
    Examples:
    | pagetype 	| content 	|
    | About 	| About 	|
    | Work 		| Work 		|
    | Services 	| Services 	|
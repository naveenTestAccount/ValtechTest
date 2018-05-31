Feature: Page Header Validation

Scenario Outline: About page header validation
    Given user go to <pagetype> pages
    When user search for page header text
    Then user veify page header <content> in the page
    
    Examples:
    | pagetype 	| content 	|
    | About 	| About 	|
    | Work 		| Work 		|
    | Services 	| Services 	|
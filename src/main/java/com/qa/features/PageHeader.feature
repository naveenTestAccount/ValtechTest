Feature: Page Header Validation

  Background: 
    Given user opens browser

  Scenario Outline: page validation
    Given user go to <pagetype> page
    When user search for page header text
    Then user verifies page header <content> in the page
    Then user close the browser

    Examples: 
      | pagetype | content |
      | About    | About   |
      | Work     | Work    |

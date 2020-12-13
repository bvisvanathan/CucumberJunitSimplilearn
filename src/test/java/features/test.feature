Feature: amazon search functionality test:

 

  Scenario: provide test search function to the user to have quick access to required product:
    Given user test is already on home page
    When user test clicks search and type laptop
    Then user test should be shown all available laptop in the inventory
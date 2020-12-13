Feature: amazon search functionality:

 

  Scenario: provide search function to the user to have quick access to required product:
    Given user is already on home page
    When user clicks search and type laptop
    Then user should be shown all available laptop in the inventory
    
Feature: amazon search functionality:

  Background: 
    Given user should open chrome browser

  Scenario Outline: provide search function to the user to have quick access to required product:
    Given user is already on home page
    When user clicks search and type "<ProductName>"
    Then user should be shown all available "<ProductName>" in the inventory
    But user should not see the "<ExcludedProduct>"

    Examples: 
      | ProductName | ExcludedProduct |
      | Laptop      | Dell            |
      | Mobile      | Samsung         |

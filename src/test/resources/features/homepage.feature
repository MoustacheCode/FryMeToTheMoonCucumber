Feature: Homepage Navigation and Actions

Background:
  Given the user is on the Homepage

  Scenario: User can view recipe
    When user selects the View button on a recipe
    Then user should be directed to the specific recipe page



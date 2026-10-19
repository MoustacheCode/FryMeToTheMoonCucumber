@homepage
Feature: Homepage Navigation and Actions

Background:
  Given user is on the Homepage

  Scenario: User can view recipe
    When user selects the View button on a recipe
    Then user should be directed to the specific recipe page

  Scenario: User can search for a recipe
    When user searches for recipe "Honey"
    And user clicks the filter button
    Then user should see "Honey Garlic Chicken Stir-Fry" in the recipe results


  Scenario: User can filter recipes by category
    When user selects the category "Desserts"
    And user clicks the filter button
    Then all displayed recipes should belong to the "Desserts" category


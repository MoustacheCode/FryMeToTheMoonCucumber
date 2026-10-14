Feature: Recipe Details and Interactions

  Background:
    Given user is on the Homepage


  Scenario: User can view all details of a recipe
    When user clicks the View Recipe button on a recipe card
    Then user should see the recipe title
    And user should see the recipe description
    And user should see the recipe instructions
    And user should see the recipe ingredients

  Scenario: Logged in user can successfully leave a comment
    Given user has successfully logged in
    When user clicks the View Recipe button on a recipe card
    And user enters comment "This one is amazing!"
    And user clicks the add comment button
    Then user should see a comment success message
Feature: Add a new recipe

  Background:
    Given user has successfully logged in
    And user is on the Homepage


    Scenario: User can successfully add their own recipe
      When user selects the add recipe button
      And user submits a new recipe with the following details:

        | Title             | Description                                 | Ingredients                     | Instructions                      | Category | Cook Time |
        | Rik's Test Recipe | A delicious Test Recipe under 30 minutes!   | Add 500g of Test to oven dish   | Bake Test in oven for 25 minutes  | Snacks   | 25        |

      And user click the save recipe button
      Then user should see a success confirmation message
      And user should be redirected to the Homepage

    Scenario: User can cancel creating a recipe
      When user selects the add recipe button
      And user submits a new recipe with the following details:

        | Title              | Description                                             | Ingredients                                             | Instructions      | Category | Cook Time |
        | Rik's Cancel Recipe| A delicious Test Recipe to be cancelled in 2 seconds!   | Throw it all in the bin because we've changed our minds!| Turn off the oven | Snacks   | 25        |

      And user clicks on the cancel recipe button
      Then user should be redirected back to the Homepage
      And user should still be logged in


    Scenario: User cannot save a recipe without a title
      When user selects the add recipe button
      And user clicks on the save recipe button
      Then user should see that the title field is required
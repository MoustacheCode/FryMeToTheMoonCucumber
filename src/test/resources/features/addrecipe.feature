Feature: Add a new recipe

  Background:
    Given the user is on the Homepage


    Scenario: User can successfully add their own recipe
      When they select the add recipe button
      And they submit a new recipe with the following details:

        | Title     | Description          | Ingredients          | Instructions | Category | Cook Time |
        | Apple Pie | Classic holiday pie. | Apples, Flour, Sugar | Bake at 200C | Desserts | 45 mins   |

      And they click the save recipe button
      Then they should see a success confirmation message
      And they should be redirected to the Homepage
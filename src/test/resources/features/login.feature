
  Feature: User logs in

    Background:
      Given user is on the home page

    Scenario: Successful Login
      When user enters username standard_user
      And user enters password
      And user clicks the login button
      Then user should be redirected back to the home page


    Scenario: Login with incorrect password
      When user enters standard_username
      And user enters incorrect password
      And user clicks login button
      Then user should see invalid credentials error
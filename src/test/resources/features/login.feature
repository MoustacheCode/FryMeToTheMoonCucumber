
  Feature: User logs in

    Background:
      Given user is on the login page

    Scenario: Successful Login
      When user enters username "STANDARD_USERNAME"
      And user enters "STANDARD_PASSWORD"
      And user clicks the login button
      Then user should be redirected back to the home page


    Scenario: Login with incorrect password
      When user enters "STANDARD_USERNAME"
      And user enters incorrect password
      And user clicks login button
      Then user should see invalid credentials error
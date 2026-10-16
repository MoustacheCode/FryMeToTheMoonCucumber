
@Login
Feature: User logs in

    Background:
      Given user is on the login page

    Scenario: Successful Login
      When user enters correct username
      And user enters correct password
      And user clicks the login button
      Then user should be redirected back to the home page


    Scenario: Login with incorrect password
      When user enters correct username
      And user enters incorrect password
      And user clicks the login button
      Then user should see invalid credentials error

    Scenario: Successful Logout
      Given user has successfully logged in
      And user is on the Homepage
      When user clicks the logout button
      Then user should see that they are logged out
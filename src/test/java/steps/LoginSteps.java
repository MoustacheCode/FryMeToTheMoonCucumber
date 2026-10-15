package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

// Shared or reused steps

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        System.out.println("I am navigating to the login page..");
    }

    @When("user enters correct username")
    public void userEntersUsername() {
        System.out.println("I am entering username..");
    }

    @When("user enters correct password")
    public void userEntersPassword() {
        System.out.println("I am entering password..");
    }

    @When("user clicks the login button")
    public void userClicksTheLoginButton() {
        System.out.println("Clicking the login button..");
    }

    // Scenario 1 - Login successfully

    @Then("user should be redirected back to the home page")
    public void userShouldBeRedirectedBackToTheHomePage() {
        System.out.println("Home page redirection..");
    }

    // Scenario 2 - Wrong pass login

    @Then("user should see invalid credentials error")
    public void userShouldSeeInvalidCredentialsError() {
        System.out.println("Checking error message is visible..");
    }

    // Scenario 3 - Log out

    @Given("user is on the Homepage")
    public void userHasSuccessfullyLoggedIn() {
        System.out.println("Pre-Req: User is logged in..");
    }

    @Given("user is on the Homepage")
    public void userIsOnTheHomepage() {
        System.out.println("Checking user is on Homepage..");
    }

    @When("user clicks the logout button")
    public void userClicksTheLogoutButton() {
        System.out.println("I clicked logout..");
    }

    @Then("user should see that they are logged out")
    public void userShouldSeeThatTheyAreLoggedOut() {
        System.out.println("Checking logout success..");
    }
}

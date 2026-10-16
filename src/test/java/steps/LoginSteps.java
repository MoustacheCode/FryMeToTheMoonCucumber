package steps;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import shared.TestContext;
import org.junit.jupiter.api.Assertions;


public class LoginSteps {

    private final TestContext testContext;
    private LoginPage loginPage;

    public LoginSteps(TestContext testContext) {
        this.testContext = testContext;
    }

// Shared or reused steps

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        HomePage homePage = new HomePage(testContext.getDriver());
        this.loginPage = homePage.clickLogin();

        System.out.println("I am navigating to the login page..");
    }

    @When("user enters correct username")
    public void userEntersUsername() {
        loginPage.enterUsername();
        System.out.println("I am entering username..");
    }

    @When("user enters correct password")
    public void userEntersPassword() {
        loginPage.enterPassword();
        System.out.println("I am entering password..");
    }

    @When("user clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.userClicksLoginButton();
        System.out.println("Clicking the login button..");
    }

    // Scenario 1 - Login successfully

    @Then("user should be redirected back to the home page")
    public void userShouldBeRedirectedBackToTheHomePage() {
        System.out.println("Home page redirection..");

        HomePage homePage = new HomePage(testContext.getDriver());
        Assertions.assertTrue(homePage.isLoggedIn(), "I don't think I logged in..");
    }

    // Scenario 2 - Wrong pass login

    @When("user enters incorrect password")
    public void userEntersIncorrectPassword() {
        loginPage.userEntersWrongPassword("wrongpass");
    }

    @Then("user should see invalid credentials error")
    public void userShouldSeeInvalidCredentialsError() {
        System.out.println("Checking error message is visible..");

        String actualErrorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Please enter a correct username and password. Note that both fields may be case-sensitive.";

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    // Scenario 3 - Log out

    @Given("user has successfully logged in")
    public void userHasSuccessfullyLoggedIn() {
        System.out.println("Pre-Req: User is logged in..");
        HomePage homePage = new HomePage(testContext.getDriver());
        this.loginPage = homePage.clickLogin();

        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.userClicksLoginButton();

        Assertions.assertTrue(homePage.isLoggedIn(), "I couldn't find the Logout button..");
    }


    @When("user clicks the logout button")
    public void userClicksTheLogoutButton() {
        System.out.println("I clicked logout..");
        HomePage homePage = new HomePage(testContext.getDriver());
        homePage.clickLogout();
    }

    @Then("user should see that they are logged out")
    public void userShouldSeeThatTheyAreLoggedOut() {
        System.out.println("Checking logout success..");
        HomePage homePage = new HomePage(testContext.getDriver());
        Assertions.assertTrue(homePage.isLoggedOut(), "I don't seem to have logged out..");
    }
}

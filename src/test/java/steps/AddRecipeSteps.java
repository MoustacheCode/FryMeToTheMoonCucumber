package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddRecipeSteps {

    // Shared steps

    @Given("user has successfully logged in")
    public void userHasSuccessfullyLoggedIn() {
        System.out.println("Pre-req - User is logged in..");
    }

    @Given("user is on the Homepage")
    public void userIsOnTheHomepage() {
        System.out.println("Checking I'm on the homepage..");
    }

    // Scenario 1 steps

    @When("user selects the add recipe button")
    public void userSelectsTheAddRecipeButton() {
        System.out.println("I'm clicking the add recipe button..");
    }

    @When("user submits a new recipe with the following details")
    public void userSubmitsANewRecipeWithTheFollowingDetails(DataTable dataTable) {
        System.out.println("Submitting a new recipe using the data table..");
    }

    @When("user clicks on the save recipe button")
    public void userClicksOnTheSaveRecipeButton() {
        System.out.println("I'm clicking the save recipe button..");
    }

    @Then("user should see a success confirmation message")
    public void userShouldSeeASuccessConfirmationMessage() {
        System.out.println("I'm checking for the confirmation message..");
    }

    @Then("user should be redirected to the Homepage")
    public void userShouldBeRedirectedToTheHomepage() {
        System.out.println("I'm checking I've gone back to the homepage..");
    }

    // Scenario 2 steps

    @When("user clicks on the cancel recipe button")
    public void userClicksOnTheCancelRecipeButton() {
        System.out.println("I'm clicking on the cancel recipe button..");
    }

    @Then("user should still be logged in")
    public void userShouldStillBeLoggedIn() {
        System.out.println("I'm checking I'm still logged in..");
    }

    // Scenario 3 steps

    @Then("user should see that the title field is required")
    public void userShouldSeeThatTheTitleFieldIsRequired() {
        System.out.println("I'm checking the title field error message is shown..");
    }
}

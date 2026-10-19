package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import shared.TestContext;

public class RecipePageSteps {

    private final TestContext testContext;
    private LoginPage loginPage;

    public RecipePageSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    // Scenario 1
    // Move this step to common
    @When("user clicks the View Recipe button on a recipe card")
    public void userClicksTheViewRecipeButtonOnARecipeCard() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user should see the recipe title")
    public void userShouldSeeTheRecipeTitle() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user should see the recipe description")
    public void userShouldSeeTheRecipeDescription() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user should see the recipe instructions")
    public void userShouldSeeTheRecipeInstructions() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user should see the recipe ingredients")
    public void userShouldSeeTheRecipeIngredients() {
        // Write code here that turns the phrase above into concrete actions
    }

    // Scenario 2

    // Move this step to common
    @When("user clicks the View Recipe button on a recipe card")
    public void userClicksTheViewRecipeButtonOnARecipeCard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters comment {string}")
    public void userEntersComment(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the add comment button")
    public void userClicksTheAddCommentButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see a comment success message")
    public void userShouldSeeACommentSuccessMessage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

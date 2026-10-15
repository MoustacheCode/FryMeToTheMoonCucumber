package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps {

    // Shared steps

    @Given("the user is on the Homepage")
    public void theUserIsOnTheHomepage() {
        System.out.println("Heading to the Homepage..");
    }

    @When("user clicks the filter button")
    public void userClicksTheFilterButton() {
        System.out.println("I'm clicking hte filter button..");
    }

    // Scenario 1 steps

    @When("user selects the View button on a recipe")
    public void userSelectsTheViewButtonOnARecipe() {
        System.out.println("I'm clicking on the view button..");
    }

    @Then("user should be directed to the specific recipe page")
    public void userShouldBeDirectedToTheSpecificRecipePage() {
        System.out.println("Heading to the recipe page..");
    }

    // Scenario 2 steps

    @When("user searches for recipe {string}")
    public void userSearchesForRecipe(String recipeName) {
        System.out.println("I'm searching for recipe " + recipeName);
    }

    @Then("user should see {string} in the recipe results")
    public void userShouldSeeInTheRecipeResults(String expectedRecipe) {
        System.out.println("Checked the list contains " +expectedRecipe);
    }

    // Scenario 3 steps

    @When("user selects the category {string}")
    public void userSelectsTheCategory(String categoryName) {
        System.out.println("I'm selecting the category " + categoryName);
    }

    @Then("all displayed recipes should belong to the {string} category")
    public void allDisplayedRecipesShouldBelongToTheCategory(String expectedCategory) {
        System.out.println("Checking the recipes match the " + expectedCategory + " category");
    }
}

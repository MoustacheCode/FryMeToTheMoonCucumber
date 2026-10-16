package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.AddRecipePage;
import pages.HomePage;
import shared.TestContext;

import java.util.List;
import java.util.Map;

public class AddRecipeSteps {

    private final TestContext testContext;
    private AddRecipePage addRecipePage;

    public AddRecipeSteps(TestContext testContext) {
        this.testContext = testContext;

    }



    // Scenario 1 steps

    @When("user selects the add recipe button")
    public void userSelectsTheAddRecipeButton() {
        System.out.println("I'm clicking the add recipe button..");
        HomePage homepage = new HomePage(testContext.getDriver());
        this.addRecipePage = homepage.clickAddRecipe();
    }

    @When("user submits a new recipe with the following details:")
    public void userSubmitsANewRecipeWithTheFollowingDetails(DataTable dataTable) {
        System.out.println("Submitting a new recipe using the data table..");
        // Convert the data table from features into a list
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        // Get the correct row of data (index 0)
        Map<String, String> data = rows.get(0);
        // Extract the values from the column headers

        String recipeTitle        = data.get("Title");
        String recipeDescription  = data.get("Description");
        String recipeIngredients  = data.get("Ingredients");
        String recipeInstructions = data.get("Instructions");
        String recipeCategory     = data.get("Category");
        Integer recipeCookTime    = Integer.parseInt(data.get("Cook Time"));

        // Pass data to POM
        addRecipePage.enterTitle(recipeTitle);
        addRecipePage.enterDescription(recipeDescription);
        addRecipePage.enterIngredients(recipeIngredients);
        addRecipePage.enterInstructions(recipeInstructions);
        addRecipePage.selectCategory(recipeCategory);
        addRecipePage.enterCookTime(recipeCookTime);

    }

    @When("user clicks on the save recipe button")
    public void userClicksOnTheSaveRecipeButton() {
        addRecipePage.saveRecipe();
        System.out.println("I'm clicking the save recipe button..");
    }

    @Then("user should see a success confirmation message")
    public void userShouldSeeASuccessConfirmationMessage() {
        System.out.println("I'm checking for the confirmation message..");
        String expectedMessage = "Recipe Submitted\nRedirecting to recipe list…";
        String actualMessage = addRecipePage.getSuccessPopupText();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Then("user should be redirected to the Homepage")
    public void userShouldBeRedirectedToTheHomepage() {
        System.out.println("I'm checking I've gone back to the homepage..");
        HomePage homePage = new HomePage(testContext.getDriver());
        Assertions.assertTrue(homePage.isLoggedIn(), "I don't seem to be logged in..");
    }

    // Scenario 2 steps

    @When("user clicks on the cancel recipe button")
    public void userClicksOnTheCancelRecipeButton() {
        System.out.println("I'm clicking on the cancel recipe button..");
        addRecipePage.cancelRecipe();
    }

    @Then("user should still be logged in")
    public void userShouldStillBeLoggedIn() {
        System.out.println("I'm checking I'm still logged in..");
        HomePage homePage = new HomePage(testContext.getDriver());
        Assertions.assertTrue(homePage.isLoggedIn(), "I don't seem to be logged in..");
    }

    // Scenario 3 steps

    @Then("user should see that the title field is required")
    public void userShouldSeeThatTheTitleFieldIsRequired() {
        System.out.println("I'm checking the title field error message is shown..");
        addRecipePage.isTitleFieldRequired();
    }
}

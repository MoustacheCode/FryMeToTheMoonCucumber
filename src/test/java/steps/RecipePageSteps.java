package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.HomePage;
import pages.LoginPage;
import pages.RecipeCard;
import pages.RecipePage;
import shared.TestContext;

public class RecipePageSteps {

    private final TestContext testContext;
    private RecipePage recipePage;
    private HomePage homePage;
    private RecipeCard recipeCard;

    public RecipePageSteps(TestContext testContext) {
        this.testContext = testContext;

        this.recipePage = new RecipePage(testContext.getDriver());
        this.homePage = new HomePage(testContext.getDriver());
        this.recipeCard = new RecipeCard(testContext.getDriver());
    }

    // Scenario 1
    // Move this step to common


    @Then("user should see the recipe title")
    public void userShouldSeeTheRecipeTitle() {
        System.out.println("Checking I can see the Recipe Title..");
        Assertions.assertTrue(recipePage.isTitleDisplayed());

        }
    @Then("user should see the recipe description")
    public void userShouldSeeTheRecipeDescription() {
        System.out.println("Checking I can see the Recipe Description..");
        Assertions.assertTrue(recipePage.isDescriptionDisplayed());
    }
    @Then("user should see the recipe instructions")
    public void userShouldSeeTheRecipeInstructions() {
        System.out.println("Checking I can view the Instructions..");
        Assertions.assertTrue(recipePage.areInstructionsReturned());
    }
    @Then("user should see the recipe ingredients")
    public void userShouldSeeTheRecipeIngredients() {
        System.out.println("Checking I can view the Ingredients..");
        Assertions.assertTrue(recipePage.areIngredientsReturned());
    }

    // Scenario 2

    @When("user enters comment {string}")
    public void userEntersComment(String commentText) {
        System.out.println("Checking I can enter a comment..");
        recipePage.enterComment(commentText);
    }
    @When("user clicks the add comment button")
    public void userClicksTheAddCommentButton() {
        System.out.println("Clicking add comment button..");
        recipePage.clickAddComment();

    }
    @Then("user should see a comment success message")
    public void userShouldSeeACommentSuccessMessage() {
        System.out.println("Checking I can see the success message..");
        Assertions.assertTrue(recipePage.isSuccessMessageShown());
    }
}

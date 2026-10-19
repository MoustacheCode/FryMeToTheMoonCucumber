package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.AddRecipePage;
import pages.HomePage;
import pages.RecipeCard;
import pages.RecipePage;
import shared.TestContext;

import java.util.List;

public class HomepageSteps {

    private final TestContext testContext;
    private HomePage homePage;
    private RecipeCard recipeCard;
    private RecipePage recipePage;

    public HomepageSteps(TestContext testContext) {
        this.testContext = testContext;

        this.homePage = new HomePage(testContext.getDriver());
        this.recipeCard = new RecipeCard(testContext.getDriver());
        this.recipePage = new RecipePage(testContext.getDriver());

    }



    @When("user clicks the filter button")
    public void userClicksTheFilterButton() {
        System.out.println("I'm clicking hte filter button..");
        homePage.clickFilter();
    }

    // Scenario 1 steps

    @When("user selects the View button on a recipe")
    public void userSelectsTheViewButtonOnARecipe() {
        System.out.println("I'm clicking on the view button..");
        recipeCard.clickViewRecipeButton();
    }

    @Then("user should be directed to the specific recipe page")
    public void userShouldBeDirectedToTheSpecificRecipePage() {
        System.out.println("Heading to the recipe page..");

        String urlContains = testContext.getDriver().getCurrentUrl();
        Assertions.assertTrue(urlContains.contains("/recipe/"), "The browser did not redirect to a recipe page! " + urlContains);

    }

    // Scenario 2 steps

    @When("user searches for recipe {string}")
    public void userSearchesForRecipe(String recipeName) {
        System.out.println("I'm searching for recipe " + recipeName);
        homePage.searchRecipe(recipeName);
        homePage.clickFilter();
    }

    @Then("user should see {string} in the recipe results")
    public void userShouldSeeInTheRecipeResults(String expectedRecipe) {
        System.out.println("Checked the list contains " +expectedRecipe);
        List<String> actualRecipeTitles = recipeCard.getRecipeTitle();
        boolean recipeMatch = actualRecipeTitles.stream().anyMatch(title -> title.contains(expectedRecipe));

        Assertions.assertTrue(recipeMatch, "I couldn't find " + expectedRecipe);
    }

    // Scenario 3 steps

    @When("user selects the category {string}")
    public void userSelectsTheCategory(String categoryName) {
        System.out.println("I'm selecting the category " + categoryName);
        homePage.selectCategory(categoryName);
    }

    @Then("all displayed recipes should belong to the {string} category")
    public void allDisplayedRecipesShouldBelongToTheCategory(String expectedCategory) {
        System.out.println("Checking the recipes match the " + expectedCategory + " category");
        Assertions.assertTrue(recipeCard.getRecipeCategory().contains(expectedCategory));
    }
}

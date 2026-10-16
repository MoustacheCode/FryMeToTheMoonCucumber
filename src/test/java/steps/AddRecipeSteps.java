//package steps;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.WebDriver;
//import pages.AddRecipePage;
//import pages.HomePage;
//
//public class AddRecipeSteps {
//
//    private WebDriver driver;
//    private AddRecipePage addRecipePage;
//    private HomePage homePage;
//
//    public AddRecipeSteps(WebDriver driver) {
//        this.driver = driver;
//        this.addRecipePage = new AddRecipePage(driver);
//        this.homePage = new HomePage(driver);
//    }
//
//    // Shared steps
//
//    @Given("user has successfully logged in")
//    public void userHasSuccessfullyLoggedIn() {
//        System.out.println("Pre-req - User is logged in..");
//    }
//
//    @Given("user is on the Homepage")
//    public void userIsOnTheHomepage() {
//        System.out.println("Checking I'm on the homepage..");
//    }
//
//    // Scenario 1 steps
//
//    @When("user selects the add recipe button")
//    public void userSelectsTheAddRecipeButton() {
//        System.out.println("I'm clicking the add recipe button..");
//    }
//
//    @When("user submits a new recipe with the following details")
//    public void userSubmitsANewRecipeWithTheFollowingDetails(DataTable dataTable) {
//        // Convert the data table from features into a list
//        java.util.List<java.util.Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
//        // Get the correct row of data (index 0)
//        java.util.Map<String, String> data = rows.get(0);
//        // Extract the values from the column headers
//
//        String recipeTitle        = data.get("Title");
//        String recipeDescription  = data.get("Description");
//        String recipeIngredients  = data.get("Ingredients");
//        String recipeInstructions = data.get("Instructions");
//        String recipeCategory     = data.get("Category");
//        Integer recipeCookTime    = Integer.parseInt(data.get("Cook Time"));
//
//        // Pass data to POM
//        addRecipePage.enterTitle(recipeTitle);
//        addRecipePage.enterDescription(recipeDescription);
//        addRecipePage.enterIngredients(recipeIngredients);
//        addRecipePage.enterInstructions(recipeInstructions);
//        addRecipePage.selectCategory(recipeCategory);
//        addRecipePage.enterCookTime(recipeCookTime);
//        System.out.println("Submitting a new recipe using the data table..");
//    }
//
//    @When("user clicks on the save recipe button")
//    public void userClicksOnTheSaveRecipeButton() {
//        addRecipePage.saveRecipe();
//        System.out.println("I'm clicking the save recipe button..");
//    }
//
//    @Then("user should see a success confirmation message")
//    public void userShouldSeeASuccessConfirmationMessage() {
//        System.out.println("I'm checking for the confirmation message..");
//    }
//
//    @Then("user should be redirected to the Homepage")
//    public void userShouldBeRedirectedToTheHomepage() {
//        System.out.println("I'm checking I've gone back to the homepage..");
//    }
//
//    // Scenario 2 steps
//
//    @When("user clicks on the cancel recipe button")
//    public void userClicksOnTheCancelRecipeButton() {
//        System.out.println("I'm clicking on the cancel recipe button..");
//    }
//
//    @Then("user should still be logged in")
//    public void userShouldStillBeLoggedIn() {
//        System.out.println("I'm checking I'm still logged in..");
//    }
//
//    // Scenario 3 steps
//
//    @Then("user should see that the title field is required")
//    public void userShouldSeeThatTheTitleFieldIsRequired() {
//        System.out.println("I'm checking the title field error message is shown..");
//    }
//}

package steps;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import shared.TestContext;

public class CommonSteps {

    private final TestContext testContext;

    public CommonSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("user is on the Homepage")
    public void userIsOnTheHomepage() {
        System.out.println("I'm checking we're on the Homepage..");
        String currentUrl = testContext.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.baseUrl();
        Assertions.assertEquals(expectedUrl, currentUrl, "I don't seem to be on the Homepage..");
    }
}

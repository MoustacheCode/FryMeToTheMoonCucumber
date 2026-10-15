package shared;

import org.openqa.selenium.WebDriver;

import config.ConfigReader;
import config.WebDriverFactory;

public class TestContext {

    // Anything that any test will need access to
    private WebDriver driver;

    public void startDriver() {
        driver = WebDriverFactory.createWebDriver(ConfigReader.browser());
        driver.get(ConfigReader.baseUrl());
        System.out.println(driver.getCurrentUrl() + " current url");
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

package shared;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    private final TestContext context;

    public Hook(TestContext context) {
        this.context = context;
    }

    @Before
    public void setup() {
        System.out.println("Running before method");
        context.startDriver();
    }

    @After
    public void teardown() {
        context.quitDriver();
    }

}
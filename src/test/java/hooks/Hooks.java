package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp() {
        // Initialize driver before each scenario
        DriverFactory.getDriver();
    }

    @After
    public void tearDown() {
        // Quit driver after each scenario
        DriverFactory.quitDriver();
    }
}

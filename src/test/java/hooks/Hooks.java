package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        // Initialize driver before each scenario
        sauceDriver.DriverFactory.getDriver();
    }

    @After
    public void tearDown() {
        // Quit driver after each scenario
        sauceDriver.DriverFactory.quitDriver();
    }
}

package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import baseDriver.BaseDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks {

    @BeforeClass
    public void setUp() {
        // Initialize driver before each scenario
        BaseDriver.getDriver();
    }

    @AfterClass
    public void tearDown() {
        // Quit driver after each scenario
        BaseDriver.quitDriver();
    }
}

package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import baseDriver.BaseDriver;
import io.cucumber.java.Scenario;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ConfigReader;

public class Hooks {
    @BeforeClass
    public void setUp(Scenario scenario) {
        System.out.println("Starting scenario: " + scenario.getName());
        String browser = ConfigReader.getProperty("browser").split(",")[0];
        BaseDriver.getDriver(browser);
    }

    @AfterClass
    public void tearDown(Scenario scenario) {
        System.out.println("Scenario " + scenario.getName() + " finished with status: " + scenario.getStatus());
        BaseDriver.quitDriver();
    }



}

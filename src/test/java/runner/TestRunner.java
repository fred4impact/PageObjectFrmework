package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import baseDriver.BaseDriver;
import utils.ConfigReader;

@CucumberOptions(
        features = "/src/resources/features",
        glue = {"stepDefinitions", "hooks"},
        tags = "@EndToEnd",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    private String browser;

    @Factory(dataProvider = "browsers")
    public TestRunner(String browser) {
        this.browser = browser;
    }

    @DataProvider
    public static Object[][] browsers() {
        String[] browserArray = ConfigReader.getBrowsers();
        Object[][] data = new Object[browserArray.length][1];
        for (int i = 0; i < browserArray.length; i++) {
            data[i][0] = browserArray[i];
        }
        return data;
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        BaseDriver.getDriver(browser); // Initialize driver for the given browser
        return super.scenarios();
    }
}

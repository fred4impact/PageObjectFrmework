package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Login;
import utils.ConfigReader;
import utils.DriverFactory;

public class LoginSteps {

    private WebDriver driver = DriverFactory.getDriver();


    private Login login = new Login(driver);  // instantiat the login page

    @Given("the user is on the login page")
    public void navigateToLoginPage() {

        //driver.get("https://www.saucedemo.com/");

        // these get the url set in the config.properties
        String url = ConfigReader.getProperty("base.url");
        driver.get(url);


    }

    @When("the user enters valid credentials {string} and {string}")
    public void enterCredentials(String username, String password) {
        login.login(username, password);
    }

    @Then("the user is redirected to the products page")
    public void verifyLoginSuccess() {
        String title = driver.getTitle();
        assert title.contains("Swag Labs");
    }

}

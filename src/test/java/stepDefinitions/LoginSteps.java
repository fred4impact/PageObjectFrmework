package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class LoginSteps {

    private WebDriver driver = DriverFactory.getDriver();



    private LoginPage loginPage = new LoginPage(driver);  // instantiat the login page

    @Given("the user is on the login page")
    public void navigateToLoginPage() {

        //driver.get("https://www.saucedemo.com/");

        // these get the url set in the config.properties
        String url = ConfigReader.getProperty("base.url");
        driver.get(url);


    }

    @When("the user enters valid credentials {string} and {string}")
    public void enterCredentials(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the user is redirected to the products page")
    public void verifyLoginSuccess() {
        String title = driver.getTitle();
        assert title.contains("Swag Labs");
    }

public static class AccountCreation {
    @Given("user is on the easy website")
    public void userIsOnTheEasyWebsite() {
        // driver.get("www.easy.com")
        System.out.println("Load Easy website");
    }

    @When("a user enter a valid amail {string} and click the create button")
    public void aUserEnterAValidAmailAndClickTheCreateButton(String email) {
        /// WebElement email = driver.fintelement(By.id "email"
       // email.sendkyes(email);

      // webelement buton = driver.findelement(Button)
        //button.click()

        System.out.println("entered email and click submit button ");
    }

    @Then("User should see access members-only Dashboard displayed")
    public void userShouldSeeAccessMembersOnlyDashboardDisplayed() {
       // Assert.assertEquals("dasboard", "easydasbord");

        System.out.println("Assert easy dASHBOARD IS LOADED  HERE ");
    }

}}

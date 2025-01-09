package stepDefinitions;

import baseDriver.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.*;
import utils.ConfigReader;

public class Scenarioe2eSteps {

    // Declare the WebDriver instance to pass to page objects
    private static final String browser = ConfigReader.getProperty("browser").split(",")[0]; // Use the first browser
    private static final WebDriver driver = BaseDriver.getDriver(browser);

    // Page object instances
    LoginPage loginPage = new LoginPage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);
    CartPage cartPage = new CartPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);
    ConfirmationPage confirmationPage = new ConfirmationPage(driver);

    @Given("user is on the login page")
    public void user_Is_On_The_LoginPage() {
        String url = ConfigReader.getProperty("base.url");
        driver.get(url);
    }

    @When("user logs in with {string} and {string}")
    public void userLogsIn(String username, String password) {
        loginPage.login(username, password);
    }


    @Then("user should see the inventory page")
    public void userShouldSeeInventoryPage() {
        Assert.assertTrue(inventoryPage.isPageDisplayed());
    }

    @When("user adds item {string} to the cart")
    public void userAddsItemToCart(String itemName) {
        inventoryPage.addItemToCart(itemName);
    }

    @Then("user proceeds to checkout")
    public void userProceedsToCheckout() {
        cartPage.proceedToCheckout();
    }

    @And("user enters shipping details {string}, {string}, {string}")
    public void userEntersShippingDetails(String firstName, String lastName, String zipCode) {
        checkoutPage.enterShippingDetails(firstName, lastName, zipCode);
    }

    @Then("user should see the confirmation page")
    public void userShouldSeeConfirmationPage() {
        Assert.assertTrue(confirmationPage.isConfirmationDisplayed());
    }

    @When("user completes the purchase")
    public void userCompletesPurchase() {
        checkoutPage.completePurchase();
    }
}

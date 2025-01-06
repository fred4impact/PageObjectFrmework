package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.*;
import sauceBaseDriver.DriverFactory;
import utils.ConfigReader;

public class EndToEndSteps {


    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    InventoryPage inventoryPage = new InventoryPage(DriverFactory.getDriver());
    CartPage cartPage = new CartPage(DriverFactory.getDriver());
    CheckoutPage checkoutPage = new CheckoutPage(DriverFactory.getDriver());
    ConfirmationPage confirmationPage = new ConfirmationPage(DriverFactory.getDriver());

    @Given("^user is on the login page$")
    public void userIsOnTheLoginPage() {
        String url = ConfigReader.getProperty("url");
        DriverFactory.getDriver().get(url);
    }

    @When("^user logs in with \"(.*)\" and \"(.*)\"$")
    public void userLogsIn(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("^user should see the inventory page$")
    public void userShouldSeeInventoryPage() {
        Assert.assertTrue(inventoryPage.isPageDisplayed());
    }

    @When("^user adds item \"(.*)\" to the cart$")
    public void userAddsItemToCart(String itemName) {
        inventoryPage.addItemToCart(itemName);
    }

    @Then("^user proceeds to checkout$")
    public void userProceedsToCheckout() {
        cartPage.proceedToCheckout();
    }

    @And("^user enters shipping details \"(.*)\", \"(.*)\", \"(.*)\"$")
    public void userEntersShippingDetails(String firstName, String lastName, String zipCode) {
        checkoutPage.enterShippingDetails(firstName, lastName, zipCode);
    }

    @When("^user completes the purchase$")
    public void userCompletesPurchase() {
        checkoutPage.completePurchase();
    }

    @Then("^user should see the confirmation page$")
    public void userShouldSeeConfirmationPage() {
        Assert.assertTrue(confirmationPage.isConfirmationDisplayed());
    }
}


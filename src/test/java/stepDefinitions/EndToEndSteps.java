package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.*;
import baseDriver.BaseDriver;
import utils.ConfigReader;

public class EndToEndSteps {
    // create a variable of very pages and create a new object of it
    // page interactivity / seperation , encasulation / inheritanc

    LoginPage loginPage = new LoginPage(BaseDriver.getDriver());
    InventoryPage inventoryPage = new InventoryPage(BaseDriver.getDriver());
    CartPage cartPage = new CartPage(BaseDriver.getDriver());
    CheckoutPage checkoutPage = new CheckoutPage(BaseDriver.getDriver());
    ConfirmationPage confirmationPage = new ConfirmationPage(BaseDriver.getDriver());

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        String url = ConfigReader.getProperty("url");
        BaseDriver.getDriver().get(url);
    }

    @When("user logs in with (.*)\" and \"(.*)\"$")
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

    @Then("^user should see the confirmation page$")
    public void userShouldSeeConfirmationPage() {
        Assert.assertTrue(confirmationPage.isConfirmationDisplayed());
    }
    @When("^user completes the purchase$")
    public void userCompletesPurchase() {
        checkoutPage.completePurchase();
    }

}


package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AccountCreation {
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

    @Given("user is on the easy {string}")
    public void userIsOnTheEasy(String url ) {
        
        
    }

    @When("a user enter a valid {string} and click the create button")
    public void aUserEnterAValidAndClickTheCreateButton(String arg0, String arg1) {
        
    }

    @Then("User should see access {string} Dashboard displayed")
    public void userShouldSeeAccessDashboardDisplayed(String arg0) {
    }
}

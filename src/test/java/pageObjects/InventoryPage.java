package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage {

    // Static elements identified by @FindBy
    @FindBy(id = "inventory_container")
    private WebElement inventoryContainer;

    public InventoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Dynamic element for addItemButton
    private WebElement getAddItemButton(String itemName) {
        return driver.findElement(By.xpath("//div[text()='" + itemName + "']/following-sibling::button"));
    }

    public void addItemToCart(String itemName) {
        WebElement addItemButton = getAddItemButton(itemName);
        click(addItemButton);
    }

    public boolean isPageDisplayed() {
        return inventoryContainer.isDisplayed();
    }
}

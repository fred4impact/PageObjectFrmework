package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage extends BasePage {

    private By addItemButton(String itemName) {
        return By.xpath("//div[text()='" + itemName + "']/following-sibling::button");
    }

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void addItemToCart(String itemName) {
        click((WebElement) addItemButton(itemName));
    }

    public boolean isPageDisplayed() {
        return isElementDisplayed(By.id("inventory_container"));
    }

//    private boolean isElementDisplayed(By inventoryContainer) {
//        return
//    }
}

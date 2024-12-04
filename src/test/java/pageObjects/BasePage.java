package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    private static final Duration TIMEOUT = Duration.ofSeconds(10);

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    protected void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    protected void click(WebElement element) {
        waitForVisibility(element);
        element.click();
    }

    protected void type(WebElement element, String text) {
        waitForVisibility(element);
        element.sendKeys(text);
    }

}

//package utils;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class DriverManager {
//
//    public WebDriver initDriver() {
//
//        try {
//
//            //WebDriverManager.chromedriver().driverVersion("114.0.5735.90").setup();
//            WebDriverManager.chromedriver().setup();
//
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--start-maximized");
//            options.addArguments("--disable-extensions");
//            options.addArguments("--incognito");
//            options.addArguments("--disable-infobars");
//            // Add more options as needed
//            return new ChromeDriver(options);
//        } catch (Exception e) {
//            e.printStackTrace(); // Log any potential driver setup issues
//            throw new RuntimeException("Failed to initialize WebDriver", e);
//        }
//    }
//
//}
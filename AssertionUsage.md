// use these at run time to select browser
mvn test -Dbrowser=firefox



# Example Usage of Assertion utilities
  how to use it in your tests

## 1 Asserting String Equality
```
AssertionsUtil.assertEquals(actualTitle, "Expected Title", "Page title is not as expected");

```

##  Asserting Count of Products
```
int actualCount = driver.findElements(By.className("inventory_item")).size();
AssertionsUtil.assertEquals(actualCount, expectedCount, "Number of products displayed is incorrect");
```

##  Asserting Product Name in Cart
```
String productName = "Sauce Labs Backpack";
AssertionsUtil.assertStringContains(cartText, productName, "Product is not added to the cart");
```

##  Validating Non-Null Elements
```
WebElement element = driver.findElement(By.id("inventory_container"));
AssertionsUtil.assertNotNull(element, "Inventory container is not displayed");
```

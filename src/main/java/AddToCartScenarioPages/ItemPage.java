package AddToCartScenarioPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    private WebDriver driver;

    private By itemTitle = By.id("productTitle");
    private By addToCartButton = By.id("add-to-cart-button");

    public ItemPage(WebDriver driver){
        this.driver = driver;
    }

    public CartPage clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
        return new CartPage(driver);
    }

    public String getItemTitle(){
        return driver.findElement(itemTitle).getText();
    }
}

package AddToCartScenarioPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By successMessage = By.id("NATC_SMART_WAGON_CONF_MSG_SUCCESS");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSuccessMessage(){
        return driver.findElement(successMessage).getText();
    }
}

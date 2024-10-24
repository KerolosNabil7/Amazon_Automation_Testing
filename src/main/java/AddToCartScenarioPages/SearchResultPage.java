package AddToCartScenarioPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchResultPage {
    private WebDriver driver;

    private By firstItem = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]");

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToFirstItem(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(firstItem));
    }

    public ItemPage clickFirstItem(){
        driver.findElement(firstItem).click();
        return new ItemPage(driver);
    }

}

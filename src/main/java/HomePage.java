import AddToCartScenarioPages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void enterSearchKeyword(String keyword){
        driver.findElement(searchBox).sendKeys(keyword);
    }

    public SearchResultPage clickSearchButton(){
        driver.findElement(searchButton).click();
        return new SearchResultPage(driver);
    }
}

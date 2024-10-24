import AddToCartScenarioPages.CartPage;
import AddToCartScenarioPages.ItemPage;
import AddToCartScenarioPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class AddToCartTest extends BaseTests{

    private SearchResultPage amazonSearchResultPage;
    private ItemPage amazonItemPage;
    private CartPage amazonCartPage;
    private String itemName;

    @DataProvider(name = "SearchData")
    public Object[][] getSearchData(){
        return new Object[][]{
                {"car accessories"}
        };
    }

    @Test(dataProvider = "SearchData")
    public void searchItem(String searchKeyword){
        amazonHomePage.enterSearchKeyword(searchKeyword);
        amazonSearchResultPage = amazonHomePage.clickSearchButton();
        System.out.println("Search Item Done");
    }

    @Test(dependsOnMethods = "searchItem")
    public void addItemToCart(){
        amazonSearchResultPage.scrollToFirstItem();
        amazonItemPage = amazonSearchResultPage.clickFirstItem();

        itemName = amazonItemPage.getItemTitle();
        System.out.println(itemName);
        amazonCartPage = amazonItemPage.clickAddToCartButton();

        String successMessage = amazonCartPage.getSuccessMessage();
        System.out.println(successMessage);
        Assert.assertEquals(successMessage, "Added to cart", "Item not added correctly!!!");
    }
}

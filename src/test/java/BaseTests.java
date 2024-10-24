import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage amazonHomePage;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.get("https://www.amazon.eg/ref=nav_logo?language=en_AE");

        amazonHomePage = new HomePage(driver);
        System.out.println("Chrome SetUp & Amazon open");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
        System.out.println("Chrome close");
    }
}

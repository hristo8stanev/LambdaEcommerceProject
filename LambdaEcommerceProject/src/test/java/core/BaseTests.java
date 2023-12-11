package core;

import enums.BrowserTypes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import pages.searchpage.SearchPage;
import pages.shoppingcartpage.ShoppingCartPage;

import static core.Utils.getMappingByKey;
import static enums.BrowserTypes.*;
import static enums.BrowserTypes.setupBrowser;

public class BaseTests {

    private static WebDriver driver;
    public static SearchPage searchPage;
    public static ShoppingCartPage shoppingCardPage;


    @BeforeAll
    public static void setUp() {
        BrowserTypes browser = BrowserTypes.valueOf(getMappingByKey("browserType"));
        driver = BrowserTypes.setupBrowser(browser);
        driver.manage().window().maximize();

        searchPage = new SearchPage(driver);
        shoppingCardPage = new ShoppingCartPage(driver);


    }

    @AfterEach
    public void dispose() {
        driver.quit();
    }
}

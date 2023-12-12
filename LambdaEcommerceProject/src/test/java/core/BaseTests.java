package core;

import enums.BrowserTypes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import pages.checkoutpage.CheckoutPage;
import pages.homepage.HomePage;
import pages.loginpage.LoginPage;
import pages.registerpage.RegisterPage;
import pages.searchpage.SearchPage;
import pages.shoppingcartpage.ShoppingCartPage;

import static core.Utils.getMappingByKey;

public class BaseTests {

    private static WebDriver driver;
    public static SearchPage searchPage;
    public static ShoppingCartPage shoppingCardPage;
    public static HomePage homePage;
    public static RegisterPage registerPage;
    public static LoginPage loginPage;
    public static CheckoutPage checkoutPage;


    @BeforeAll
    public static void setUp() {
        BrowserTypes browser = BrowserTypes.valueOf(getMappingByKey("browserType"));
        driver = BrowserTypes.setupBrowser(browser);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        shoppingCardPage = new ShoppingCartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
    }

    @AfterEach
    public void dispose() {
        driver.quit();
    }
}

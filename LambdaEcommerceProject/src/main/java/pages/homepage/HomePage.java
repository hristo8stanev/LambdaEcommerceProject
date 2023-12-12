package pages.homepage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseMap;
import pages.BasePage;

import static base.Utils.getMappingByKey;

public class HomePage extends BasePage {
    private final Map homePageMap;
    private final BaseMap baseMap;

    public HomePage(WebDriver driver) {
        super(driver, getMappingByKey("homePage"));
        this.homePageMap = new Map(driver);
        this.baseMap = new BaseMap(driver);

    }

    @Override
    protected String Url() {
        return getMappingByKey("homePage");
    }

    public void searchItems(String product) {
        homePageMap.searchField().sendKeys(product);
        homePageMap.searchButton().click();

    }

    public void assertSearchResult(String product) {
        WebElement searchProduct = baseMap.waitAndFindElement(By.xpath("//div[contains(@class, 'entry-content')]/h1"));
        Assertions.assertEquals("Search - " + product, searchProduct.getText(),
                "Search result does not match the expected product: " + product);

    }
    public void assertErrorMessageIsShown() {
        WebElement errorMessage = baseMap.waitAndFindElement(By.xpath("//div[contains(@class, 'entry-content') and contains(@class, 'content-products')]"));
        Assertions.assertTrue(errorMessage.isDisplayed(),
                "Error message is not displayed. Search result matches the expected product.");
    }

    public void compareItem() {

    }
}

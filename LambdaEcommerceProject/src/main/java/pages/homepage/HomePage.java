package pages.homepage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.BaseMap;
import pages.BasePage;

import static core.Utils.getMappingByKey;

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
        homePageMap.searchField().clear();
        homePageMap.searchField().sendKeys(product);
        homePageMap.searchButton().click();
    }

    public void homeButton() {
        homePageMap.homeButton().click();

    }

    public void assertSearchResult(String product) {
        Assertions.assertEquals("Search - " + product, homePageMap.searchProductName().getText(),
                "Search result does not match the expected product: " + product);
    }

    public void assertErrorMessageIsShown() {
        Assertions.assertTrue(homePageMap.errorMessageNonExistingProduct().isDisplayed(),
                "Error message is not displayed. Search result matches the expected product.");
    }
}

package pages.searchpage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.BaseMap;
import pages.BasePage;

import static core.Utils.getMappingByKey;

public class SearchPage extends BasePage {
    private final Map searchPageMap;
    private final BaseMap baseMap;

    public SearchPage(WebDriver driver) {
        super(driver, getMappingByKey("searchPage"));
        this.searchPageMap = new Map(driver);
        this.baseMap = new BaseMap(driver);

    }

    @Override
    protected String Url() {
        return getMappingByKey("searchPage");
    }

    public void addProductToShoppingCart(String value) {
        searchPageMap.findProduct(value).click();
        searchPageMap.addToCart().click();
        enterShoppingCart();
    }

    public void clickFindProductButton(String value) {
        searchPageMap.findProduct(value).click();
    }


    public void removeProductFromTheShoppingCart() {
        enterShoppingCart();
        searchPageMap.removeButtonShoppingCart().click();
    }

    public void enterShoppingCart() {
        navigate();
        searchPageMap.cartButton().click();
        searchPageMap.editButton().click();
    }

    public void assertProductSuccessfullyAddedToCart() {
        String itemTitle = searchPageMap.successfullyAddedProductToCart().getAttribute("innerText");
        Assertions.assertNotEquals("0", itemTitle, "The Cart is empty.");
    }

    public void assertProductSuccessfullyRemoved() {
        String itemTitle = searchPageMap.successfullyRemovedProductToCart().getAttribute("innerText");
        Assertions.assertEquals("0", itemTitle, "The Cart is empty.");
    }


    public void assertProductRemoveFromTheCart(String value) {
        enterShoppingCart();
        String actualText = searchPageMap.removedProduct(value).getText();
        Assertions.assertTrue(actualText.contains(value),
                String.format("The product '%s' is still present in the Shopping Cart.", value));
    }
}
package pages.searchpage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void assertProductSuccessfullyAddedToCart(String value) {
        enterShoppingCart();
        WebElement productTitle = baseMap.waitAndFindElement(By.xpath("//td/a[@title]"));
        String itemTitle = productTitle.getAttribute("innerText");
        Assertions.assertEquals(itemTitle, value, "Failed to add item to the cart.");

    }

    public void assertProductRemoveFromTheCart(String value) {
        enterShoppingCart();
        WebElement title = baseMap.waitAndFindElement(By.xpath(String.format("//div[@id='content']//p[contains(text(), '%s')]", value)));
        String actualText = title.getText();
        Assertions.assertTrue(actualText.contains(value), "Expected text not found in the element.");
    }
}
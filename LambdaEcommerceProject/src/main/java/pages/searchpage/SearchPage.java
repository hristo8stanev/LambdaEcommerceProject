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
        WebElement productTitle = baseMap.waitAndFindElement(By.xpath("(//span[contains(@class, 'cart-item-total')])[1]"));
        String itemTitle = productTitle.getAttribute("innerText");
        Assertions.assertNotEquals("0", itemTitle, "The Cart is empty.");
    }
    public void assertProductSuccessfullyRemoved() {
        WebElement productTitle = baseMap.waitAndFindElement(By.xpath("(//span[contains(@class, 'cart-item-total')])[1]"));
        String itemTitle = productTitle.getAttribute("innerText");
        Assertions.assertEquals("0", itemTitle, "The Cart is empty.");
    }


    public void assertProductRemoveFromTheCart(String value) {
        enterShoppingCart();
        WebElement title = baseMap.waitAndFindElement(By.xpath(String.format("//div[@id='content']//p[contains(text(), '%s')]", value)));
        String actualText = title.getText();
        Assertions.assertTrue(actualText.contains(value), "Expected text not found in the element.");
    }
}
package pages.productpage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.BaseMap;
import pages.BasePage;

import static core.Utils.getMappingByKey;

public class ProductPage extends BasePage {
    private final Map productPageMap;
    private final BaseMap baseMap;

    public ProductPage(WebDriver driver) {
        super(driver, getMappingByKey("searchPage"));
        this.productPageMap = new Map(driver);
        this.baseMap = new BaseMap(driver);
    }

    @Override
    protected String Url() {
        return getMappingByKey("searchPage");
    }

    public void compareProduct() {
        productPageMap.compareButton().click();
    }

    public void comparePage() {
        productPageMap.comparePageButton().click();
    }

    public void quickView(String element) {
        mouseHoverByUsingWebElement(productPageMap.productByName(element));
        productPageMap.quickViewButton(element).click();
    }
    public void cartIcon(){
        productPageMap.cartButton().click();
    }



    public void increaseQuantityFromQuickView() {
        productPageMap.increaseTheQuantityButton().click();
    }
    public void addToCartButtonQuickView(){
        productPageMap.addToCartQuickViewButton().click();
    }

    public void changeSizeFromQuickView() {
        productPageMap.changeSizeButton().click();
    }

    public void assertBuyNowButtonIsDisplayedInQuickView() {
        productPageMap.buyNowButton().isDisplayed();
    }


    public void assertComparePageHeader(String value) {
        Assertions.assertEquals(value, productPageMap.headerElement().getText(),
                String.format("Expected header '%s' does not match the actual header.", value));
    }

    public void assertAddProductToCompare(String value) {
        Assertions.assertEquals(value, productPageMap.compareProductElement(value).getText(),
                String.format("Expected product name '%s' does not match the actual product name.", value));
    }


}

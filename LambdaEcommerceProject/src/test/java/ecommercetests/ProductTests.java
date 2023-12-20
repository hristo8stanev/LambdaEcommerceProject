package ecommercetests;

import core.BaseTests;
import org.junit.jupiter.api.Test;

import static core.Utils.getMappingByKey;

public class ProductTests extends BaseTests {

    String firstProduct = "Canon EOS 5D";
    String secondProduct = "Sony VAIO";
    String expectedResult = "Product Comparison";

    @Test
    public void compareExistingProductsTest() {
        homePage.navigate();
        homePage.searchItems(firstProduct);
        searchPage.clickFindProductButton(firstProduct);
        productPage.compareProduct();
        homePage.homeButton();
        homePage.searchItems(secondProduct);
        searchPage.clickFindProductButton(secondProduct);
        productPage.compareProduct();
        productPage.comparePage();
        homePage.assertUrlPage(getMappingByKey("comparePage"));
        productPage.assertAddProductToCompare(firstProduct);
        productPage.assertAddProductToCompare(secondProduct);
        productPage.assertComparePageHeader(expectedResult);

    }

    @Test
    public void navigateToQuickViewOfTheProductTest() {
        homePage.navigate();
        homePage.searchItems(firstProduct);
        productPage.quickView(firstProduct);
        productPage.assertBuyNowButtonIsDisplayedInQuickView();
    }

    @Test
    public void changeTheQuantityFromQuickViewTest() {
        homePage.navigate();
        homePage.searchItems(secondProduct);
        productPage.quickView(secondProduct);
        productPage.increaseQuantityFromQuickView();
        productPage.addToCartButtonQuickView();
        searchPage.enterShoppingCart();
        homePage.assertUrlPage(getMappingByKey("shoppingCartPage"));
        searchPage.assertProductSuccessfullyAddedToCart();
    }
}

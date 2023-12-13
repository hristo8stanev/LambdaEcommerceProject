package ecommercetests;

import core.BaseTests;
import org.junit.jupiter.api.Test;

public class ProductTests extends BaseTests {

    String firstProduct = "HTC Touch HD";
    String secondProduct = "Sony VAIO";
    String expectedResult ="Product Comparison";
    String comparePageUrl = "https://ecommerce-playground.lambdatest.io/index.php?route=product/compare";

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
        productPage.comparePageButton();
        homePage.assertUrlPage(comparePageUrl);
        productPage.assertAddProductToCompare(firstProduct);
        productPage.assertAddProductToCompare(secondProduct);
        productPage.assertComparePageHeader(expectedResult);

    }
}

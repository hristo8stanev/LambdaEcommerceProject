package ecommercetests;

import core.BaseTests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SearchTests extends BaseTests {
    String existingProduct = "Sony VAIO";
    String nonExistingProduct = "bug123";

    @Test
    @Tag("TestCase-23")
    public void searchForExistingProductsTests() {
        homePage.navigate();
        homePage.searchItems(existingProduct);
        homePage.assertSearchResult(existingProduct);
    }

    @Test
    @Tag("TestCase-25")
    public void searchForNonExistingProductsTests() {
        homePage.navigate();
        homePage.searchItems(nonExistingProduct);
        homePage.assertSearchResult(nonExistingProduct);
        homePage.assertErrorMessageIsShown();
    }
}

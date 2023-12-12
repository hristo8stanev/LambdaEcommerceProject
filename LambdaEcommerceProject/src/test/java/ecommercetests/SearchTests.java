package ecommercetests;

import core.BaseTests;
import org.junit.jupiter.api.Test;

public class SearchTests extends BaseTests {
    String existingProduct = "Samsung";
    String nonExistingProduct = "bug123";

    @Test
    public void searchForExistingProductsTests() {
        homePage.navigate();
        homePage.searchItems(existingProduct);
        homePage.assertSearchResult(existingProduct);
        // +  ONE MORE ASSERT!
    }

    @Test
    public void searchForNonExistingProductsTests() {
        homePage.navigate();
        homePage.searchItems(nonExistingProduct);
        homePage.assertSearchResult(nonExistingProduct);
        homePage.assertErrorMessageIsShown();
    }
}

package ecommercetests;

import core.BaseTests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static core.Utils.getMappingByKey;

public class ShoppingCartTests extends BaseTests {

    String product = "Sony VAIO";
    String expectedMessage = "Your shopping cart is empty!";

    @Test
    @Tag("TestCase-53")
    public void addProductToShoppingCartTest() {
        homePage.navigate();
        homePage.searchItems(product);
        searchPage.addProductToShoppingCart(product);
        homePage.assertUrlPage(getMappingByKey("shoppingCartPage"));
        searchPage.assertProductSuccessfullyAddedToCart();
    }


    @Test
    @Tag("TestCase-58")
    public void removeProductFromShoppingCartTest() {
        homePage.navigate();
        homePage.searchItems(product);
        searchPage.addProductToShoppingCart(product);
        searchPage.removeProductFromTheShoppingCart();
        searchPage.assertProductRemoveFromTheCart(expectedMessage);
        homePage.assertUrlPage(getMappingByKey("shoppingCartPage"));
        searchPage.assertProductSuccessfullyRemoved();
    }
}

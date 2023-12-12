package ecommercetests;

import core.BaseTests;
import org.junit.jupiter.api.Test;

public class ShoppingCartTests extends BaseTests {

    String product = "Sony VAIO";
    String expectedMessage = "Your shopping cart is empty!";

    @Test
    public void addProductToShoppingCartTest() {
        homePage.navigate();
        homePage.searchItems(product);
        searchPage.addProductToShoppingCart(product);
        searchPage.assertProductSuccessfullyAddedToCart(product);
        //ONE MORE ASSERT
    }

    @Test
    public void removeProductFromShoppingCartTest() {
        homePage.navigate();
        homePage.searchItems(product);
        searchPage.addProductToShoppingCart(product);
        searchPage.removeProductFromTheShoppingCart();
        searchPage.assertProductRemoveFromTheCart(expectedMessage);
        //ONE MORE ASSERT


    }
}

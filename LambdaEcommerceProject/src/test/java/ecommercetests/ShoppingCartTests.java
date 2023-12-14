package ecommercetests;

import core.BaseTests;
import org.junit.jupiter.api.Test;

public class ShoppingCartTests extends BaseTests {

    String product = "Sony VAIO";
    String expectedMessage = "Your shopping cart is empty!";
    String expectedUrl = "https://ecommerce-playground.lambdatest.io/index.php?route=checkout/cart";

    @Test
    public void addProductToShoppingCartTest() {
        homePage.navigate();
        homePage.searchItems(product);
        searchPage.addProductToShoppingCart(product);
        homePage.assertUrlPage(expectedUrl);
        searchPage.assertProductSuccessfullyAddedToCart();
        //ONE MORE ASSERT
    }


    @Test
    public void removeProductFromShoppingCartTest() {
        homePage.navigate();
        homePage.searchItems(product);
        searchPage.addProductToShoppingCart(product);
        searchPage.removeProductFromTheShoppingCart();
        searchPage.assertProductRemoveFromTheCart(expectedMessage);
        homePage.assertUrlPage(expectedUrl);
        searchPage.assertProductSuccessfullyRemoved();
        //ONE MORE ASSERT


    }
}

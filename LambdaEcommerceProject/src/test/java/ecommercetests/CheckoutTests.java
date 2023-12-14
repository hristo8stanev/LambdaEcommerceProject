package ecommercetests;

import core.BaseTests;
import core.Factory;
import org.junit.jupiter.api.Test;

public class CheckoutTests extends BaseTests {
    String existingProduct = "Sony VAIO";
    String emailAddress = "alabala@gmail.com";
    String password = "tester";
    String expectedMessage = "Your shopping cart is empty!";
    String urlCheckout="https://ecommerce-playground.lambdatest.io/index.php?route=checkout/checkout";
    String urlConfirmOrder="https://ecommerce-playground.lambdatest.io/index.php?route=extension/maza/checkout/confirm";


    @Test
    public void guestUserCheckoutTest() {
        homePage.navigate();
        homePage.searchItems(existingProduct);
        searchPage.addProductToShoppingCart(existingProduct);
        checkoutPage.navigate();
        checkoutPage.checkout();
        checkoutPage.assertUrlPage(urlCheckout);
        checkoutPage.assertConfirmOrderButtonIsVisible();
        checkoutPage.confirmOrder();
        checkoutPage.assertUrlPage(urlConfirmOrder);
        searchPage.assertProductRemoveFromTheCart(expectedMessage);
    }

    @Test
    public void authenticatedUserCheckoutTest() {
        var loginInfo = Factory.loginUser(emailAddress, password);
        loginPage.navigate();
        loginPage.login(loginInfo);
        checkoutPage.navigate();
        homePage.searchItems(existingProduct);
        searchPage.addProductToShoppingCart(existingProduct);
        checkoutPage.navigate();
        checkoutPage.checkOutAuthenticatedUser();
        checkoutPage.assertUrlPage(urlCheckout);
        checkoutPage.assertConfirmOrderButtonIsVisible();
        checkoutPage.confirmOrder();
        checkoutPage.assertUrlPage(urlConfirmOrder);
        searchPage.assertProductRemoveFromTheCart(expectedMessage);
    }
}

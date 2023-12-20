package ecommercetests;

import core.BaseTests;
import core.Factory;
import org.junit.jupiter.api.Test;

import static core.Utils.getMappingByKey;

public class CheckoutTests extends BaseTests {
    String existingProduct = "Sony VAIO";
    String emailAddress = "alabala@gmail.com";
    String password = "tester";
    String expectedMessage = "Your shopping cart is empty!";

    @Test
    public void guestUserCheckoutTest() {
        loginPage.navigate();
        homePage.searchItems(existingProduct);
        searchPage.addProductToShoppingCart(existingProduct);
        checkoutPage.navigate();
        checkoutPage.checkout();
        checkoutPage.assertUrlPage(getMappingByKey("checkoutPage"));
        checkoutPage.assertConfirmOrderButtonIsVisible();
        checkoutPage.confirmOrder();
        checkoutPage.assertUrlPage(getMappingByKey("confirmOrderPage"));
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
        checkoutPage.assertUrlPage(getMappingByKey("checkoutPage"));
        checkoutPage.assertConfirmOrderButtonIsVisible();
        checkoutPage.confirmOrder();
        checkoutPage.assertUrlPage(getMappingByKey("confirmOrderPage"));
        searchPage.assertProductRemoveFromTheCart(expectedMessage);
        loginPage.myAccountMethod();
        loginPage.logoutUser();
    }

    @Test
    public void guestUserCompletePurchaseFromBuyNowButtonTest() {
        loginPage.navigate();
        homePage.searchItems(existingProduct);
        searchPage.clickFindProductButton(existingProduct);
        productPage.buyBowButton();
        checkoutPage.assertContinueButtonIsDisplayed();
        checkoutPage.checkout();
        checkoutPage.assertUrlPage(getMappingByKey("checkoutPage"));
        checkoutPage.assertConfirmOrderButtonIsVisible();
        checkoutPage.confirmOrder();
        checkoutPage.assertUrlPage(getMappingByKey("confirmOrderPage"));
        searchPage.assertProductRemoveFromTheCart(expectedMessage);
    }
}

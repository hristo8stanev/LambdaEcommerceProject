package ecommercetests;

import core.BaseTests;
import core.Factory;
import org.junit.jupiter.api.Test;


public class RegisterTests extends BaseTests {

    String expectedTitle = "Your Account Has Been Created!";
    public static final String SUCCESS_REGISTER = "https://ecommerce-playground.lambdatest.io/index.php?route=account/success";

    @Test
    public void registerWithValidCredentialsTest() {
        var registrationDetails = Factory.userDetails();
        registerPage.navigate();
        registerPage.register(registrationDetails);
        registerPage.assertRegisterTitle(expectedTitle);
        registerPage.assertUrlPage(SUCCESS_REGISTER);
    }
}




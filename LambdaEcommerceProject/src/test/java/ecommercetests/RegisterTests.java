package ecommercetests;

import core.BaseTests;
import core.UserActions;
import org.junit.jupiter.api.Test;


public class RegisterTests extends BaseTests {

    public static final String SUCCESS_REGISTER = "https://ecommerce-playground.lambdatest.io/index.php?route=account/success";

    @Test
    public void registerWithValidCredentialsTest() {
        var registrationDetails = UserActions.userDetails();
        registerPage.navigate();
        registerPage.register(registrationDetails);
        registerPage.assertRegisterTitle();
        registerPage.assertUrlPage(SUCCESS_REGISTER);
    }
}




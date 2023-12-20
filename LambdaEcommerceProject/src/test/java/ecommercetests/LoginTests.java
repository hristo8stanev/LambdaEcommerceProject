package ecommercetests;

import core.BaseTests;
import core.Factory;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTests {

    public static final String SUCCESSFUL_LOGIN = "https://ecommerce-playground.lambdatest.io/index.php?route=account/account";
    String emailAddress = "alabala@gmail.com";
    String password = "tester";
    String invalidEmail = "test123";
    String invalidPassword= "123123";

    //ADD NAVIGATE IN BEFORE METHOD

    @Test
    public void loginWithValidCredentialsTest() {
        var loginInfo = Factory.loginUser(emailAddress, password);
        loginPage.navigate();
        loginPage.login(loginInfo);
        loginPage.assertAuthenticatedUser();
        loginPage.assertUrlPage(SUCCESSFUL_LOGIN);
        loginPage.logoutUser();

    }
    @Test
    public void loginWithEmptyFieldsTest() {
        var loginInfo = Factory.loginUser("", "");
        loginPage.navigate();
        loginPage.login(loginInfo);
        loginPage.assertErrorMessageIsShown();
    }

    @Test
    public void loginWithInvalidCredentialsTest(){
        var loginInfo = Factory.loginUser(invalidEmail,invalidPassword);
        loginPage.navigate();
        loginPage.login(loginInfo);
        loginPage.assertErrorMessageIsShown();
    }
}

package ecommercetests;

import core.BaseTests;
import core.Factory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static core.Utils.getMappingByKey;

public class LoginTests extends BaseTests {

    String emailAddress = "alabala@gmail.com";
    String password = "tester";
    String invalidEmail = "test123";
    String invalidPassword = "123123";


    @Test
    @Tag("TestCase-7")
    public void loginWithValidCredentialsTest() {
        var loginInfo = Factory.loginUser(emailAddress, password);
        loginPage.navigate();
        loginPage.login(loginInfo);
        loginPage.assertAuthenticatedUser();
        loginPage.assertUrlPage(getMappingByKey("successfullyLoginPage"));
        loginPage.logoutUser();

    }

    @Test
    @Tag("TestCase-10")
    public void loginWithEmptyFieldsTest() {
        var loginInfo = Factory.loginUser("", "");
        loginPage.navigate();
        loginPage.login(loginInfo);
        loginPage.assertErrorMessageIsShown();
    }

    @Test
    @Tag("TestCase-9")
    public void loginWithInvalidCredentialsTest() {
        var loginInfo = Factory.loginUser(invalidEmail, invalidPassword);
        loginPage.navigate();
        loginPage.login(loginInfo);
        loginPage.assertErrorMessageIsShown();
    }
}

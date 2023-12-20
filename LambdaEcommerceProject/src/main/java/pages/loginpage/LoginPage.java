package pages.loginpage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.BaseMap;
import pages.BasePage;

import static core.Utils.getMappingByKey;

public class LoginPage extends BasePage {
    private final Map loginPageMap;
    private final BaseMap baseMap;

    public LoginPage(WebDriver driver) {
        super(driver, getMappingByKey("loginPage"));
        this.loginPageMap = new Map(driver);
        this.baseMap = new BaseMap(driver);
    }

    @Override
    protected String Url() {
        return getMappingByKey("loginPage");
    }

    public void login(LoginInformation value) {
        loginPageMap.emailAddressField().sendKeys(value.getEmail());
        loginPageMap.passwordField().sendKeys(value.getPassword());
        loginPageMap.loginButton().click();
    }

    public void myAccountMethod() {
        loginPageMap.myAccountButton().click();
    }


    public void logoutUser() {
        loginPageMap.logoutButton().click();
    }

    public void assertAuthenticatedUser() {
        Assertions.assertTrue(loginPageMap.logoutButton().isDisplayed(),
                "Logout button is not displayed. User may not be authenticated.");
    }

    public void assertErrorMessageIsShown() {
        Assertions.assertTrue(loginPageMap.errorMessageInvalidCredentials().isDisplayed(),
                "Error message is not displayed. User logged in with invalid credentials.");
    }
}
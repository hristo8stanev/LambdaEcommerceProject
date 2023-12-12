package pages.loginpage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseMap;
import pages.BasePage;

import static base.Utils.getMappingByKey;

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

    public void logoutUser() {
        loginPageMap.logoutButton().click();
    }

    public void assertAuthenticatedUser() {
        WebElement logoutElement = baseMap.waitAndFindElement(By.xpath("(//a[contains(@href, 'logout')])[2]"));
        Assertions.assertTrue(logoutElement.isDisplayed(),
                "Logout button is not displayed. User may not be authenticated.");
    }

    public void assertErrorMessageIsShown() {
        WebElement errorMessage = baseMap.waitAndFindElement(By.xpath("//div[contains(@class, 'alert-danger')]"));
        Assertions.assertTrue(errorMessage.isDisplayed(),
                "Error message is not displayed. User logged in with invalid credentials.");
    }
}
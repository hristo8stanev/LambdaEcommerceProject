package pages.registerpage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseMap;
import pages.BasePage;

import static core.Utils.getMappingByKey;

public class RegisterPage extends BasePage {
    private final Map registerPageMap;
    private final BaseMap baseMap;
    public RegisterPage(WebDriver driver) {
        super(driver, getMappingByKey("registerPage"));
        this.registerPageMap = new Map(driver);
        this.baseMap= new BaseMap(driver);
    }

    @Override
    protected String Url() {
        return getMappingByKey("registerPage");
    }

    public void register(PersonalInformation value) {
        registerPageMap.firstNameField().sendKeys(value.getFirstName());
        registerPageMap.lastNameField().sendKeys(value.getLastName());
        registerPageMap.emailField().sendKeys(value.getEmail());
        registerPageMap.telephoneField().sendKeys(String.valueOf(value.getTelephone()));
        registerPageMap.passwordField().sendKeys(value.getPassword());
        registerPageMap.confirmPasswordField().sendKeys(value.getConfirmPassword());
        registerPageMap.agreeButton().click();
        registerPageMap.continueButton().click();
    }

    public void assertRegisterTitle(String value) {
        WebElement titleElement = baseMap.waitAndFindElement(By.xpath(String.format(
                "//div[@id='content']//h1[contains(text(), '%s')]", value)));
        String actualText = titleElement.getText();
        Assertions.assertEquals(value, actualText,
                "Expected title does not match the actual title.");
    }
}

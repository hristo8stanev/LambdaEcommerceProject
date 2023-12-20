package pages.checkoutpage;

import core.Factory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.BaseMap;
import pages.BasePage;
import pages.registerpage.PersonalInformation;

import static core.Utils.getMappingByKey;

public class CheckoutPage extends BasePage {
    private final Map checkoutPageMap;
    private final BaseMap baseMap;

    public CheckoutPage(WebDriver driver) {
        super(driver, getMappingByKey("checkoutPage"));
        this.checkoutPageMap = new Map(driver);
        this.baseMap = new BaseMap(driver);
    }

    @Override
    protected String Url() {
        return getMappingByKey("checkoutPage");
    }

    public void addPersonalDetails(PersonalInformation details) {
        checkoutPageMap.firstNameField().sendKeys(details.getFirstName());
        checkoutPageMap.lastNameField().sendKeys(details.getLastName());
        checkoutPageMap.emailAddressField().sendKeys(details.getEmail());
        checkoutPageMap.telephoneField().sendKeys(String.valueOf(details.getTelephone()));
        checkoutPageMap.passwordField().sendKeys(details.getPassword());
        checkoutPageMap.passwordConfirmField().sendKeys(details.getConfirmPassword());
    }

    public void addBillingDetails(BillingInformation billingDetails) {
        checkoutPageMap.addressField().sendKeys(billingDetails.getAddress());
        checkoutPageMap.cityField().sendKeys(billingDetails.getCity());
        checkoutPageMap.postCodeField().sendKeys(billingDetails.getPostCode());
    }

    public void agreeToTermsAndConditions() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", checkoutPageMap.termsAndConditionsButton());
        checkoutPageMap.termsAndConditionsButton().click();
    }

    public void checkout() {
        var personalDetails = Factory.userDetails();
        var billingDetails = Factory.billingInformation();
        addPersonalDetails(personalDetails);
        addBillingDetails(billingDetails);
        agreeToShippingMethod();
        agreeToTermsAndConditions();
        if (checkoutPageMap.privacyPolicy().isDisplayed()) {
            checkoutPageMap.privacyPolicy().click();
        }
        checkoutPageMap.continueButton().click();
    }

    public void checkOutAuthenticatedUser() {
        checkoutPageMap.billingAddressExisting().click();
        checkoutPageMap.paymentButton().click();
        agreeToShippingMethod();
        agreeToTermsAndConditions();
        checkoutPageMap.continueButton().click();
    }

    public void confirmOrder() {
        checkoutPageMap.confirmButton().click();
    }

    public void agreeToShippingMethod() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", checkoutPageMap.shippingButton());
        checkoutPageMap.shippingButton().click();
    }

    public void assertConfirmOrderButtonIsVisible() {
        checkoutPageMap.confirmButton();
    }
    public void assertContinueButtonIsDisplayed(){
        checkoutPageMap.continueButton().isDisplayed();
    }

    public void assertConfirmOrder(String confirmOrder) {
        String value = checkoutPageMap.confirmOrderHeader().getAttribute("innerText");
        Assertions.assertEquals(confirmOrder, value, "Header title not as expected. Expected: " + confirmOrder + ", received: " + value);
    }
}
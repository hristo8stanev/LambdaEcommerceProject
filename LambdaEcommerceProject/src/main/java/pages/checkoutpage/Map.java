package pages.checkoutpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseMap;

public class Map extends BaseMap {
    public Map(WebDriver driver) {
        super(driver);
    }

    public WebElement firstNameField() {
        return waitAndFindElement(By.id("input-payment-firstname"));
    }

    public WebElement lastNameField() {
        return waitAndFindElement(By.id("input-payment-lastname"));
    }

    public WebElement emailAddressField() {
        return waitAndFindElement(By.id("input-payment-email"));
    }

    public WebElement telephoneField() {
        return waitAndFindElement(By.id("input-payment-telephone"));
    }

    public WebElement passwordField() {
        return waitAndFindElement(By.id("input-payment-password"));
    }

    public WebElement passwordConfirmField() {
        return waitAndFindElement(By.id("input-payment-confirm"));
    }

    public WebElement addressField() {
        return waitAndFindElement(By.id("input-payment-address-1"));
    }

    public WebElement cityField() {
        return waitAndFindElement(By.id("input-payment-city"));
    }

    public WebElement postCodeField() {
        return waitAndFindElement(By.id("input-payment-postcode"));
    }
}

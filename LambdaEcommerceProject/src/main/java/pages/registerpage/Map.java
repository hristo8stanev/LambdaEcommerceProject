package pages.registerpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseMap;

public class Map extends BaseMap {
    public Map(WebDriver driver) {
        super(driver);
    }

    public WebElement firstNameField() {
        return waitAndFindElement(By.id("input-firstname"));
    }

    public WebElement lastNameField() {
        return waitAndFindElement(By.id("input-lastname"));
    }

    public WebElement emailField() {
        return waitAndFindElement(By.id("input-email"));
    }

    public WebElement telephoneField() {
        return waitAndFindElement(By.id("input-telephone"));
    }

    public WebElement passwordField() {
        return waitAndFindElement(By.id("input-password"));
    }

    public WebElement confirmPasswordField() {
        return waitAndFindElement(By.id("input-confirm"));
    }
    public WebElement agreeButton() {
        return waitAndFindElement(By.xpath("//label[@for='input-agree']"));
    }

    public WebElement continueButton() {
        return waitAndFindElement(By.xpath("//input[@type='submit']"));
    }
}

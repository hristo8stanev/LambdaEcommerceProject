package pages.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseMap;

public class Map extends BaseMap {

    public Map(WebDriver driver) {
        super(driver);
    }

    public WebElement emailAddressField() {
        return waitAndFindElement(By.id("input-email"));
    }

    public WebElement passwordField() {
        return waitAndFindElement(By.id("input-password"));
    }

    public WebElement loginButton() {
        return waitAndFindElement(By.xpath("//input[@type='submit']"));
    }

    public WebElement logoutButton() {
        return waitAndFindElement(By.xpath("(//a[contains(@href, 'logout')])[2]"));
    }
}

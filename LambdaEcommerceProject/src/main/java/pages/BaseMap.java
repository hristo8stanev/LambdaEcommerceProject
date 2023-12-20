package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseMap {
    private static final int WAIT_FOR_ELEMENT_TIMEOUT = 30;
    private final WebDriverWait webDriverWait;

    public BaseMap(WebDriver driver) {
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_FOR_ELEMENT_TIMEOUT));
    }

    public WebElement waitAndFindElement(By locator) {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public WebElement waitElementToBeClickable(By locator) {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}

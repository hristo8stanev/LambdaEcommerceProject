package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    public static final int TIME_FOR_SECOND_TIMEOUT = 10;
    public String url;
    protected WebDriver driver;
    private static WebDriverWait wait;

    public BasePage(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_FOR_SECOND_TIMEOUT));
    }

    protected abstract String Url();

    public void navigate() {
    driver.get(url);
    }
    public void mouseHoverByUsingWebElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void assertUrlPage(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl, "Expected page was not navigated.");
    }
}

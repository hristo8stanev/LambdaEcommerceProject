package pages;

import org.openqa.selenium.WebDriver;
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
        this.driver.get(url);
    }
}

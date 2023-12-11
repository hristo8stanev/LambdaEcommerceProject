package enums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public enum BrowserTypes {
    CHROME,
    FIREFOX,
    CHROME_HEADLESS,
    FIREFOX_HEADLESS,
    EDGE;

    public static WebDriver setupBrowser(BrowserTypes browserType) {
        switch (browserType) {
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
            case CHROME_HEADLESS:
                ChromeOptions optionChrome = new ChromeOptions();
                optionChrome.addArguments("--headless=new");
                return new ChromeDriver(optionChrome);
            case FIREFOX_HEADLESS:
                FirefoxOptions optionFirefox = new FirefoxOptions();
                optionFirefox.addArguments("--headless");
                return new FirefoxDriver(optionFirefox);
            case EDGE:
                return new EdgeDriver();
        }
        return null;
    }
}

package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseMap;

public class Map extends BaseMap {
    public Map(WebDriver driver) {
        super(driver);
    }

    public WebElement homeButton() {
        return waitAndFindElement(By.xpath("//a[contains(@href, 'common/home')]"));
    }

    public WebElement searchField() {
        return waitAndFindElement(By.name("search"));
    }

    public WebElement searchButton() {
        return waitAndFindElement(By.xpath(
                "//button[contains(@class, 'type-text') and text()='Search']"));
    }

    public WebElement searchProductName() {
        return waitAndFindElement(By.xpath("//div[contains(@class, 'entry-content')]/h1"));
    }

    public WebElement errorMessageNonExistingProduct() {
        return waitAndFindElement(By.xpath("//div[contains(@class, 'entry-content') and contains(@class, 'content-products')]"));
    }
}

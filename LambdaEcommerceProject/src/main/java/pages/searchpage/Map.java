package pages.searchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseMap;

public class Map extends BaseMap {
    public Map(WebDriver driver) {
        super(driver);
    }

    public WebElement findProduct(String value) {
        return waitAndFindElement(By.xpath(String.format("//h4/a[text()='%s']", value)));
    }

    public WebElement addToCart() {
        return waitAndFindElement(By.xpath("(//button[@title='Add to Cart'])[2]"));
    }

    public WebElement cartButton() {
        return waitAndFindElement(By.xpath("(//div[@class='cart-icon'])[1]"));
    }

    public WebElement productTitle() {
        return waitAndFindElement(By.xpath("//td/a[@title]"));
    }

    public WebElement editButton() {
        return waitAndFindElement(By.xpath("//a[contains(@href, 'checkout/cart')]"));
    }

    public WebElement removeButtonShoppingCart() {
        return waitAndFindElement(By.xpath("//button[contains(@onclick, 'cart.remove')]"));
    }

    // public WebElement quickViewButton() {
    //     return waitElementToBeClickable(By.xpath("//button[@title= 'Quick view']"));
    // }
    public WebElement quickViewButton() {
        return waitAndFindElement(By.xpath("//i[text()='fas fa-eye']"));
    }

    public WebElement compareButton() {
        return waitAndFindElement(By.partialLinkText("Product Compare"));
    }



}

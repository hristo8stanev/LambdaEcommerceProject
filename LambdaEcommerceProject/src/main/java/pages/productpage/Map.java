package pages.productpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseMap;

public class Map extends BaseMap {
    public Map(WebDriver driver) {
        super(driver);
    }

    public WebElement compareButton() {
        return waitAndFindElement(By.xpath("//*[@title='Add to Cart']/../../../../div/button[@title='Compare this Product']"));
    }

    public WebElement comparePageButton() {
        return waitAndFindElement(By.partialLinkText("Product Compare"));
    }


    public WebElement quickViewButton(String element) {
        return waitAndFindElement(By.xpath(String.format(
                "(//h4[@class='title']/a[text()='%s']/ancestor::div[@class='product-thumb']" +
                        "//button[contains(@class, 'quick-view') and contains(@onclick, 'mz_quick_view.show')])[1]", element)));
    }

    public WebElement productByName(String name) {
        return waitAndFindElement(By.xpath(String.format(
                "//div[contains(@class, 'product-grid') and .//a[contains(@class, 'text-ellipsis-2') " +
                        "and contains(text(), '%s')]]", name)));
    }
    public WebElement buyNowButton(){
        return waitAndFindElement(By.xpath("//button[contains(@title, 'Buy now')]"));
    }
    public WebElement addToCartQuickViewButton(){
        return waitAndFindElement(By.xpath("//button[contains(@class, 'button-cart')]"));
    }
    public WebElement cartButton(){
        return waitAndFindElement(By.xpath("(//div[@class='cart-icon'])[1]"));
    }


    public WebElement increaseTheQuantityButton(){
        return waitAndFindElement(By.xpath("//div[@class='input-group-append']"));
    }

    public WebElement headerElement() {
        return waitAndFindElement(By.xpath("//h1[@class='h4']"));
    }

    public WebElement compareProductElement(String value) {
        return waitAndFindElement(By.xpath(String.format("//strong[contains(text(),'%s')]", value)));
    }

    public WebElement changeSizeButton() {
        return waitAndFindElement(By.xpath("//select[contains(@name, 'option')]"));
    }
}

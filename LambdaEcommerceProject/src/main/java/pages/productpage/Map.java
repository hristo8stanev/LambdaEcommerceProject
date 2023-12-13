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

    public WebElement headerElement(){
        return waitAndFindElement(By.xpath("//h1[@class='h4']"));
    }
    public WebElement compareProductElement(String value){
        return waitAndFindElement(By.xpath(String.format("//strong[contains(text(),'%s')]",value)));
    }

}

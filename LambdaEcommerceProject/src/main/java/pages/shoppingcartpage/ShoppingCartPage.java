package pages.shoppingcartpage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static core.Utils.getMappingByKey;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver) {
        super(driver, getMappingByKey("shoppingCartPage"));
    }

    @Override
    protected String Url() {
        return null;
    }

    //ACTIONS
}

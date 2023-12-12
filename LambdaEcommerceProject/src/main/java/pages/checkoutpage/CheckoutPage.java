package pages.checkoutpage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static base.Utils.getMappingByKey;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver ) {
        super(driver, getMappingByKey("checkoutPage"));
    }

    @Override
    protected String Url() {
        return getMappingByKey("checkoutPage");
    }
}

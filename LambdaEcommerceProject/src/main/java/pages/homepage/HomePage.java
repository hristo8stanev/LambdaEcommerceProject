package pages.homepage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static core.Utils.getMappingByKey;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver, getMappingByKey("homePage"));
    }

    @Override
    protected String Url() {
        return null;
    }
}

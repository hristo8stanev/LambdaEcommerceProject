package pages.searchpage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static core.Utils.getMappingByKey;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver, getMappingByKey("homePage"));
    }

    @Override
    protected String Url() {
        return null;
    }
}

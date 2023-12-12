package pages.searchpage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static base.Utils.getMappingByKey;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver, getMappingByKey("searchPage"));
    }

    @Override
    protected String Url() {
        return getMappingByKey("searchPage");
    }
}

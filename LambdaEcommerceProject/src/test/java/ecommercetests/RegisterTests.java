package ecommercetests;

import core.BaseTests;
import core.Factory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static core.Utils.getMappingByKey;


public class RegisterTests extends BaseTests {

    String expectedTitle = "Your Account Has Been Created!";

    @Test
    @Tag("TestCase-1")
    public void registerWithValidCredentialsTest() {
        var registrationDetails = Factory.userDetails();
        registerPage.navigate();
        registerPage.register(registrationDetails);
        registerPage.assertRegisterTitle(expectedTitle);
        registerPage.assertUrlPage(getMappingByKey("successfullyRegisterPage"));
    }
}
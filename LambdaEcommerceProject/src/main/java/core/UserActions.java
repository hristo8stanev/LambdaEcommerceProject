package core;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import pages.checkoutpage.BillingInformation;
import pages.loginpage.LoginInformation;
import pages.registerpage.PersonalInformation;

public class UserActions {

    private static final Faker faker = new Faker();


    public static PersonalInformation userDetails() {
        var registerUser = new PersonalInformation();
        registerUser.setFirstName(faker.name().firstName());
        registerUser.setLastName(faker.name().lastName());
        registerUser.setEmail(faker.name().firstName() + "@gmail.com");
        registerUser.setTelephone(RandomStringUtils.randomNumeric(7));
        registerUser.setPassword(RandomStringUtils.randomAlphabetic(9));
        registerUser.setConfirmPassword(registerUser.getPassword());
        return registerUser;

    }

    public static BillingInformation billingInformation() {
        var billingDetails = new BillingInformation();
        billingDetails.setAddress(faker.address().streetAddress());
        billingDetails.setCity(faker.address().cityName());
        billingDetails.setPostCode(faker.address().zipCode());
        return billingDetails;
    }

    public static BillingInformation billingInformationAuthenticatedUser() {
        var billingInformationAuthenticatedUser = new BillingInformation();
        billingInformationAuthenticatedUser.setFirstName(faker.name().firstName());
        billingInformationAuthenticatedUser.setLastName(faker.name().lastName());
        billingInformationAuthenticatedUser.setAddress(faker.address().streetAddress());
        billingInformationAuthenticatedUser.setCity(faker.address().cityName());
        billingInformationAuthenticatedUser.setPostCode(faker.address().zipCode());
        return billingInformationAuthenticatedUser;
    }

    public static LoginInformation loginUser(String email, String password) {
        var loginDetails = new LoginInformation();
        loginDetails.setEmail(email);
        loginDetails.setPassword(password);
        return loginDetails;
    }
}

package NopCommerceTesting;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils {
    //locator for registration success message
    private By _registerSuccessMessage=By.xpath("//div[@class=\"result\"]");
    String expected="Your registration completed";
    //Method to verify registration success full message
    public void verifyUserSeeRegistrationSuccessMessage()
    {
        assertURL("registerresult");
        assertTextMessage("Registration not successful",expected,_registerSuccessMessage);
    }

}

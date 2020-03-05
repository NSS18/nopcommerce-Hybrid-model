package NopCommerceTesting;

import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class LoginPage extends Utils {
    //locator for email
    private By _email=By.xpath("//*[@id=\"Email\"]");
    //locator for password
    private By _password=By.xpath("//*[@id=\"Password\"]");
    //locator for login button
    private By _login=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input");



    //Method to verify we  are on login page
    public void verifyOnLoginPage()
    {
        assertURL("login?returnUrl=%2F");
    }

    //To enter login details
    public void loginDetails()  {
        timeDelay(3);
        //To enter email
        enterText(_email,"abc1233@gmail.com");
        //To enter password
        enterText(_password,"abc123");
        //To click on login
        scrollAndClick(_login);
    }
}

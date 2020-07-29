package forgotpassword;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmail("TestTest@email.com");
        EmailSentPage emailSentPage = forgotPasswordPage.retrievePassword();
        assertTrue(emailSentPage.getNotificationText().contains("Your e-mail's been sent!"), "Notification text is incorrect!");
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    WebDriver driver;
    private By emailInput = By.id("email");
    private By retrievePassword = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }

    public EmailSentPage retrievePassword(){
        driver.findElement(retrievePassword).click();
        return new EmailSentPage(driver);
    }

}

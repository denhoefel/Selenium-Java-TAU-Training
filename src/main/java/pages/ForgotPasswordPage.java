package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By email = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public ForgotPasswordPage retrievePassword (String emailAddress){
        driver.findElement(email).sendKeys(emailAddress);
        driver.findElement(retrievePasswordButton).click();
        return new ForgotPasswordPage(driver);
    }


}

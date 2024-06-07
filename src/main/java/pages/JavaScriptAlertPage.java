package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {

    private WebDriver driver;
    private By clickForJsAlert = By.xpath("// button [@onClick ='jsAlert()']");

    public JavaScriptAlertPage(WebDriver driver) {
        this.driver = driver;
    }

public void clickForJsAlert(){
        driver.findElement(clickForJsAlert).click();
}

public void acceptAlert(){
        driver.switchTo().alert().accept();

}

}

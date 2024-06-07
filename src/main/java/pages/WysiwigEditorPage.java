package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwigEditorPage {
    private WebDriver driver;
    private String nameIframe = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIdentButton = By.cssSelector("#mceu_12 button");

    public WysiwigEditorPage (WebDriver driver){
        this.driver = driver;
    }

    private void switchToIframeArea(){
        driver.switchTo().frame(nameIframe);

    }

    public void clearText(String text){
        switchToIframeArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void sendTest(){
        switchToIframeArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void decreateIdentButton (){
        driver.findElement(decreaseIdentButton).click();
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}

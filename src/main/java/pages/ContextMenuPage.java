package pages;


import com.sun.tools.xjc.reader.xmlschema.BindYellow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotSpot = By.xpath("//div [@id='hot-spot']");

    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
    }

    public void rightClick(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(hotSpot)).perform();
    }

    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }
    public void acceptPopUp(){
        driver.switchTo().alert().accept();
    }
}

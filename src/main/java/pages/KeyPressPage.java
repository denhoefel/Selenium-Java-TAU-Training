package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {

    private WebDriver driver;
    private By target=By.id("target");

   public KeyPressPage(WebDriver driver){
       this.driver = driver;
   }

   public KeyPressPage enterKeys(String text){
     driver.findElement(target).sendKeys(text + Keys.BACK_SPACE);
     return new KeyPressPage(driver);
   }

   public String getResult(){
       return driver.findElement(By.id("result")).getText();
   }

}

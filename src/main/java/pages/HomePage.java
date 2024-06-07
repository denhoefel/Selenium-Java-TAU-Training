package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) { //constructor
        this.driver = driver;
    }

    private void clickLink(String linkText){ //easy way to reuse the method to click in different links from the homepage by changing the text of the link.
        driver.findElement(By.linkText(linkText)).click();

    }

    public LoginPage clickFormAuthentication(){ //click on Form Authentication link
     clickLink("Form Authentication");
     return new LoginPage(driver);
         }

      public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
      }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoverPage clickHover(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public KeyPressPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressPage(driver);

    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);

    }
    public JavaScriptAlertPage clickJavaScrip(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertPage(driver);

    }

    public FileUploadClass clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadClass(driver);

    }

    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }


    public WysiwigEditorPage clickWysiwigEditorMenu(){
        clickLink("WYSIWYG Editor");
        return new WysiwigEditorPage(driver);
    }

}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadClass {

    private WebDriver driver;
    private By inputField= By.id("file-upload");
    private By uploadButton=By.id("file-submit");
    private By uploadedFile=By.id("uploaded-files");

    public FileUploadClass(WebDriver driver){
    this.driver=driver;
    }


    public void clickUploadButton(){
        driver.findElement(uploadButton).click();

    }

    public void uploadFile (String absolutePathOfFile){
   driver.findElement(inputField).sendKeys(absolutePathOfFile);
clickUploadButton();
    }


    public String getFileUploaded (){
        return driver.findElement(uploadedFile).getText();
    }
}

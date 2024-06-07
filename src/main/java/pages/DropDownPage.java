package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {


    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    private Select findDropDownElement(){ //This method finds a dropdown element
        return new Select(driver.findElement(dropdown));
    }

    public void selectFromDropDown(String option){ // this method will select the option you want from the dropdown
        findDropDownElement().selectByVisibleText(option);
    }



    public List<String> getSelectedOptions(){ //Get the number of options selected
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();//get all the options from the dropdown
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());//
    }




}

package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;


public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe"); //informing the webdriver and location
        driver = new ChromeDriver(); //instantiate ChromeDriver
        driver.get("https://the-internet.herokuapp.com//"); //access to the page you want to test
        driver.manage().window().maximize(); //maximize the window
        homePage = new HomePage(driver); //the object homePage will receive the URL so you can start the tests from there
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
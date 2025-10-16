package Login;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

@Test
public void testSuccessfulLogin(){
    LoginPage loginPage= homePage.clickFormAuthentication();
    loginPage.SetUsername("tomsmith");
    loginPage.setPassword("SuperSecretPassword!");
    SecureAreaPage secureAreaPage= loginPage.clickLoginButton();
    String alert = secureAreaPage.getAlertText();
    assertTrue(alert.contains("You logged into a secure area!"),
            "Mensagem inesperada. Recebido: " + alert);
}
}

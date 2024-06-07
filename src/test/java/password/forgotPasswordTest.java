package password;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class forgotPasswordTest extends BaseTests {

    @Test
public void retrievePassword(){
    ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
    forgotPasswordPage.retrievePassword("abc@xyz.com");

}



}

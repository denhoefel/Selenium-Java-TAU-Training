package FileUpload;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadClass;

public class FileUploadTest extends BaseTests {
//This test case is not working anymore. Need to fix.
    @Test
    public void testUploadFiles(){
        FileUploadClass uploadPage= homePage.clickFileUpload();

                uploadPage.uploadFile("C:\\Users\\I841937\\IdeaProjects\\testautomation\\resources\\chromedriver.exe");
                Assert.assertEquals(uploadPage.getFileUploaded(),"chromedriver.exe","error to upload the file");
    }

}

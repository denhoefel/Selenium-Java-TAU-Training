package Keys;

import base.BaseTests;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Test;

public class KeysTest extends BaseTests {

@Test
public void sendKeysTest(){
  String actualResult = homePage.clickKeyPresses()
          .enterKeys("a")
          .getResult();

    Assert.assertEquals(actualResult,"You entered: BACK_SPACE","The message expected is not correct");

}

}

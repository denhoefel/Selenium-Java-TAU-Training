package Actions;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTest extends BaseTests {

    @Test
    public void rightClickTest(){
        ContextMenuPage menu= homePage.clickContextMenu();
        menu.rightClick();
        String currentResult = menu.getPopUpText();
        //menu.acceptPopUp();
        Assert.assertEquals(currentResult,"You selected a context menu","incorrect message");
    }

}

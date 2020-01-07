package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.*;

public class TestCase9 extends Base {

    @Test
    public void testCase9() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.emailAddress.sendKeys("example.test@gmail.com");
        mainPage.sendDeals.click();
        mainPage.checkSendDeals.waitTextToBe("Thanks for signing up!");
        Assert.assertEquals(mainPage.checkSendDeals.getText(),"Thanks for signing up!");
    }
}

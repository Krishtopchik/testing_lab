package project.test;

import framework.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;

public class TestCase1 extends Base {

    @Test
    public void testCase1() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.signIn.click();
        mainPage.email.waitVisibilityOfElement();
        mainPage.email.sendKeys(ConfigReader.getTestData("login"));
        mainPage.password.sendKeys(ConfigReader.getTestData("password"));
        mainPage.goSignIn.click();
        Assert.assertTrue(mainPage.userActive.isDisplayed(), "User did'not sign in");
    }
}

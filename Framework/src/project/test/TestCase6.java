package project.test;

import framework.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.ProfilePage;

public class TestCase6 extends Base {

    @Test
    public void testCase6() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.signIn.click();
        mainPage.email.waitVisibilityOfElement();
        mainPage.email.sendKeys(ConfigReader.getTestData("login"));
        mainPage.password.sendKeys(ConfigReader.getTestData("password"));
        mainPage.goSignIn.click();
        Assert.assertTrue(mainPage.userActive.isDisplayed(), "User did'not sign in");
        mainPage.user.click();
        mainPage.myProfile.click();
        ProfilePage profilePage = new ProfilePage();
        Assert.assertTrue(profilePage.myProfile.isDisplayed(), "Profile page didn't opened");
        profilePage.middleName.sendKeys("A");
        profilePage.saveChanges.click();
        Assert.assertEquals(profilePage.middleName.getText(),"A","Field did not changed");
    }
}

package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.RecomendationPage;

public class TestCase7 extends Base {

    @Test
    public void testCase7() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.recommend.click();
        RecomendationPage recomendationPage = new RecomendationPage();
        Assert.assertTrue(recomendationPage.panelSearch.isDisplayed(), "Recommend page did not opened");
    }
}

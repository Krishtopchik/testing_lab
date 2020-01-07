package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.SearchResultPage;

public class TestCase3 extends Base {

    @Test
    public void testCase3() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.location.sendKeys("Minsk");
        mainPage.search.click();
        mainPage.search.click();
        SearchResultPage searchResultPage = new SearchResultPage();
        Assert.assertTrue(searchResultPage.resultPanel.isDisplayed(), "Search page did not opened");
        Assert.assertEquals(searchResultPage.regions.getText(), "Minsk","Region is not Minsk");
        searchResultPage.star.click();
        Assert.assertEquals(searchResultPage.star5.getText(),"5 Stars", "Hotels without 5 stars");
    }


}

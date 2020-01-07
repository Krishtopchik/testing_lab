package project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.MainPage;
import project.pageObject.SearchResultPage;

public class TestCase8 extends Base {

    @Test
    public void testCase8() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.location.sendKeys("Minsk");
        mainPage.search.click();
        mainPage.search.click();
        SearchResultPage searchResultPage = new SearchResultPage();
        Assert.assertTrue(searchResultPage.resultPanel.isDisplayed(), "Search page did not opened");
        Assert.assertEquals(searchResultPage.regions.getText(), "Minsk","Region is not Minsk");
        searchResultPage.currency.click();
        searchResultPage.euro.click();
        searchResultPage.checkCurrency.waitVisibilityOfElement();
        Assert.assertEquals(searchResultPage.checkCurrency.getText(),"€");
    }
}

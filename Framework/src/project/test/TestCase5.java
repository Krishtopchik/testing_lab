package project.test;

import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.*;

public class TestCase5 extends Base {

    @Test
    public void testCase5() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.startSaving.click();
        Browser.switchTab(1);
        TripBuilderPage tripBuilderPage = new TripBuilderPage();
        Assert.assertTrue(tripBuilderPage.builderPanel.isDisplayed(), "Trip builder page did not opened");
        tripBuilderPage.from.sendKeys("Minsk");
        tripBuilderPage.to.sendKeys("Moscow");
        tripBuilderPage.startDate.click();
        tripBuilderPage.start1.click();
        tripBuilderPage.end1.click();
        tripBuilderPage.findDeal.click();
        BuilderTripResultPage builderTripResultPage = new BuilderTripResultPage();
        Assert.assertTrue(builderTripResultPage.panel.isDisplayed(), "Trip builder result page did not opened");

    }


}

package project.test;

import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pageObject.FlightsPage;
import project.pageObject.MainPage;

public class TestCase4 extends Base {

    @Test
    public void testCase4() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.panelSearch.isDisplayed(), "Main page did not opened");
        mainPage.flights.click();
        mainPage.departingFrom.sendKeys("Minsk");
       // mainPage.chooseFrom.click();
        mainPage.goingTo.sendKeys("Moscow");
     //   mainPage.chooseTo.click();
        mainPage.findFlight.click();
        Browser.switchTab(1);
        FlightsPage flightsPage = new FlightsPage();
        Assert.assertTrue(flightsPage.flightsPanel.isDisplayed(), "Flights page did not opened");
    }


}

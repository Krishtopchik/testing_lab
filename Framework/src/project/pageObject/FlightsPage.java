package project.pageObject;

import framework.elements.Label;
import org.openqa.selenium.By;

public class FlightsPage {

    public Label flightsPanel = new Label(By.xpath("//ul[@class='fly-search-listings full-width no-padding']"),"flights panel");

}

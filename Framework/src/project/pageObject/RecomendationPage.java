package project.pageObject;

import framework.elements.Label;
import org.openqa.selenium.By;

public class RecomendationPage {
    public Label panelSearch = new Label(By.xpath("//div[@class='wcgzm7-5 dvSNDb']"),"Hotels panel");
}

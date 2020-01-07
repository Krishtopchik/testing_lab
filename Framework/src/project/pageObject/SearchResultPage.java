package project.pageObject;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class SearchResultPage {
    public Label resultPanel = new Label(By.xpath("(//div[contains(@class,'indexesm__Box-sc-1ot0wsx-0 ldoZko')])[1]"), "resultPanel");
    public Label regions = new Label(By.xpath("(//div[contains(@class,'AttributesRow__AttributesRowText-sc-1nckqy5-2 fkGYaN indexesm__Box-sc-1ot0wsx-0 epaVjg')])[1]"),"regions");
    public Button shortlist = new Button(By.xpath("(//span[@class='icon-heart-open-b'])[1]"), "shortlist button");
    public Button myShortList = new Button(By.xpath("//a[@id='link-shortlist']"),"MyShortList");
    public Label hotelName = new Label(By.xpath("(//a[@class='headerLink fl'])[1]"),"Hotel name");
    public Label star = new Label(By.xpath("//label[@data-autobot-element-id='HTL_LIST_FILTER_RATING_CHOOSE_5']"), "5 star");
    public Label star5 = new Label(By.xpath("//span[@class='sc-iQtOjA etYfNO indexesm__Text-sc-1ot0wsx-5-span ctlOkh']"), "5 star");
    public Button currency = new Button(By.xpath("//span[@id='currency-label']"),"Currency");
    public Button euro = new Button(By.xpath("//a[@id='cc-EUR']"),"euro");
    public Label checkCurrency = new Label(By.xpath("//label[@class='indexesm__Label-sc-1ot0wsx-27 hQkixn']"), "check currency");






}

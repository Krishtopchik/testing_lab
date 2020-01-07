package project.pageObject;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class TripBuilderPage {
    public Label builderPanel =  new Label(By.xpath("//div[@class='sc-fcdeBU hPDNHz sc-kUaPvJ kicIIN']//div[@class='sc-fONwsr iIpsgT sc-kUaPvJ kicIIN']"),"Builder panel");
    public Button from =  new Button(By.xpath("//input[@id='startLocation']"),"From location");
    public Button to =  new Button(By.xpath("//input[@id='endLocation']"),"To location");
    public Button startDate =  new Button(By.xpath("//input[@id='startDate']"),"Start date");
    public Button start1 =  new Button(By.xpath("//div[@data-autobot-element-id='DATEPICKER_DAY_20200117']"),"Start date1");
    public Button end1 =  new Button(By.xpath("//div[@data-autobot-element-id='DATEPICKER_DAY_20200212']"),"End date1");
    public Button findDeal =  new Button(By.xpath("//button[@class='sc-clNaTc bODOXj sc-jKVCRD gAFkhF']"),"Find deal");


}

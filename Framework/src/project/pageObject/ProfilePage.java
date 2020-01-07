package project.pageObject;

import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class ProfilePage {
    public Label myProfile = new Label(By.xpath("//div[@class='myprofile__main__inner']"),"My profile");
    public Button middleName = new Button(By.xpath("//input[@id='personal-info__middle-initial']"),"Middle name");
    public Button saveChanges = new Button(By.xpath("(//input[@value='Save Changes'])[1]"),"Save");


}

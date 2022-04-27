package project.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoMainPage extends basePage{

    @FindBy(xpath = "//div[@class='app_logo']")
    public WebElement logo;

}

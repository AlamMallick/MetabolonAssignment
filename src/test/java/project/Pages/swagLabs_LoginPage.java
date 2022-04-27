package project.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class swagLabs_LoginPage extends basePage{

    @FindBy(id = "user-name")
    private WebElement userNameBox;

    @FindBy(id = "password")
    private WebElement passWordBox;

    @FindBy(css = "input[id=login-button]")
    public WebElement loginButton;

    @FindBy(tagName = "h3")
    public WebElement errorMessage;

    public void login(String username, String password){
        userNameBox.sendKeys(username);
        passWordBox.sendKeys(password);
    }

}

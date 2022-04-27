package project.Pages;

import org.openqa.selenium.support.PageFactory;
import project.Utils.Driver;

public abstract class basePage {

    public basePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}

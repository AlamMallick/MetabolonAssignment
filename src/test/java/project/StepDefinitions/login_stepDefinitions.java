package project.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import project.Pages.DemoMainPage;
import project.Pages.swagLabs_LoginPage;
import project.Utils.BrowserUtils;
import project.Utils.ConfigurationReader;
import project.Utils.Driver;

public class login_stepDefinitions {

    swagLabs_LoginPage loginPage = new swagLabs_LoginPage();
    DemoMainPage demoMainPage = new DemoMainPage();

    @Given("I am on the Sauce Demo Login Page")
    public void i_am_on_the_sauce_demo_login_page() {

        String expTitle = "Swag Labs";
        assertEquals("Title doesn't match",expTitle,Driver.getDriver().getTitle());

    }

    @When("I insert the StandardUser Username as {string} and Password as {string}")
    public void iInsertTheStandardUserUsernameAsAndPasswordAs(String userName, String passWord) {
        loginPage.login(userName, passWord);
    }

    @And("I click the Login Button and land on the main page")
    public void iClickTheLoginButton() {
        loginPage.loginButton.click();
    }

    @And("I verify the App Logo exists")
    public void iVerifyTheAppLogoExists() {
        BrowserUtils.waitUntilVisible(demoMainPage.logo);
        assertTrue("Logo is not displayed",demoMainPage.logo.isDisplayed());
    }

    @When("I insert the LockedOutUser Username as {string} and Password as {string}")
    public void iInsertTheLockedOutUserUsernameAsAndPasswordAs(String userName, String passWord) {
        loginPage.login(userName, passWord);
    }

    @Then("I verify the Error Message contains the text {string}")
    public void iVerifyTheErrorMessageContainsTheText(String expErrorMessage) {
        String actErrorMessage = loginPage.errorMessage.getText();
        assertEquals("Error message dont match",expErrorMessage,actErrorMessage);
    }
}

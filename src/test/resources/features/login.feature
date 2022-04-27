Feature: Swag Labs Login for standard & locked user

  @positive
Scenario:Successful Login
Given I am on the Sauce Demo Login Page
When I insert the StandardUser Username as "standard_user" and Password as "secret_sauce"
And I click the Login Button and land on the main page
And I verify the App Logo exists

  @negative
Scenario: Failed Login
Given I am on the Sauce Demo Login Page
When I insert the LockedOutUser Username as "locked_out_user" and Password as "secret_sauce"
And I click the Login Button and land on the main page
Then I verify the Error Message contains the text "Sorry, this user has been banned."


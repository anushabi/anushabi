

Feature: User login into the saucedemo

Background: Given user navigate to the login page

Scenario: User enters the correct email and password
Given user navigate to the login page
When user enter the valid username "standard_user"
And user enter the valid password "secret_sauce"
And user click on the login button
Then User login into the login page

Scenario: user enters correct mail and incorrect passowrd
Given User navigate to the login page
When User enter the invalid username "standard_user"
And User user enther the valid password "sfdg"
And User click on the login button
Then User should need to get warning message

Scenario: User enters the incorrect mail and correct password
Given User navigate to the login page
When User enter the incorrect username "fxdgdg"
And user enter the valid password "secret_sauce"
And user click on the login button
Then user should to get warning messgae





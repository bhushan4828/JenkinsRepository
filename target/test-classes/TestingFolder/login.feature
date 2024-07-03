Feature: : login functionality

Scenario: Login witrh valid credentials

Given User is at a login screen

When User enter the valid Username "bhushank"
And User enter the valid Password 12345
And User click on Login button

Then User should be login


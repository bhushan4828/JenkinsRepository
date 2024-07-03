Feature: : login functionality
Background: 
Given User should launched the browser

Scenario: Login witrh valid credentials

Given User is at a login screen

When User enter the valid Username
And User enter the valid Password
And User click on Login button

Then User should be login


Scenario: Verify the Order details

Given User should be at the order page in application

When User should click on past orders
And User should click on the current orders
And User should click on future orders
Then User shpould be able to see all the order details 



Feature: Campaign Functionality

@functional
Scenario: Creation of Campaign
Given User is at Campaign Page
When User click on create campaign
And User enter the required information
And User click on save button
Then Campaign should get started

@regression
Scenario: Scheduling a campaign
Given User is at Campaign Page
When User click on the scehedule campaign
And User  Enter the sending information
And User click omn teh schedule button
Then Campaign should get schedule

@sanity @smoke
Scenario: Sent Campaign
Given User is at Campaign Page
When User click on the sent Campaign
Then USer should see the sent campaign







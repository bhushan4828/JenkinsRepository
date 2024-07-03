Feature: Profile Functionality

Scenario: Add Profile for User 
Given User should at home page
When User clicks on add profile button
And User upload the Image
Then User Profile should get added

Scenario: Update profile for user 
Given  User should at home page
When User clicks on edit button
And User upload the Image
Then User profile should get updated

Scenario: Delete profile for user 
Given  User should at home page
When User clicks on delete profile button
Then Profile should get deleted


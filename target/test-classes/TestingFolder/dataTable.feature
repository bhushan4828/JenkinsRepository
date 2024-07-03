Feature: Registration Functionality
Scenario: Verify the Signup functionality

Given user should be at signup page
When user should click on signup button
And user should enter the required below information

|Bhushan|Pune|8605652972|Maharashtra|
|Suresh|Akola|8645897245|Maharashtra|
|Neha|Pune|24841545455|Maharshtra|

And user should click on submit button
Then user registration done successfully


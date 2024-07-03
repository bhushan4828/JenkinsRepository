Feature: Login Functionality

Background:
Given User should Launch Browser

Scenario Outline: login with valid credentials

Given User is at a login page

When User enters valid email address "<Email>"
And User enters a valid password "<Password>"
And click on login button

Then User sould mlogin successfully

Examples:
| Email              |Password |
| bhushan@email.com  |12345    |
| shubahm@email.com  |5685     |
| sumant@email.com   |48595    |
| priyanka@email.com |486415   |
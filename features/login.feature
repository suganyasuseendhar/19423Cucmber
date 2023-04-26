@regression
Feature: Login funtionality for W3Schools
Validating end to end use cases of Login feature in W3Schools

Background:
Given Navigate to W3Schools

@smoke
Scenario: Login with correct username and correct password
#Given Navigate to W3Schools
When I enter the username
And I enter the password
Then Click on Login button for successful login

@sanity
Scenario: Login with correct username and incorrect password
#Given Navigate to W3Schools
When I enter the username
And I enter the incorrect password
Then Click on Login button for unsuccessful login
@register
Feature: user registration
in order to become a site member
i want to go to the registration page, enter the first name, email, phone
Scenario: positive tests
Given  user visiting homepage
When  user enter registration link
And  user enterusername, password, click and submit
Then  user recieves a confim message
And user close the browser
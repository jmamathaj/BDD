Feature: Login to the hotel app
  
  Scenario: successful login to hotel app 
  Given I am on login page
  When I enter the username as "JMamatha123"
  And I enter the password as "corp@123"
  And I click on the login button
  Then the login was successful
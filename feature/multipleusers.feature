Feature: Login to the hotel app
  
  Scenario Outline: successful login to hotel app 
  Given I am on login page
  When I enter the username as <Username>
  And I enter the password as <Password>
  And I click on the login button
  Then the login was successful
  
   Examples: 
      | Username         | Password      |
      | "JMamatha123"    | "corp@123"    |
      |"KhbSaiSri"       |"Hima@123"     |
      |"chintalathanusha"|"Thanusha@1920"|
      
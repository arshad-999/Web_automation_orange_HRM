
Feature: Test login functionality

  Scenario Outline: Check login is successful with Invalid credentials
    Given user is on login page  
    When user enter wrong "username" and "password" 
    Then user not able to login 
    
    Examples:
    |username|password|
    |arsh    |khan|
    |asd     |jsdbf|
  

  Scenario Outline: user login with valid credntials
    Given user is on login page
    When user enter correct "username" and "password"
    Then verify user able to login 

    Examples:
      | username  | password | 
      | Admin     |     admin123|
      

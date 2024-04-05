Feature: Login Functionality

  Scenario: Login Page title
    Given User is on the login page
    When User gets the title of the page
    Then page title should be "Adactin.com - Hotel Reservation System"
   
Scenario: Successful Login with Valid Credentials
    Given User is on the login page
    When User enters valid username "Revathinair" 
   And User enters valid password "Sachi@9620"
    And User clicks on the login button
    Then User gets the title of the search hotel page 
  

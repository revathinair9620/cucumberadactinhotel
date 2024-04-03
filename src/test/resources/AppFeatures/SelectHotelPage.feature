Feature: SelectHotel Functionality

  Background: 
    Given user has already logged into application
      | username    | password   |
      | Revathinair | Sachi@9620 |
    Given User is on the SearchHotel page
    Then User select the location from dropdown
    And User select the hotel from dropdown
    And User select the roomtype from dropdown
    And User enters the checkindate as current date
    And User enters the checkoutdate as current dateplus2days
    And User clicks on the submit button

  Scenario: SelectHotel Page title
    Given User is on the SelectHotel page
    When User gets the title of the page
    Then page title should be "Adactin.com - Select Hotel"

  Scenario: Click hotel
    Given User is on the SelectHotel page
    Then User clicks the hotel radiobutton
    And User clicks on the continue button
    Then User gets the title of the book a hotel page

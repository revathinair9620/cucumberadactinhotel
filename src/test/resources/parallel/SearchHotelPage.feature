Feature: SearchHotel Functionality

  Background: 
    Given user has already logged into application
      | username    | password   |
      | Revathinair | Sachi@9620 |

  Scenario: SearchHotel Page title
    Given User is on the SearchHotel page
    When User gets the title of the page
    Then page title should be "Adactin.com - Search Hotel"

  Scenario: Select values
    Given User is on the SearchHotel page
    Then User select the location from dropdown
    And User select the hotel from dropdown
    And User select the roomtype from dropdown
    And User enters the checkindate as current date
    And User enters the checkoutdate as current dateplus2days
    And User clicks on the submit button
    Then User gets the title of the select hotel page

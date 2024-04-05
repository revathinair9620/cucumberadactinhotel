Feature: Booking Confirmation Functionality

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
    Given User is on the SelectHotel page
    Then User clicks the hotel radiobutton
    And User clicks on the continue button
    Given User is on the BookAHotel page

  Scenario Outline: Enter the user details
    When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User clicks on book now
    Given User is on the BookingConfirmation page
    When User gets the title of the page
    Then page title should be "Adactin.com - Hotel Booking Confirmation"
    Then verify the order no

    Examples: 
      | SheetName   | RowNumber |
      | userdetails |         0 |

  


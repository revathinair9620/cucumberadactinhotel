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
    When user enters credit card details and the "<firstname>" "<lastname>" "<address>" "<creditcardno>" "<cvv>"
    Then User clicks on book now
    

    Examples: 
      | firstname| lastname |address        |creditcardno    |cvv|
      | Revathi	 |  Nair    |32-34 mons road|1234567890123456|123|
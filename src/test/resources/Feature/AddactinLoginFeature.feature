Feature: Verifying the addactin page

  Scenario Outline: Verifying if the user is able to login to the addactin application with valid credentials
    Given User launched the URL
    When User entered the valid login credentials "<name>" and "<password>"
    Then User click on login button

    Examples: 
      | name     | password  |
      | Josephin | Jesus@123 |

  Scenario Outline: Verifying if the user is able to search the hotel
    Given User navigate to the search hotel URL
    When User search the Location"<location>"
    And User search the hotel"<hotels>"
    And User search the room type"<roomtype>"
    And User search the number of rooms"<roomno>"
    And User select the check in date"<indate>"
    And User select the check out date"<outdate>"
    And User select the adults per room"<adultperroom>"
    And User select the children per room"<childrenperroom>"
    Then User click on search button

    Examples: 
      | location | hotels        | roomtype | roomno  | indate     | outdate    | adultperroom | childrenperroom |
      | London   | Hotel Cornice | Deluxe   | 6 - Six | 10/01/2020 | 11/01/2020 | 4 - Four     | 4 - Four        |

  Scenario: Verifying if the user is able to select the hotel
    Given User should launch the select hotel URL
    When User should select the radio button option from the options provided
    Then Click on continue button

  Scenario Outline: Verifying if the system is able to generate the order ID
    Given User should launch the book a hotel URL
    When User search the fname"<fname>"
    And User search the lname"<lname>"
    And User search the billingaddress"<billadd>"
    And User search the number of credit card number"<ccno>"
    And User select the check in credit card type"<cctype>"
    And User select the check out expdate"<expmonth>" and "<expyear>"
    And User select the adults per CCV"<ccvno>"
    And User click on Book Now button
    Then User need to get the order ID

    Examples: 
      | fname    | lname   | billadd | ccno             | cctype | expmonth | expyear | ccvno |
      | Josephin | Christo | Chennai | 8734567895678676 | VISA   | August   |    2022 |   234 |

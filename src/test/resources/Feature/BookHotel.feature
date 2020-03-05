Feature: Verifying the order ID

  Scenario: Verifying if the user is able to login to the addactin application with valid credentials
    Given User launched the URL
    When User entered the valid login credentials
    Then User click on login button

  Scenario Outline: Verifying if the system is able to generate the order ID
    Given User should launch the book a hotel URL
    When User search the fname"<fname>"
    And User search the lname"<lname>"
    And User search the billingaddress"<billadd>"
    And User search the number of credit card number"<ccno>"
    And User select the check in credit card type"<cctype>"
    And User select the check out expdate"<expdate>"
    And User select the adults per CCV"<ccvno>"
    Then User click on Book Now button

    Examples: 
      | fname    | lname   | billadd | ccno     | cctype | expdate | ccvno |           |
      | Josephin | Christo | Chennai | 87345678 | VISA   | August  |  2022 | 234567890 |

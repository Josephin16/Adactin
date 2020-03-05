@f1
Feature: Verifying the addactin page
 @s1
  Scenario Outline: Verifying if the user is able to login to the addactin application with valid credentials
    Given User launched the URL
    When User entered the valid login credentials "<name>" and "<password>"
    Then User click on login button

    Examples: 
      | name     | password  |
      | Josephin | Jesus@123 |
@s2
  Scenario Outline: Verifying if the user is able to login to the addactin application with invalid credentials
    Given User launched the URL
    When User entered the valid login credentials "<name>" and "<password>"
    Then User click on login button

    Examples: 
      | name     | password  |
      | Josephin | Jesus@12 |

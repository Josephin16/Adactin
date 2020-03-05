Feature: Selecting the hotel

  Scenario: Verifying if the user is able to select the hotel
    Given User should launch the select hotel URL
    When User should select the radio button option from the options provided
    Then Click on continue button

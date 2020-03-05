Feature: Searching the hotel

	Scenario: Verifying if the user is able to login to the addactin application with valid credentials
	   Given User launched the URL
		 When User entered the valid login credentials
	   Then User click on login button

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
      | location | hotels        | roomtype | roomno | indate     | outdate    | adultperroom | childrenperroom |
      | London   | Hotel Cornice | Deluxe   | Six    | 10/01/2020 | 11/01/2020 | 4 - Four     | 4 - Four        |

@homework
Feature: Homework

Scenario: Check ID uniqueness for Land for Sale:
    Given the site is open
    When I under deal type "For sale" go to real estate type "Land"
    Then I see all IDs on the first page are unique
    When I navigate to the last page
    Then I see all IDs on the first page are unique

Scenario: Test for Price ascending:
    Given the site is open
    When I under deal type "For rent / lease" go to real estate type "Apartment"
    And I click on sort by "price"
    Then price is ascending
    When I navigate to the last page
    Then price is ascending

Scenario: Test for Prices descending:
    Given the site is open
    When I under deal type "For sale" go to real estate type "Apartment"
    And I click on sort by "price"
    And I click on sort by "price"
    Then price is descending
    When I navigate to the last page
    Then price is descending

Scenario: Testing favorites section:
    Given the site is open
    When I under deal type "For sale" go to real estate type "Land"
    And I add an item to favourites
    When I return to the main page
    And I under deal type "For sale" go to real estate type "Apartment"
    And I add an item to favourites
    When I return to the main page
    And I under deal type "For sale" go to real estate type "House"
    And I add an item to favourites
    And I go to the favourites section
    Then I can see "3" items
    When I remove an item from the favourites section
    Then I can see "2" items
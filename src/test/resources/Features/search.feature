Feature: Test search functionalities

  Background:
    Given a user on the home page

  @single_test
  Scenario: Check user able to search product

    When user enter the productname "TV Stand"
    And click search button
    Then user is navigated to product page


  @dataDriven_test
  Scenario: Check user able to search product using data table

    When user click on search button upon entering product name
    |productname|
    |iPhone     |
    |Laptops    |
    |TV Stand   |
    Then user is navigated to product page

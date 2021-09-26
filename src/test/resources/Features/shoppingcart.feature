Feature: Test shopping cart functionalities

  Scenario: Check user can able to see the shopping cart

    Given a user on the home page
    And user click on cart icon
    Then user is navigated to shopping cart page
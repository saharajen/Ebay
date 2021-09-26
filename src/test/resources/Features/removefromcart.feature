Feature: Cart functionalities

  Scenario: Check user able to add and remove product from cart

    Given a user on the home page
    When user enter the productname "dell laptop 10th gen i7"
    And click search button
    When user selected to dell precision laptop
    And click on add to cart on dell laptop
    And user clicked on go to button
    Then item added in cart successfully
    When user navigate to home by ebay logo
    And user clicked on cart button
    Then user successfully open cart
    And user clicked on remove button
    Then remove item validated by a success message
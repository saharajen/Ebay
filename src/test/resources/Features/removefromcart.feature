Feature: Cart functionalities

  Background:
    Given a user on the home page
  Scenario: Check user able to add and remove product from cart
    When user enter the productname "dell laptop 10th gen i7"
    And click search button
#    Then user is navigated to product page
    When user selected to dell precision laptop
#    Then user is on dell precision laptop page
    And click on add to cart on dell laptop
#    Then user found message 1 item add to cart
    And user clicked on go to button
    Then item added in cart successfully

    When user navigate to home by ebay logo

#    Then user is navigated to home page
    And user clicked on cart button

    Then user successfully open cart
    And user clicked on remove button

    Then remove item validated by a success message
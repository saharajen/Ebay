Feature: Test find store functionalities

  Scenario: User can able to find the store
    Given a user on the home page
    And click on stores
    And click on find stores
    When user enter the storename "adidas"
    And click on search
    And click on store name
    Then user is navigated to store home page





#
#  Scenario: User can find the store
#    Given user on the find store home page
#    And click on stores
#    And click on find stores
#    When user enter the store name
#    And click on search
#    And click on store name
#    Then user is navigated to store home page
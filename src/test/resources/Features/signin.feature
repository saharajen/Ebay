Feature: Test sign in functionalities

  Background:
    Given a user on the home page
    And click on sign in

  @positive_test
  Scenario: Check sign in is successful with valid credentials
    When user enter username "saharajen"
    And click on continue button
    When user enter password "Rajen123"
    And click on sing in button
    And click on Tired button
    Then user is navigated to home page

  @dataDriven_test
  Scenario Outline: Check sign in is successful with valid credentials for multiple users
    When user enter username "<username>"
    And click on continue button
    When user enter password "<password>"
    And click on sing in button
    And click on Tired button
    Then user is navigated to home page

    Examples:
    |username  |password|
    |saharajen |Rajen123|
    |saharishik|Rajen456|


    @negative_test
    Scenario: Check sign in is unsuccessful with invalid credentials
      When user enter username "saharajen"
      And click on continue button
      When user enter password "Rajen333"
      And click on sing in button
      Then user is failed to sign in


  @dataDriven_test_table
  Scenario: Check sign in is successful with valid credentials using data table
    When user click on continue button upon entering credentials
      |username |password|
      |saharajen|Rajen123|
    Then user is navigated to home page

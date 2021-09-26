Feature: Test daily deals and brand outlet functionalities


@daily_deals
  Scenario: Check user able to see daily deals product

    Given a user on the home page
    And click on daily deals tab
    Then user is navigated to daily deals home page

@band_outlet
  Scenario: Check user able to see brand outlet product

    Given a user on the home page
    And click on brand outlet tab
    Then user is navigated to brand outlet home page
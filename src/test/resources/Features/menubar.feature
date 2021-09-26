Feature: Test Product Bar functionalities

  @music_test
  Scenario: Check user can see the music product successfully

    Given a user on the home page
    And mouse hover on music
    And click on Guitars & Basses
    And click on Acoustic Guitars
    Then user is navigated to music page

  @fashion_test
  Scenario: Check user can see the fashion product successfully

    Given a user on the home page
    And click on fashion
    Then user is navigated to fashion page

  @electronics_test
  Scenario: Check user can see the electronics product successfully

    Given a user on the home page
    And click on electronics
    Then user is navigated to electronics page
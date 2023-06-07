@Google
Feature: Test google application functionality

  @smokeOR
  Scenario: Search in google search box (odisha)
    Given the user has opened "chrome" browser
    When user enter url "https://www.google.com"
    When user enter "odisha" in search box
    Then hit enter
    And close the started tab

  @somkeJH
  Scenario: Search in google search box (jharkhand)
    Given the user has opened "chrome" browser
    When user enter url "https://www.google.com"
    When user enter "jharkhand" in search box
    Then hit enter
    And close the started tab

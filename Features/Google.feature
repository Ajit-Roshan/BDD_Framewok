@Google
Feature: Test google application functionality

  @Smoke @Sanity
  Scenario: Search in google search box
    Given the user has opened "chrome" browser
    When  user enter url "https://www.google.com"
    When user enter "odisha" in search box
    Then hit enter
    And wait for 3seconds
    Then close the started tab

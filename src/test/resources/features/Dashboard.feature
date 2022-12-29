Feature: Verification of dashboard functionality

  @dashboard
  Scenario: Verify dashboard tabs
    When user enters username and password
    And user clicks on login button
    Then user is navigated to dashboard page
    Then user verify all the dashboard tabs
    |Admin|PIM|Leav|Time|Recruitment|Performance|Dashboard|Directory|

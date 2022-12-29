Feature: Login feature

  @regression321 @cmd
  Scenario: valid login scenario
    #Given user is able to launch HRMS application
    When user enters username and password
    And user clicks on login button
    Then user is navigated to dashboard page



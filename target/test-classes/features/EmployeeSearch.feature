Feature: Employee search

  Background:
   # Given user is able to launch HRMS application
    When user enters username and password
    And user clicks on login button
    Then user is navigated to dashboard page
    When user clicks on PIM option
    And user clicks on employee list option

  @smoke @sprint1
  Scenario: search employee by id
    When user enters valid employee id
    And user clicks on search button
    Then user see employee information is displayed

  @smoke @sprint2
  Scenario: search employee by name
    When user enters valid employee name
    And user clicks on search button
    Then user see employee information is displayed



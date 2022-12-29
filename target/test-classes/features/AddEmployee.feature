Feature: Adding employees

  Background:
    When user enters username and password
    And user clicks on login button
    Then user is navigated to dashboard page
    When user clicks on PIM option
    And user clicks on add employee button

  @regression
  Scenario: Adding an employee
    #Given user is able to launch HRMS application
    And user enters firstName , middleName and lastName
    And user cliks on save button
    Then employee addedd succesfully

  @regression1
  Scenario: Adding an employee from feature file
    When user enters "sofia" and "ms" and "christine" from feature file
    And user cliks on save button
    Then employee addedd succesfully

    @example
    Scenario Outline: Adding multiple employees from feature file
      When user enters "<firstName>" and "<middleName>" and "<lastName>" from examples file
      And user cliks on save button
      Then employee addedd succesfully
      Examples:
        | firstName | middleName | lastName |
        |eric       |ms          |martinez  |
        |juan       |ms          |gomaz     |
        |sherley    |ms          |bendett   |

    @datatable
    Scenario: Adding multiple employees using data table
      When user adds multiple employees and verify they are added
      |firstNameValue|middleNameValue|lastNameValue|
      |test123       |ms             |test456      |
      |testabc       |ms             |testxyz      |
      |test989       |ms             |test323      |


    @excel
    Scenario: adding multiple employees using excel file
      When user add multiple employees from excel sheet "EmployeeData" and verify them












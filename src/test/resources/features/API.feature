Feature: Testing the api related scenarios

  @api
  Scenario: Get an employee
    Given a JWT bearer token is generated
    Given a request is prepared for getting an employee from the db
    When a GET call is made to retrieve the created employee
    Then the status code for creating an employee is 200


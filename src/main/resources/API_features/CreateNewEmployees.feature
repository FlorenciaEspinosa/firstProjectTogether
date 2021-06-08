Feature: Create new Employees in Employee Database

  @POST
  Scenario: Validate a new user is created with basic API call
    Given  Request header "Content-Type" is set as "application/json"
    Then   I set request body with following parameters
      | id         | 987      |
      | firstName  | Andrea   |
      | lastName   | Espinosa |
      | role       | sdet     |
      | department | HR       |
    Then  I send POST Request to the resource "/api/employees"
    Then  Response has status code 200
Feature: Update existing employees

  @PUT
  Scenario: Validate the existing employee was Update
    Given I use token to Update Employee "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjoiYWRtaW4iLCJpYXQiOjE2MTkxNDQ2OTcsImV4cCI6MTYxOTIzMTA5N30.ulAdkCdxXuu9cAe3NYRbO60F_XFi6RJn57cWUug642s"
    Then  Request header "Content-Type" is set as "application/json"
    Then  I send query parameter to "firstName" as "API"
    Then  I set  Update request body with following parameters
      | id         | 0000         |
      | firstName  | Update       |
      | lastName   | Update       |
      | role       | sdet         |
      | department | Security     |
    Then  I send PUT Request to the resource "/api/employees"
    And   Response has status code 200
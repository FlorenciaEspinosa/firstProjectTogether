Feature: Get All Employee Database

  @GET
  Scenario: Verify All user is present in Employee Database
    Given I send GET request to resource "/api/employees"
    Then  Response has status code 200
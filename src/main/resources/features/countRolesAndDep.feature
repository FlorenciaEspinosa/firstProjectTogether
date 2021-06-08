Feature: Count of Roles and Departments

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page

  @Role
# Validate visual display of counts for Role based on number of employees with that role
  Scenario: Validate visual display of counts for Role based on number of employees with that role
    Then  I enter "admin" in the "Username" input field
    Then  I enter "admin123" in the "Password" input field
    Then  I click "Sign in" button
    And   I should see "Welcome " page
    Then  I should validate the "role" of users is present
    Then  I should count "users" who is used this Role
    Then  I click "All" button
    And   I validate the users "role" is exist from Employee data "table"
    And   I should validate the count of "users" role is equals count users from Employee data "table"

  @Department
# Validate visual display of counts for Department based on number of employees with that role
  Scenario: Validate admin visual display of counts for Department based on number of employees with that role
    Then  I enter "admin" in the "Username" input field
    Then  I enter "admin123" in the "Password" input field
    Then  I click "Sign in" button
    And   I should see "Welcome " page
    Then  I validate the department of users is present
    |Security |
    |HR       |
    Then  I should validate number of users who is used "Security" and "HR" Department is present
    Then  I click "All" button
    And   I should validate the users of "Security" and "HR" is exist from Employee data "Table"
    And   I validate the "number" of users department is equals number users from Employee data "table"
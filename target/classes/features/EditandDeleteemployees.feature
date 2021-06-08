Feature: Edit and Delete employees in Employee data table

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page

  @1
  Scenario: Validate admin has options to Add employees in Employee data table
    Then  I enter "admin" in the "Username" input field
    Then  I enter "admin123" in the "Password" input field
    Then  I click "Sign in" button
    And   I should see "Welcome " page
    Then  I enter "7" in the "ID" input field
    Then  I enter "John" in the "First Name" input field
    Then  I enter "Doe" in the "Last Name" input field
    Then  I select "sdet" in the "role" select field
    Then  I select "Security" in the "department" select field
    And   I click "Enter Employee" button
    And   I validate the user is exist from Employee data table
    | 7        |
    | John     |
    | Doe      |
    | sdet     |
    | Security |

  @2
  Scenario: Validate admin has options to Edit employees in Employee data table
    Then  I enter "admin" in the "Username" input field
    Then  I enter "admin123" in the "Password" input field
    Then  I click "Sign in" button
    And   I should see "Welcome " page
    Then  I click "All" button
    Then  I click  yellow "button" to update user
    Then  I enter the following values in the following fields to update user
    | firstName  | TLA       |
    | lastName   | Academy   |
    | role       | sdet      |
    | department | Security  |
    Then I click "Update" button
    And  I validate the updated user is exist from Employee data table
      | 7        |
      | TLA      |
      | Academy  |
      | sdet     |
      | Security |

  @3
  Scenario: Validate admin has options to Delete employees in Employee data table
    Then  I enter "admin" in the "Username" input field
    Then  I enter "admin123" in the "Password" input field
    Then  I click "Sign in" button
    And   I should see "Welcome " page
    Then  I click "All" button
    Then  I click  red "button" to delete user
    Then  I click "Confirm" button
    And   I validate the user is NOT exist from Employee data table
    | 7        |
    | TLA      |
    | Academy  |
    | sdet     |
    | Security |
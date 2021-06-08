Feature:New employee Form

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page


@test1
  Scenario: Role and Department fields should be taking options from Role and Departments tables
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I enter the following values in the following fields
      | ID         | 987      |
      | First Name | Andrea   |
      | Last Name  | Espinosa |
    And I choose "sdet" from dropdown "role"
    Then I choose "HR" from dropdown "department"
    And I click "Enter Employee" button


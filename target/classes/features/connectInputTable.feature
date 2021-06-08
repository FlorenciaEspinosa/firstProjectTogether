Feature:Connect Input table with Employee data table

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page



  Scenario: Populating in Employee data table
    Then  I enter "admin" in the "Username" input field
    Then  I enter "admin123" in the "Password" input field
    Then  I click "Sign in" button
    And   I should see "Welcome " page


    @test1
  Scenario:positive
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page

    Then I enter the following values in the following fields
      | ID         | 121255555555|
      | First Name | aaa  |
      | Last Name  | bbb  |
    And I choose "sdet" from dropdown "role"
    Then I choose "HR" from dropdown "department"
    And I click "Enter Employee" button
    Then verify if the following user exists in the table
      | First Name   | aaa   |
      | Last Name    | bbb   |
      | role         | sdet  |
      | department   | HR    |

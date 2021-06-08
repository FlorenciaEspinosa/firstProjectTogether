Feature: Employee Data table

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page

    #Positive scenario verify fields exists
  @test1
  Scenario Outline: Verify all columns exist
    Then  I enter "admin" in the "Username" input field
    Then  I enter "admin123" in the "Password" input field
    Then  I click "Sign in" button
    And   I should see "Welcome " page
    Then I verify if the following "<fields>" exists in the table

    Examples:
      | fields         |
      | id             |
      | first          |
      | last           |
      | role           |
      | department     |


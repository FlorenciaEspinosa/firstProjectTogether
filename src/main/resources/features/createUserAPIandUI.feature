Feature:Create user with API, verify user is created on UI

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page


@test1
  Scenario: Verify user is created
  Then I enter "admin" in the "Username" input field
  Then I enter "admin123" in the "Password" input field
  Then I click "Sign in" button
  And  I should see "Welcome " page
  Then verify if the following user exists in the table
    | First Name | Andrea   |
    | Last Name  | Espinosa |
    | role       | sdet     |
    | department | HR       |

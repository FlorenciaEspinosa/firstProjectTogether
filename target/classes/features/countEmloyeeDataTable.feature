Feature: Employee data table - display option

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page

# Validate admin can have option to limit the display count (10,25,50) of the Employee data table
  @admin
 Scenario Outline: Validate the admin can have option to limit the display count of the Employee data table
    Then  I enter "admin" in the "Username" input field
    Then  I enter "admin123" in the "Password" input field
    Then  I click "Sign in" button
    And   I should see "Welcome " page
    Then  I click "<buttons>" button on display options to limit the display count
    Then  I validate only "<users>" users exist from Employee data "table"
    Examples:
     | buttons | users |
     | 10      | 10    |
     | 25      | 25    |
     | 50      | 50    |

# Validate user can have option to limit the display count (10,25,50) of the Employee data table
  @user
  Scenario Outline: Validate the user can have option to limit the display count of the Employee data table
    Then  I enter "user" in the "Username" input field
    Then  I enter "user123" in the "Password" input field
    Then  I click "Sign in" button
    And   I should see "Welcome " page
    Then  I click "<buttons>" button on display options to limit the display count
    Then  I validate only "<users>" users exist from Employee data "table"
    Examples:
      | buttons | users |
      | 10      | 10    |
      | 25      | 25    |
      | 50      | 50    |

# Validate admin can have option to limit the display count (All) of the Employee data table
  @adminAll
  Scenario: Validate admin can have option to limit the display count of the Employee data table
  Then  I enter "admin" in the "Username" input field
  Then  I enter "admin123" in the "Password" input field
  Then  I click "Sign in" button
  And   I should see "Welcome " page
  And   I click button "All" and validate all users exist from the "table"

# Validate user can have option to limit the display count (All) of the Employee data table
  @userAll
  Scenario: Validate user can have option to limit the display count of the Employee data table
  Then  I enter "user" in the "Username" input field
  Then  I enter "user123" in the "Password" input field
  Then  I click "Sign in" button
  And   I should see "Welcome " page
  And   I click button "All" and validate all users exist from the "table"







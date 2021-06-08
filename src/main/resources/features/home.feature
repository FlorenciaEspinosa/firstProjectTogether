Feature: Home page

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page

    #Positive scenario add new department
  @test1
  Scenario: Add new Department
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I enter "Administration" in the "Add department" input field
    Then I click "Add" button in Enter Department section
    Then I verify the following department is displayed
      |Administration|


    #Negative scenario add existing department
  @test2
  Scenario: Adding existing Department
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I enter "Security" in the "Add department" input field
    Then I click "Add" button in Enter Department section
    Then I should see "already exists" message


    #Positive scenario delete department
  @test3
  Scenario: delete Department
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I verify the following department is displayed
      |Administration|
    Then I delete the following department
      |Administration|
    Then I verify the following department is not displayed
      |Administration|








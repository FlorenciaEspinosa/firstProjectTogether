Feature: Roles table

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page


  @test1
  Scenario: Add new Role
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I enter "student" in the "Add role" input field
    Then I click "Add" button in Enter Role section
    Then I verify the following role is displayed
      |student|



  @test2
  Scenario: Add existing Role
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I enter "sdet" in the "Add role" input field
    Then I click "Add" button in Enter Role section
    Then I should see "already exists" message in Role section


  @test3
  Scenario: Delete existing Role
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I verify the following role is displayed
      |student|
    Then I delete the following role
      |student|
    Then I verify the following role is not displayed
      |student|
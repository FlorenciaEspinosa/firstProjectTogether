Feature: Delete Role and Department

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page


    #Role

  #Positive
  @test1
  Scenario: delete role that is not assigned to anybody
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I delete the following Role
      |student|
    Then I verify the following Role is not displayed
      |student|


  #Positive
  @test2
  Scenario: delete role that is assigned to somebody
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I delete the following Role
      |sdet|
    Then I should see "Warning" pop-up




  #Department


  #Positive
  @test3
  Scenario: delete Department that is not assigned to anybody
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I delete the following department
      |test|
    Then I verify the following department is not displayed
      |test|


  @test4
  #Positive
  Scenario: delete Department that is assigned to somebody
    Then I enter "admin" in the "Username" input field
    Then I enter "admin123" in the "Password" input field
    Then I click "Sign in" button
    And  I should see "Welcome " page
    Then I delete the following department
      |Security|
    Then I should see "Warning" pop-up
    Feature: Employee Management Login Page

     Background:
        Given I navigate to Employee Management
        Then  I should see Login page

#     Validate the user can Login with a valid credentials (Positive scenario)
      @Positive1
      Scenario: Validate the user can Login with a valid credentials
         Then  I enter "user" in the "Username" input field
         Then  I enter "user123" in the "Password" input field
         Then  I click "Sign in" button
         And   I should see "Welcome " page

#     Validate the admin can Login with a valid credentials (Positive scenario)
      @Positive2
      Scenario: Validate the admin can Login with a valid credentials
        Then  I enter "admin" in the "Username" input field
        Then  I enter "admin123" in the "Password" input field
        Then  I click "Sign in" button
        And   I should see "Welcome " page


#     Validate Sign in button is disable with a empty input fields
      @Main
      Scenario: Verify Sign-in button disabled with a empty input fields
          Then I validate the "Sign-in" button disabled if no input was made




#     Login with invalid (wrong username) credentials (Negative scenarios)
      @Negative1
      Scenario: Login with invalid credentials - Invalid username
        Then  I enter "instructor" in the "Username" input field
        Then  I enter "user123" in the "Password" input field
        Then  I click "Sign in" button
        And   I should see "Invalid username"

#     Login with invalid (wrong password) credentials (Negative scenarios)
      @Negative2
      Scenario: Login with invalid credentials - Incorrect password
        Then  I enter "user" in the "Username" input field
        Then  I enter "user12345" in the "Password" input field
        Then  I click "Sign in" button
        And   I should see "Incorrect password"


#     Validate Sign in button is disable if only Username input field is not empty
      @Negative3
      Scenario: Verify Sign-in button disabled if only Username input field is not empty
        Then I validate the "Sign-in" button disable if only "user" will be in "Username" input field

#     Validate Sign in button is disable if only Password input field is not empty
      @Negative4
      Scenario: Verify Sign-in button disabled if only Password input field is not empty
        Then  I validate the "Sign-in" button disable if only "user123" will be in "Password" input field




Feature: Retrieve token

  Background:
    Given I navigate to Employee Management
    Then  I should see Login page

  @token
  Scenario: Validate the admin can have button to get an API Bearer token
    Then  I enter "admin" in the "Username" input field
    Then  I enter "admin123" in the "Password" input field
    Then  I click "Sign in" button
    And   I should see "Welcome " page
    Then  I validate "Copy Token" button is present on the page
    Then  I click "Copy Token" button
    Then  I should validate the existing token "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjoiYWRtaW4iLCJpYXQiOjE2MTg5ODM2MjEsImV4cCI6MTYxOTA3MDAyMX0.v-n7nrkC0R1boywOjFf2hiMjDVuxMIV_0l-2OCmLcGs" has changed to a new token "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjoiYWRtaW4iLCJpYXQiOjE2MTkxNDQ2OTcsImV4cCI6MTYxOTIzMTA5N30.ulAdkCdxXuu9cAe3NYRbO60F_XFi6RJn57cWUug642s"
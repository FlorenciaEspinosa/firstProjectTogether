$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/Retrievetoken.feature");
formatter.feature({
  "name": "Retrieve token",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Employee Management",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_Employee_Management()"
});
formatter.write("April 26 2021 16:39:38 PASS: Successfully navigated to url");
formatter.embedding("image/png", "embedded0.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iShouldSeeLoginPage()"
});
formatter.write("April 26 2021 16:39:38 PASS: Login page is displayed");
formatter.embedding("image/png", "embedded1.png", null);
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the admin can have button to get an API Bearer token",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@token"
    }
  ]
});
formatter.step({
  "name": "I enter \"admin\" in the \"Username\" input field",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterInTheInputField(String,String)"
});
formatter.write("April 26 2021 16:39:39 PASS: admin was entered in Username input field successfully");
formatter.embedding("image/png", "embedded2.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"admin123\" in the \"Password\" input field",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterInTheInputField(String,String)"
});
formatter.write("April 26 2021 16:39:39 PASS: admin123 was entered in Password input field successfully");
formatter.embedding("image/png", "embedded3.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Sign in\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iClickButton(String)"
});
formatter.write("April 26 2021 16:39:39 PASS: Click Sign in button ");
formatter.embedding("image/png", "embedded4.png", null);
formatter.write("April 26 2021 16:39:39 PASS: Click on Update button ");
formatter.embedding("image/png", "embedded5.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Welcome \" page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iShouldSeePage(String)"
});
formatter.write("April 26 2021 16:39:40 PASS: Welcome page is present ");
formatter.embedding("image/png", "embedded6.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate \"Copy Token\" button is present on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "RetrievetokenSteps.i_validate_button_is_present_on_the_page(String)"
});
formatter.write("April 26 2021 16:39:40 PASS: Copy Token is present on the page");
formatter.embedding("image/png", "embedded7.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Copy Token\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iClickButton(String)"
});
formatter.write("April 26 2021 16:39:40 PASS: Click Copy Token button ");
formatter.embedding("image/png", "embedded8.png", null);
formatter.write("April 26 2021 16:39:40 PASS: Click on Update button ");
formatter.embedding("image/png", "embedded9.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should validate the existing token \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjoiYWRtaW4iLCJpYXQiOjE2MTg5ODM2MjEsImV4cCI6MTYxOTA3MDAyMX0.v-n7nrkC0R1boywOjFf2hiMjDVuxMIV_0l-2OCmLcGs\" has changed to a new token \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjoiYWRtaW4iLCJpYXQiOjE2MTkxNDQ2OTcsImV4cCI6MTYxOTIzMTA5N30.ulAdkCdxXuu9cAe3NYRbO60F_XFi6RJn57cWUug642s\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RetrievetokenSteps.iShouldValidateTheExistingTokenHasChangedToANewToken(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
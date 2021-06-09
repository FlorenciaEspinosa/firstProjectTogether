$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/login.feature");
formatter.feature({
  "name": "Employee Management Login Page",
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
formatter.write("June 08 2021 21:49:31 PASS: Successfully navigated to url");
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
formatter.write("June 08 2021 21:49:31 PASS: Login page is displayed");
formatter.embedding("image/png", "embedded1.png", null);
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the user can Login with a valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Positive1"
    }
  ]
});
formatter.step({
  "name": "I enter \"user\" in the \"Username\" input field",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterInTheInputField(String,String)"
});
formatter.write("June 08 2021 21:49:31 PASS: user was entered in Username input field successfully");
formatter.embedding("image/png", "embedded2.png", null);
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"user123\" in the \"Password\" input field",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterInTheInputField(String,String)"
});
formatter.write("June 08 2021 21:49:31 PASS: user123 was entered in Password input field successfully");
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
formatter.write("June 08 2021 21:49:31 PASS: Click Sign in button ");
formatter.embedding("image/png", "embedded4.png", null);
formatter.write("June 08 2021 21:49:32 PASS: Click on Update button ");
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
formatter.write("June 08 2021 21:49:32 PASS: Welcome page is present ");
formatter.embedding("image/png", "embedded6.png", null);
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
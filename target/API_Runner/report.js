$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/API_features/CreateNewEmployees.feature");
formatter.feature({
  "name": "Create new Employees in Employee Database",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate a new user is created with basic API call",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@POST"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Request header \"Content-Type\" is set as \"application/json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "API_STEPS.request_header_is_set_as(String,String)"
});
formatter.write("2021-04-26 12:00:50 PASS: Request header Content-Type");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I set request body with following parameters",
  "rows": [
    {
      "cells": [
        "id",
        "987"
      ]
    },
    {
      "cells": [
        "firstName",
        "Andrea"
      ]
    },
    {
      "cells": [
        "lastName",
        "Espinosa"
      ]
    },
    {
      "cells": [
        "role",
        "sdet"
      ]
    },
    {
      "cells": [
        "department",
        "HR"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "API_STEPS.iSetRequestBodyWithFollowingParameters(String,String\u003e)"
});
formatter.write("2021-04-26 12:00:50 PASS: {id\u003d987, firstName\u003dAndrea, lastName\u003dEspinosa, role\u003dsdet, department\u003dHR} New user was created");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send POST Request to the resource \"/api/employees\"",
  "keyword": "Then "
});
formatter.match({
  "location": "API_STEPS.iSendPOSTRequestToTheResource(String)"
});
formatter.write("2021-04-26 12:00:52 PASS: Send POST Request to: /api/employees");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response has status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "API_STEPS.responseHasStatusCode(int)"
});
formatter.write("2021-04-26 12:00:52 PASS: Expected code 200 Actual code 200");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
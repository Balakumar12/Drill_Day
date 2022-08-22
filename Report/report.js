$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/LoginDemo.feature");
formatter.feature({
  "name": "TestProject functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check TestProject functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "user is on Test project",
  "keyword": "And "
});
formatter.step({
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user enters chennai",
  "keyword": "And "
});
formatter.step({
  "name": "user enters email balakumar59192@gmail.com",
  "keyword": "And "
});
formatter.step({
  "name": "user enters phone_number 7502672875",
  "keyword": "And "
});
formatter.step({
  "name": "user Select Country",
  "keyword": "And "
});
formatter.step({
  "name": "Hits save",
  "keyword": "Then "
});
formatter.step({
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Bala",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check TestProject functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginStep.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Test project",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginStep.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Bala and 12345",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginStep.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginStep.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters chennai",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginStep.user_enters_Address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email balakumar59192@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginStep.user_enters_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters phone_number 7502672875",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginStep.user_enters_Phone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select Country",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginStep.user_Select_Country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hits save",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginStep.user_Hits_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginStep.application_should_be_closed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
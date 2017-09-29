$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CloodOnLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "This feature deals with the login functionality of the CloodOn application",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12970538823,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login to application with valid credentials",
  "description": "",
  "id": "login-functionality;login-to-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to CloodOn login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter username and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be able to see the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.i_navigate_to_CloodOn_login_page()"
});
formatter.result({
  "duration": 6021459262,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.enter_username_and_password()"
});
formatter.result({
  "duration": 394325896,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.i_click_on_login_button()"
});
formatter.result({
  "duration": 2024373076,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.i_should_be_able_to_see_the_home_page()"
});
formatter.result({
  "duration": 10142731509,
  "status": "passed"
});
formatter.after({
  "duration": 1004329666,
  "status": "passed"
});
formatter.before({
  "duration": 9176431599,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login to application with credentials from feature file",
  "description": "",
  "id": "login-functionality;login-to-application-with-credentials-from-feature-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@TC2"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I navigate to \"http://staging.cloodon.com\" login page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Enter username as \"prabhath@cloodon.com\" and password as \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to see the home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://staging.cloodon.com",
      "offset": 15
    }
  ],
  "location": "LoginStepdefs.i_navigate_to_http_staging_cloodon_com_login_page(String)"
});
formatter.result({
  "duration": 5923035121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prabhath@cloodon.com",
      "offset": 19
    },
    {
      "val": "password",
      "offset": 58
    }
  ],
  "location": "LoginStepdefs.enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 325299728,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.i_click_on_login_button()"
});
formatter.result({
  "duration": 2085189355,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.i_should_be_able_to_see_the_home_page()"
});
formatter.result({
  "duration": 10110650924,
  "status": "passed"
});
formatter.after({
  "duration": 1022649312,
  "status": "passed"
});
});
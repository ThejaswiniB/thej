Feature: Login functionality
  This feature deals with the login functionality of the CloodOn application
@TC1
  Scenario: Login to application with valid credentials
      Given I navigate to CloodOn login page
      And Enter username and password
      And I click on login button
      Then I should be able to see the home page
@TC2
  Scenario: Login to application with credentials from feature file
    Given I navigate to "http://staging.cloodon.com" login page
    And Enter username as "prabhath@cloodon.com" and password as "password"
    And I click on login button
    Then I should be able to see the home page
@TC3
   Scenario Outline: Login test for Cloodon with multiple users

    Given I navigate to "http://staging.cloodon.com" login page
    When user logged in as  "<username>"  and  "<password>"
    And I click on login button
    Then I should be able to see the home page

    Examples:
      | username             | password |
      | prabhath@cloodon.com | password |
      | learner123           | password |
      | restricted           | password |
      | studentABC           | password |
@TC4
  Scenario: Login with credentials from data table
    Given I navigate to "http://staging.cloodon.com" login page
    When I enter the following details
      | username             | password |
      | prabhath@cloodon.com | password |
    And I click on login button



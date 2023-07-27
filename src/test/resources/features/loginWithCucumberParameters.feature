Feature: Login test with cucumber parameters
  @mikeParameter
  Scenario: Login with Mike - Cucumber Parameters
    Given The user is on the login page
    When The user logs in using "mike@gmail.com" and "mike1234"
    Then The user should be able to login

Scenario: Login with John - Cucumber Parameters


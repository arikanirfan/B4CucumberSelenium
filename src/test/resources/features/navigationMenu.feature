@regression
Feature: Navigation Menu Tests

  @mike
  Scenario: Navigation to Developers Menu
    Given The user is on the login page
    When Login as Mike
    Then Validate that Dasboard text is visible
    When Go to developers menu
    Then Validate that Developers text is visible
  @sebastian @smoke
    Scenario: Navigation to Forms/Input menu
      Given The user is on the login page
      When Login as Sebastian
      Then Validate that Dasboard text is visible
      When Go to forms-Input menu
      Then Validate that Genaral Form Elements -Input text is visible
    @john
    Scenario: Navigation to My Profile Menu
      Given The user is on the login page
      When Login as John
      Then Validate that Dasboard text is visible
      When Go to my profile menu
      Then Verify that User Profile text is visible




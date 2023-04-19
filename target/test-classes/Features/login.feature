Feature: As a user I want to login in app
  so that I can see my personal details

  @Smoke
  Scenario: Unsuccessfully login
    Given I open login page
    When I fill login "yurii@gmail.com"
    And I fill password "password1"
    And I click submit
    Then I see all is good

  @Smoke
  Scenario Outline: Unsuccessfully login1
    Given I open login page
    When I fill login "<login>"
    And I fill password "<pass>"
    Then I see all is good
    Examples:
      | login          | pass |
      | Friday         | TGIF |
      | Sunday         | Nope |
      | anything else! | nOPE |
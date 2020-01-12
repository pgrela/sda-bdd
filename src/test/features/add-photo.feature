Feature: Adding photos with description
  As a user
  I want to share my pictures
  so that my friends can enjoy it

  Background:
    Given I am logged on facebook

  Scenario: Add photo with description
    And a window for adding photos is open
    When I upload photo with description "opis zdjęcia"
    Then photo with description is published on my profile

  @smokeTest @regressionTest @mojetesty
  Scenario Outline: should add numbers <a> to <b>
    When add <a> to <b> result is <result>
    Examples:
      | a | b | result |
      | 1 | 2 | 3      |


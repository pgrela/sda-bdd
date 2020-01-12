Feature: Adding numbers

  As a user I want to use calculator to add numbers, so I do not do it myself

  Scenario Outline: Should add positive numbers
    When I add <a> and <b>
    Then I see <sum> as a result
    Examples:
      | a | b | sum |
      | 5 | 6 | 11  |
      | 2 | 7 | 9   |

    @dymne
  Scenario Outline: Should sub positive numbers
    When I sub <a> and <b>
    Then I see <difference> as a result
    Examples:
      | a | b | difference |
      | 5 | 6 | -1         |
      | 2 | 7 | -5         |

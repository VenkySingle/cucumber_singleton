Feature: Login into application

  @smoke
  Scenario: Login into Valid Username and Password
    Given Enter username as "test"
    And password as "test"
    When clicking login button
    Then Login is successful and validation is success as "search art"

  @smoke
  Scenario Outline: Login into invalid Username and Password
    Given Enter username as "<name>"
    And password as "<pass>"
    When clicking login button
    Then Login is successful and validation is successful as "<expected>"


    Examples: 
      | name  | pass | expected |
      | tests | test | If you are already registered please enter your login information below:|
      | test  | tests| If you are already registered please enter your login information below:|

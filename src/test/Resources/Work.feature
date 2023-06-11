Feature: Login into application and find the cart

  @smoke
  Scenario: cart check
    Given Enter username as "test"
    And password as "test"
    When clicking login button
    Then Login is successful and validation is success as "search art"
    When Clicking Cart
    Then Find the Price
    |Text|
    |Total: $0|
    

Feature: User should able to see sorted price from high to low

  @filterHighToLow
  Scenario: User should be able to sort product high to low by price
    Given User is on Home Page
    When User click on sort by filter and selects high to low filter
    Then User should able to see sorted product price from high to low.
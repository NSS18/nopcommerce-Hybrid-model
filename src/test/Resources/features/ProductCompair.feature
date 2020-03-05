Feature: User should able to compare two products successfully and able to see 'compare products' text

  @compare
  Scenario: User should be able to compare two products successfully
  Given User is on electronics page
    When User selects two products for comparision
    Then User should able to compare successfully

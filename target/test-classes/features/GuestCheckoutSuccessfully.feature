Feature: Guest User should be able to checkout successfully on demo nopcommerce website and able to see successful checkout message

  @guestCheckoutSuccessfully
  Scenario: User should be able to Checkout successfully with all compulsory fields
    Given User is on Home Page
    When User adds product in the cart
    And User checkout as a guest
    And User fills all compulsory fields and clicks confirm
    Then User should able to see successful order message
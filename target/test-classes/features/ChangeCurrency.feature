Feature: User should able to change the currency and able to see all products price with changed currency.

  @currencyChange
  Scenario: User should able to see product prices  with selected currency symbol
  Given User is on Home Page
  When User selects currency
  Then User should able to see product prices with that currency symbol
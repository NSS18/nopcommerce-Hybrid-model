Feature: User(Non registered) should not be able to refer a product to a friend and should able to see error message -"Only registered customers can use email a friend feature"

 @referProductUnsuccessful
  Scenario: User should not be able to refer product to the friend successfully
    Given User is on Home Page
    When User(non register) selects product and fill all details
    And User Clicks on send email button
    Then User should  able to see unsuccessful message
Feature: User(Registered) should be able to refer a product to a friend and able to see message "Your message has been sent."

  @referProduct
  Scenario:User should be able to refer product to the friend successfully
 Given User is on Home Page
    When User selects product and fill all details
    And Clicks on send email button
    Then User should able to see message "Your message has been sent."
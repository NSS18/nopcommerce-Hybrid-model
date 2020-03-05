Feature: User should able to add new comment successfully and able to see comment successful messege.

  @addProductComment
  Scenario: User should be able to comment successfully
    Given User is on Home Page
    When User selects product and add the comment
    And User clicks on New comment button
    Then User should able to see successful message
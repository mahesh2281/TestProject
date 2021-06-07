Feature: Order Workflow
  In order for items to be purchased
  As product owner,
  I require a customer ordering work flow to be in place

  Scenario: Customer is able to order an item and verify the purchase in order history
    Given I have signed in
    And I have added a t-shirt to my shopping cart
    When I confirm payment for my order
    Then the purchase is successful
    And the item is displayed in order history
@all
Feature: Adding highest price item to the cart

  @addToCart
  Scenario: Add product item with highest price to the cart
    Given user is on Swaglab page
    When I enter with valid credentials
    Then I should see home page
    And I select product item with highest price to the cart
    And I should see notification
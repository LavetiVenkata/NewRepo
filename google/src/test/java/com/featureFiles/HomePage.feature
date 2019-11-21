Feature: HomePage

  Scenario: Check whether user is able to shop an item or not
    Given Launch "https://vandelaypromotions.commonsku.com/shop/761d0f51-3802-491e-8b52-21a12ed93033" on "chrome" browser
    When I want to enter into shopping page
    And Add "1" item "Google Fitted Tee" of size "L" Shop to Cart page
    And I navigate to Cart page
    Then veify the added "Google Fitted Tee" item on Cart page
    
   Scenario: Check whether user is able to shop multiple items or not
    Given Launch "https://vandelaypromotions.commonsku.com/shop/761d0f51-3802-491e-8b52-21a12ed93033" on "chrome" browser
    When I want to enter into shopping page
    And Add "1" item "Google Fitted Tee" of size "L" Shop to Cart page
    And Add "1" item "Classic Google Crew" of size "L" Shop to Cart page
    And I navigate to Cart page
    Then veify the added "Google Fitted Tee" item on Cart page
    Then veify the added "Classic Google Crew" item on Cart page
    
  Scenario: Check whether user is able to delete cart items
    Given Launch "https://vandelaypromotions.commonsku.com/shop/761d0f51-3802-491e-8b52-21a12ed93033" on "chrome" browser
    When I want to enter into shopping page
    Then veify the added "Google Fitted Tee" item on Cart page
    And I navigate to Cart page
    And Delete the added item
    Then veify the added "Classic Google Crew" item on Cart page
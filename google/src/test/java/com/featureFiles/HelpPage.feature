Feature: HelpPage validation

  Scenario: Check whether user is able to get a help or not
    Given Launch "https://vandelaypromotions.commonsku.com/shop/761d0f51-3802-491e-8b52-21a12ed93033" on "chrome" browser
    And I navigate to Help page
    And i want to start shopping
    When I want to enter into shopping page
    And Add "1" item "Google Fitted Tee" of size "L" Shop to Cart page
    And I navigate to Cart page
    Then veify the added "Google Fitted Tee" item on Cart page
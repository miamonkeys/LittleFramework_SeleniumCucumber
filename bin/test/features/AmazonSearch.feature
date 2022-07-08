@Amazon

Feature: Test Amazon search funcionality

Scenario Outline: As a customer I search for products, I want to see if the third option on the second page is available
for
purchase and can be added to the cart.

    Given The user navigates to www.amazon.com
    And Search for <Product>
    And Navigates to the second page
    And Selects the 3 option
    Then The user is able to add it to the cart

    Examples:
        |Product    |
        |Alexa      |
        |Playstation|

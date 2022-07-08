@test
Feature: Validate elements of a list

Scenario Outline: As a test engineer, I want to validate that a text is present inside the list
    Given I navigate to the list web page.
    When I write <stateToSearch>.
    Then I find <cityToFind> in the list.

    Examples:
    |stateToSearch|cityToFind       |
    |Texas        |Houston, Texas   |
    |Arizona      |Chandler, Arizona|
    
Feature: Test DuckDuckGo search functionality

 Scenario: As a user, I enter a search criteria in DuckDuckGo
   Given I am on the DuckDuckGo search page.
   When I enter a search criteria.
   And I click on the search button.
   Then The results match the criteria.

Scenario: As a user, I want to see the country switch
   Given I am on the DuckDuckGo search page.
   When I enter a search criteria.
   And I click on the search button.
   Then Is the country switch displayed?

Scenario: As a user, I want to click the search button
   Given I am on the DuckDuckGo search page.
   Then Is the search button enabled?


@SearchAll
Feature: Search Functionality

  @Search @ProductSearch
  Scenario: search a product

    Given user goes to homepage
    When user search for "mac"
    Then products' names should contain "mac"
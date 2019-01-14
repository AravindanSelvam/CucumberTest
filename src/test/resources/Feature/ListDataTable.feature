Feature: Test ListDataTable

   Scenario: Title of your scenario
    Given The user is in the telecom home page
    And The user navigates to add tariff plan page
    When The user fills in the tariff plan details
    			|499|1000|500|3000|1|10|1|
    And The user clicks submit button
    Then The user sees the success message
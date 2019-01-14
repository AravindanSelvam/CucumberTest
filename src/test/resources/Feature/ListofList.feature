Feature: Test List of List

  Scenario: Adding mulitple row in list
     Given The user is in the telecom home page1
    And The user navigates to add tariff plan page1
    When The user fills in the tariff plan details1
    			|499|1000|500|3000|1|10|1|
    			|599|10000|700|8000|1|5|1|
    And The user clicks submit button1
    Then The user sees the success message1
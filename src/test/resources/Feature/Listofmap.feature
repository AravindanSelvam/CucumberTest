Feature: Test List of map
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given The user is in the telecom home page2
    And The user navigates to add tariff plan page2
    When The user fills in the tariff plan details2
      		|MR	|FLM|FIM|FSP|LPMC|IPMC|SPC|
    			|499|1000|500|3000|1|10|1|
    			|599|10000|700|8000|1|5|1|
    And The user clicks submit button2
    Then The user sees the success message2
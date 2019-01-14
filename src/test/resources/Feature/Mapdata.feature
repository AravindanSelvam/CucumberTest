Feature: Test MapDataTable
  
 Scenario: TrariffPlans
    Given The user is in the gurutelecom page
    And The user goes to add customer page
    When The user fills in the customer page
    |MR	|499|
    |FLM|1000|
    |FIM|500|
    |FSP|3000|
    |LPMC|1|
    |IPMC|10|
    |SPC|1|
    And The user click submit button
    Then The user should see the success message in final page
Feature: Test scenario outline

  Scenario Outline: Title of your scenario outline
    Given The user is in the telecom home page s
    And The user navigates to add tariff plan page s
    When The user fills in the tariff plan detailss "<MR>","<FLM>","<FIM>","<FSP>","<LPMC>","<IPMC>","<SPC>"
    And The user clicks submit button s
    Then The user sees the success message s
   
    Examples: 
      |MR	|FLM|FIM|FSP|LPMC|IPMC|SPC|
    	|499|1000|500|3000|1|10|1|
   		|599|10000|700|8000|1|5|1|
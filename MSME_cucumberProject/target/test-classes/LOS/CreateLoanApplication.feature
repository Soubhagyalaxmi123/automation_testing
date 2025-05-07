Feature: Create loan application

  Scenario: Create Loan application succefully
    Given user is in the loan application screen
    And user enters all necessary fields
    When clicks on save button
    Then Loan application should be created successfully
    And user clicks on proceed to dde button
    Then user should moved from QDE to DDE stage

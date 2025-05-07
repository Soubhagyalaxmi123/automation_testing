Feature: Loan Sanction Conditions

  Scenario: Add Condition to Loan Sanction
    Given the user is logged into the application
    When the user navigates to the Loan Origination module
    And the user clicks on Loan Management
    And the user selects Credit L2
    And the user opens the Loan Application
    And the user navigates to the Credit tab
    And the user clicks on Loan Sanction and scrolls down the page
    And the user clicks on Add Condition
    When the user enters the condition and clicks on the Save button
    Then the user should be able to add conditions successfully

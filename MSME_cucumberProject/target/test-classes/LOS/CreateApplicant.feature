Feature: Applicant Management

  Scenario: Successfully create an applicant
    Given the user logs into the application
    And navigates to the Loan Origination System
    Then the user clicks on New Loan Application
    And selects the state, cluster, and branch
    And enters all necessary details
    When the user clicks on the Save button
    Then the applicant should be created successfully
    Given user is in the loan application screen
    And user enters all necessary fields
    When clicks on save button
    Then Loan application should be created successfully
    And user clicks on proceed to dde button
    Then user should moved from QDE to DDE stage
    
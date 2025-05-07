Feature: Add Geo-Location Distance Details

  Background: User logs into the application
    Given User is in the login page

  Scenario: Add geo-location distance details for main applicants address successfully
    Given the user is on the residence address page of the main applicant
    When the user adds the main applicants current and permanent addresses
    Then the main applicants current and permanent addresses should be displayed on the loan application screen

  Scenario: Add geo-location distance details for co-applicants address successfully
    Given the user is on the residence address page of the co-applicant
    When the user adds the co-applicants current and permanent addresses
    Then the co-applicants current and permanent addresses should be displayed on the loan application screen

  Scenario: Add geo-location distance details for guarantors address successfully
    Given the user is on the residence address page of the guarantor
    When the user adds the guarantors current and permanent addresses
    Then the guarantors current and permanent addresses should be displayed on the loan application screen

  Scenario: Add geo-location distance details for collateral successfully
    Given the user is on the add collateral page
    When the user adds a collateral address
    Then the collaterals address should be displayed on the loan application screen

  Scenario: Add geo-location distance details for PD location successfully
    Given the user is on the PD questionnaire page
    When the user adds geo-location details for PD
    Then the PD address should be displayed on the loan application screen

  Scenario: Add geo-location distance details for vendor verification successfully
    Given the user is on the vendor verification page
    When the user adds geo-location details for vendor verification
    Then the vendor verification address should be displayed on the loan application screen

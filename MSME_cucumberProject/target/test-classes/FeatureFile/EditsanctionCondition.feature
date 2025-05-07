Feature: Edit Loan sanction condition

  Scenario: Edit an existing sanction condition
    Given the user is on the loan sanction page
    When the user clicks the "Edit Sanction" button
    And updates the sanction condition and changes the status
    And clicks the "Save" button
    Then the sanction condition should be successfully updated, and its status should be changed to Complete.

  
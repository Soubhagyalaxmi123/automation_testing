Feature: Delete Sanction Condition

  Scenario: Delete Sanction Condition Successfully
    Given User is on loan sanction page
    When user clicks on delete sanction condition
    Then the sanction condition should deleted successfully
    Then the sanction condition should be removed from the list
    And I should see a message Sanction condition deleted successfully

  Scenario: Cancel the sanction condition deletion
    And I cancel the deletion in the confirmation popup
    Then the sanction condition should remain in the list
    And I should not see any deletion confirmation message

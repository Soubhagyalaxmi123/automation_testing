Feature: Sanction condition Vetting

  Background: 
   
    When the user navigates to the Loan Origination module
    And the user clicks on Loan Management
    And the user selects Credit L2
    And the user opens the Loan Application
    And the user navigates to the Credit tab
    And the user clicks on Loan Sanction and scrolls down the page

  #ADD SANCTION CONDITION
  Scenario: Add Condition to Loan Sanction
    And the user clicks on Add Condition
    When the user enters the condition and clicks on the Save button
    Then the user should be able to add conditions successfully

  #EDIT SANCTION CONDITION
  Scenario: Edit an existing sanction condition
    When the user clicks the Edit Sanction button
    And updates the sanction condition and changes the status
    And clicks the Save button
    Then the sanction condition should be successfully updated, and its status should be changed to Complete.

  #UPLOAD IMAGE UNDER SANCTION CONDITION
  Scenario: Successfully image upload with a single image
    Then user click on image upload icon
    And upload image with remark
    And Click on save button
    When user click on Image icon
    Then it should display the uploaded image

  Scenario: Successfully image upload with a multiple image
    Then user click on image upload icon
    And upload image with remark
    And Click on save button
    When user click on Image icon
    Then it should display the uploaded images

  #DELETE SANCTION CONDITION
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

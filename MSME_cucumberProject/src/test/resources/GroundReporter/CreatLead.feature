Feature: Create lead successfully

  Scenario: Lead Created successfully
    Given User login to the application
    Then User clicks on ground reporter
    And User clicks on create lead
    Then User enters all the neccessary details
    When User clicks on save button
    Then Lead should created succefully
          
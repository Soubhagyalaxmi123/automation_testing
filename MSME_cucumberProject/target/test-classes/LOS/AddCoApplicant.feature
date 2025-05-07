Feature: Add co-applicant

  Scenario: Add coapplicant successfully
    Given User login to the application
    And User click on los
    And User click on manage application
    And user eneters the application id in search bar
    And User clicks on applicant and then click on add applicant
    When user enters all necessary details and clicks on save button
    Then co applicant should add succesfully

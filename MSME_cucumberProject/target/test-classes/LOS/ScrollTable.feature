Feature: Scroll the table

  Scenario: scroll the table succesfully
    Given user login to the application
    And user click on los
    When user click on manage loan application
    Then user scroll the table and fetch the applicant name succefully

Feature: Login page automation of msme

  Scenario: Check login with successful with valid credentials
    Given User is in the login page
    When user enters vaalid "<username>" and "<password>"
    And Clicks on login button
    Then user is navigate to dashboard page
    And close the browser
Examples:
|username| password|
|FMF049872|FMF049872|
|TEST@123|FMF049872|
|Fmf049872|TEST@123|
|FMF049872|Test@123|
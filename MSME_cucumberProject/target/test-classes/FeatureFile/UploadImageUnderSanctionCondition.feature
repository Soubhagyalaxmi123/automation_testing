Feature: image upload under sanction condition

  Scenario: Successfully image upload with a single image
    Given user is on loan sanction page
    Then user click on image upload icon
    And upload image with remark
    And Click on save button
    When user click on Image icon
    Then it should display the uploaded image

  Scenario: Successfully image upload with a multiple image
    Given user is on loan sanction page
    Then user click on image upload icon
    And upload image with remark
    And Click on save button
    When user click on Image icon
    Then it should display the uploaded images

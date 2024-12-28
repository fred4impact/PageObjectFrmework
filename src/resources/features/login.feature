Feature: Login Functionality



  @smokeTest @functionalTest @Critical
  Scenario: Valid login
    Given the user is on the login page
    When the user enters valid credentials "standard_user" and "secret_sauce"
    Then the user is redirected to the products page









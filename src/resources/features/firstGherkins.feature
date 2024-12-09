Feature: Login Feature to be tested
  Background: action that should have happend before login Before logging a user must create an acount

    Scenario: Successful User Login  Test case
      Given Am on the saucedemo application url
      When I enter a valid username "standard_user"
      And  I enter a valid password "secret_sauce"
      Then what do you want to see Verification and assertion will happen


#  Scenario: Unsuccessful User Test case
#    Given Pre-contidion
#    When the condition to te bested or action to be performed
#    And A must happed action tat iw when you use these
#    But an  optional condition
#    Then The result you wantnto see happene
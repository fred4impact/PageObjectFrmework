#Feature: Login Functionality
#
#  Scenario Outline: Valid Success login
#    Given the user is on the login page
#    When the user enters valid credentials "<username>" and "<password>"
#    Then the user is redirected to the products page
#
#    Examples:
#      | username       | password      |
#      | standard_user  | secret_sauce  |
#      | locked_out_user| secret_sauce  |

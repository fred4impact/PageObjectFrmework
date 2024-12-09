Feature New Account Creation

 Background As a new visitor, I want to create an account
   using my email address so that i can access members only


   Scenario: New user account creation with email only
     Given user is on the easy website
     When a user enter a valid amail "email@gmail.com" and click the create button
     Then User should see access members-only Dashboard displayed


  Scenario Outline: New user account creation with email only
       Given user is on the easy "<url>"
       When a user enter a valid "<email>" and click the create button
       Then User should see access "<members-only>" Dashboard displayed

       Examples:
         | url              | email                 | members-only               |
         | www.sebsite2.com | godwin@gmail.com      | easymembers-only-dashboard |
         | www.sebsite2.com | secondemail@gmail.com | non-members-dashboard      |





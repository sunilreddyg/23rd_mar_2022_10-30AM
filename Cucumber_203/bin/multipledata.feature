Feature:  Admin login

Scenario: Admin Login with Valid Credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters Credentials to LogIn
    | user1 | pwd1 |
    | user2 | pwd2 |
    | user3 | pwd3 |
    | user4 | pwd4 |
    | user5 | pwd5 |
 Then Message displayed Login Successfully
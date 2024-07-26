Feature: Create facebook account

Scenario: Create new facebook account
Given Launch the facebook URL
Then Provide user details
And Sign Up

Scenario: Login the new facebook account
Given Launch the facebook1 URL
When Enter the username and password with 1D
|8610451628|
|Welcome1*|

Scenario Outline: checking the username and password
Given User is on facebook login page
When Users enters the valid credntials "<username>" and "<password>" for user login
And User Click the Login button

Examples:
|username                 |    password |
|chithurose92@gmail.com   |    Welcome1* |
|chitra.lingam05@gmail.com|    LOOcast1* |









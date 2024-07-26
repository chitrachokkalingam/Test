Feature: Checking the login functionality

Scenario Outline: checking the username and password
Given User is on facebook login page
When Users enters the valid credntials "<username>" and "<password>" for user login
And User Click the Login button

Examples:
|       username          |    password  |
|chithurose92@gmail.com   |    Welcome1* |
|chitra.lingam05@gmail.com|    LOOcast1* |


Scenario Outline: Checking the username and password
Given Login the instagram page
When Users enter the valid credntials "<username>" and "<password>"  for user login

|   username   |   Password   |
|   chitra     |   Welcome1*  |
|   Aadvik     |   Welcome    |       



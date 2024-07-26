Feature: flipkart functionality with 1D
Scenario: Checking username and password
Given  checking facebook login using "Chrome" browser
When User enters the "<type>" credentials "<username>" and "<password>"  for user login
|username|password|type|
|chitra1|Welcome1* |valid|
|chitra|Welcome1* |invalid|
|Aadvik|Welcome2* |valid|
|Venpa|Welcome3* |valid|

Scenario: login the facebook
Given checking the username and password
When Enters the "<username>" and "<password"> for user login
|username|password|
|chitra|loocast1|
|aadvik|Welcome1|




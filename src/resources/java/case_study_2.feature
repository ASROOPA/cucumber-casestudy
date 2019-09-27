Feature: user Log-in 
Scenario Outline: log-in for different users
Given user is in log-in page
When user enters valid login credentials for <username> and <password> 
Then user re-directed to Home page
Examples:
|username||password|
|lalitha||Password123|
|asroopa97||ash123|
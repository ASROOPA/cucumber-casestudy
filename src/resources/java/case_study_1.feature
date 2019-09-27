Feature: user registeration

Scenario: User sign-in

Given user enters sign-up page
When user enters valid user name as "asroopa97"
And user enters First name as "Asroopa"
And user enters Last name as "Basini"
And user enters Password as "ash123"
And user enters confirm password as "ash123"
And user clicks gender as "female"
And user enters email as "asroopab@gmail.com"
And user enters mobile number as "8838309039"
And user enters dob as "31/12/1997"
And user enters address as "Coimbatore"
And user selects security questions as "what is your birth place?"
And user enters answers as "Pollachi"
And user clicks enter button
Then user re-directed to login page
Feature: Search Engine



Scenario: Successful Search

Given Alex logged in and clicks the search button
When Alex enters available product name's four letter
And selects the product from the list and clicks search button
And  Alex redirected to the product page
And Alex clicks the cart symbol
Then Alex views the checkout page

Scenario: Unsuccessful search

Given Alex logged in and clicks search button
When Alex enters non-available product name's four letter
Then no products found will be displayed




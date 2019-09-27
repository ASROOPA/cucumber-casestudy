Feature: Search Engine



Scenario: Successful Search

Given Alex logged in and clicks the search button
When Alex enters available product name's four letter
And selects the product from the list and clicks search button
Then  Alex redirected to the product page


Scenario: Unsuccessful search

Given Alex logged in and clicks search button
When Alex enters non-available product name's four letter
Then no products found will be displayed


Scenario: add to cart

Given alex logged in 
When alex searches headphones 
And try to proceed to purchase
Then purchase is disable as no items added to cart
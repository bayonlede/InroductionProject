Feature: Getting Tomato with the word tom

Scenario: Search product with short word
Given user search a product with short word on Greencart page
And user search with the same short word on Top deal page
Then user verifies the names displayed

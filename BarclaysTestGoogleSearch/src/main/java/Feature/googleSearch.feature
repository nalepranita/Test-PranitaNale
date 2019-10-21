Feature: Google Search

Scenario: Search for Barclays on google.com

Given I have chrome browser opened
When I go to https://www.google.com/
And I type Barclays into search bar
And I hit search
Then https://www.barclays.co.uk/ is first url on search results

                  
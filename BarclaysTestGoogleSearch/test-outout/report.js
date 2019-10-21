$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/LogFiles/Selenium/BarclaysTestGoogleSearch/src/main/java/Feature/googleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search for Barclays on google.com",
  "description": "",
  "id": "google-search;search-for-barclays-on-google.com",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have chrome browser opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to https://www.google.com/",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I type Barclays into search bar",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I hit search",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "https://www.barclays.co.uk/ is first url on search results",
  "keyword": "Then "
});
formatter.match({
  "location": "googleSearchStepDefinition.i_have_chrome_browser_opened()"
});
formatter.result({
  "duration": 8995007900,
  "status": "passed"
});
formatter.match({
  "location": "googleSearchStepDefinition.i_go_to_https_www_google_com()"
});
formatter.result({
  "duration": 1731069100,
  "status": "passed"
});
formatter.match({
  "location": "googleSearchStepDefinition.i_type_Barclays_into_search_bar()"
});
formatter.result({
  "duration": 266424000,
  "status": "passed"
});
formatter.match({
  "location": "googleSearchStepDefinition.i_hit_search()"
});
formatter.result({
  "duration": 2086636300,
  "status": "passed"
});
formatter.match({
  "location": "googleSearchStepDefinition.https_www_barclays_co_uk_is_first_url_on_search_results()"
});
formatter.result({
  "duration": 71770700,
  "status": "passed"
});
});
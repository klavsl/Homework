$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/MainTests.feature");
formatter.feature({
  "name": "Homework",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@homework"
    }
  ]
});
formatter.scenario({
  "name": "Check ID uniqueness for Land for Sale:",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homework"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.openMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I under deal type \"For sale\" go to real estate type \"Land\"",
  "keyword": "When "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.goToSection(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see all IDs on the first page are unique",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.checkIDUniqueness()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the last page",
  "keyword": "When "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.goToLastPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see all IDs on the first page are unique",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.checkIDUniqueness()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test for Price ascending:",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homework"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.openMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I under deal type \"For rent / lease\" go to real estate type \"Apartment\"",
  "keyword": "When "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.goToSection(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on sort by \"price\"",
  "keyword": "And "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.SortBy(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "price is ascending",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.priceIsAscending()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the last page",
  "keyword": "When "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.goToLastPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "price is ascending",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.priceIsAscending()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test for Prices descending:",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homework"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.openMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I under deal type \"For sale\" go to real estate type \"Apartment\"",
  "keyword": "When "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.goToSection(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on sort by \"price\"",
  "keyword": "And "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.SortBy(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on sort by \"price\"",
  "keyword": "And "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.SortBy(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "price is descending",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.priceIsDescending()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the last page",
  "keyword": "When "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.goToLastPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "price is descending",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.priceIsDescending()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing favorites section:",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homework"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the site is open",
  "keyword": "Given "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.openMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I under deal type \"For sale\" go to real estate type \"Land\"",
  "keyword": "When "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.goToSection(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add an item to favourites",
  "keyword": "And "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.addItemToFavourites()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I return to the main page",
  "keyword": "When "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.openMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I under deal type \"For sale\" go to real estate type \"Apartment\"",
  "keyword": "And "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.goToSection(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add an item to favourites",
  "keyword": "And "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.addItemToFavourites()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I return to the main page",
  "keyword": "When "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.openMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I under deal type \"For sale\" go to real estate type \"House\"",
  "keyword": "And "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.goToSection(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add an item to favourites",
  "keyword": "And "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.addItemToFavourites()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the favourites section",
  "keyword": "And "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.goToFavourites()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see \"3\" items",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.seeNumberOfItems(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove an item from the favourites section",
  "keyword": "When "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.removeFavouriteItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see \"2\" items",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.steps.MainPageSteps.seeNumberOfItems(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
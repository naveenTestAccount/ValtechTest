$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PageHeader.feature");
formatter.feature({
  "line": 1,
  "name": "Page Header Validation",
  "description": "",
  "id": "page-header-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "page validation",
  "description": "",
  "id": "page-header-validation;page-validation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user go to \u003cpagetype\u003e page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user search for page header text",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user verifies page header \u003ccontent\u003e in the page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "page-header-validation;page-validation;",
  "rows": [
    {
      "cells": [
        "pagetype",
        "content"
      ],
      "line": 13,
      "id": "page-header-validation;page-validation;;1"
    },
    {
      "cells": [
        "About",
        "About"
      ],
      "line": 14,
      "id": "page-header-validation;page-validation;;2"
    },
    {
      "cells": [
        "Work",
        "Work"
      ],
      "line": 15,
      "id": "page-header-validation;page-validation;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 7540424418,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "page validation",
  "description": "",
  "id": "page-header-validation;page-validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user go to About page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user search for page header text",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user verifies page header About in the page",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "About",
      "offset": 11
    }
  ],
  "location": "PageHeaderSteps.user_go_to_About_page(String)"
});
formatter.result({
  "duration": 5564787081,
  "status": "passed"
});
formatter.match({
  "location": "PageHeaderSteps.user_search_for_page_header_text()"
});
formatter.result({
  "duration": 80379527,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "About",
      "offset": 26
    }
  ],
  "location": "PageHeaderSteps.user_verifies_page_header_About_in_the_page(String)"
});
formatter.result({
  "duration": 18417782,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_browser()"
});
formatter.result({
  "duration": 654593824,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 6778859734,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "page validation",
  "description": "",
  "id": "page-header-validation;page-validation;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user go to Work page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user search for page header text",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user verifies page header Work in the page",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Work",
      "offset": 11
    }
  ],
  "location": "PageHeaderSteps.user_go_to_About_page(String)"
});
formatter.result({
  "duration": 1438843916,
  "status": "passed"
});
formatter.match({
  "location": "PageHeaderSteps.user_search_for_page_header_text()"
});
formatter.result({
  "duration": 71144201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Work",
      "offset": 26
    }
  ],
  "location": "PageHeaderSteps.user_verifies_page_header_About_in_the_page(String)"
});
formatter.result({
  "duration": 18590701,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_browser()"
});
formatter.result({
  "duration": 683102198,
  "status": "passed"
});
formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Valtech Homepage",
  "description": "",
  "id": "valtech-homepage",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 6790490740,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User is one homepage and verify whether Latest News section is displaying",
  "description": "",
  "id": "valtech-homepage;user-is-one-homepage-and-verify-whether-latest-news-section-is-displaying",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user validates homepage title",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user search for latest news section on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user able to see latest news successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_validates_homepage_title()"
});
formatter.result({
  "duration": 12735078,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_search_for_latest_news_section_on_homepage()"
});
formatter.result({
  "duration": 39903016,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_able_to_see_latest_news_successfully()"
});
formatter.result({
  "duration": 31235587,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_browser()"
});
formatter.result({
  "duration": 661175646,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 6274022811,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Find contact us page",
  "description": "",
  "id": "valtech-homepage;find-contact-us-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user scroll to contact us",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user verify branches details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_scroll_to_contact_us()"
});
formatter.result({
  "duration": 86831660,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_verify_branches_details()"
});
formatter.result({
  "duration": 31627454,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_browser()"
});
formatter.result({
  "duration": 661730792,
  "status": "passed"
});
});
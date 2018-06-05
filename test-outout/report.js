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
  "line": 11,
  "name": "",
  "description": "",
  "id": "page-header-validation;page-validation;",
  "rows": [
    {
      "cells": [
        "pagetype",
        "page header",
        "content"
      ],
      "line": 12,
      "id": "page-header-validation;page-validation;;1"
    },
    {
      "cells": [
        "About",
        "About",
        "About"
      ],
      "line": 13,
      "id": "page-header-validation;page-validation;;2"
    },
    {
      "cells": [
        "Work",
        "Work",
        "Work"
      ],
      "line": 14,
      "id": "page-header-validation;page-validation;;3"
    },
    {
      "cells": [
        "Services",
        "Services",
        "Services"
      ],
      "line": 15,
      "id": "page-header-validation;page-validation;;4"
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
  "duration": 7110974451,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "page validation",
  "description": "",
  "id": "page-header-validation;page-validation;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user go to Services page",
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
  "name": "user verifies page header Services in the page",
  "matchedColumns": [
    2
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
      "val": "Services",
      "offset": 11
    }
  ],
  "location": "PageHeaderSteps.user_go_to_About_page(String)"
});
formatter.result({
  "duration": 913969656,
  "status": "passed"
});
formatter.match({
  "location": "PageHeaderSteps.user_search_for_page_header_text()"
});
formatter.result({
  "duration": 30088691042,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//header[@class\u003d\u0027page-header\u0027]/h1\"}\n  (Session info: chrome\u003d66.0.3359.181)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-0VEF8N2\u0027, ip: \u0027192.168.0.25\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\niksa\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.181, webStorageEnabled: true}\nSession ID: d78d75be53910447d058e4e0ddda3166\n*** Element info: {Using\u003dxpath, value\u003d//header[@class\u003d\u0027page-header\u0027]/h1}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat com.qa.util.TestBase.getPageHeader(TestBase.java:57)\r\n\tat com.qa.stepdefinitions.PageHeaderSteps.user_search_for_page_header_text(PageHeaderSteps.java:58)\r\n\tat ✽.When user search for page header text(PageHeader.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Services",
      "offset": 26
    }
  ],
  "location": "PageHeaderSteps.user_verifies_page_header_About_in_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});
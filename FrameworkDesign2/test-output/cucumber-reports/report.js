$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/AgileTravelFeature.feature");
formatter.feature({
  "name": "gile travel website BDD testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "One way flight",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Onewaytest"
    }
  ]
});
formatter.step({
  "name": "user selects Trip Type",
  "keyword": "Given "
});
formatter.step({
  "name": "user selects from \"\u003corigin\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user selects to \"\u003cdestintion\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user selects day \"\u003cday\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user select month \"\u003cmonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click on continue button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "origin",
        "destintion",
        "day",
        "month"
      ]
    },
    {
      "cells": [
        "New York",
        "Sydney",
        "05",
        "December 2016"
      ]
    },
    {
      "cells": [
        "Sydney",
        "New York",
        "05",
        "December 2016"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user go to url \"http://travel.agileway.net/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TravelSiteSteps.launchurl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username \"agileway\"",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_enters_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password \"testwise\"",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_enters_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check the remember checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_check_the_remember_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_click_on_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "One way flight",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Onewaytest"
    }
  ]
});
formatter.step({
  "name": "user selects Trip Type",
  "keyword": "Given "
});
formatter.match({
  "location": "TravelSiteSteps.user_selects_Trip_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects from \"New York\"",
  "keyword": "When "
});
formatter.match({
  "location": "TravelSiteSteps.user_selects_from(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects to \"Sydney\"",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_selects_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects day \"05\"",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_selects_day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select month \"December 2016\"",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_select_month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user go to url \"http://travel.agileway.net/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TravelSiteSteps.launchurl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username \"agileway\"",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_enters_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password \"testwise\"",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_enters_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check the remember checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_check_the_remember_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_click_on_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "One way flight",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Onewaytest"
    }
  ]
});
formatter.step({
  "name": "user selects Trip Type",
  "keyword": "Given "
});
formatter.match({
  "location": "TravelSiteSteps.user_selects_Trip_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects from \"Sydney\"",
  "keyword": "When "
});
formatter.match({
  "location": "TravelSiteSteps.user_selects_from(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects to \"New York\"",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_selects_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects day \"05\"",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_selects_day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select month \"December 2016\"",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_select_month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "TravelSiteSteps.user_click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
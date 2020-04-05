$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/FlightsSite.feature");
formatter.feature({
  "name": "Flight online service",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Register the user and basic user info",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launch url \"http://newtours.demoaut.com/\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user is on home page",
  "keyword": "When "
});
formatter.step({
  "name": "verify the home logo",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on Register link",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters contact information \"\u003cFN\u003e\",\"\u003cLN\u003e\",\"\u003cPH\u003e\",\"\u003cEMAIL\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user enter address details \"\u003cAddress\u003e\",\"\u003ccity\u003e\",\"\u003ccountry\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters user information \"\u003cUN\u003e\",\"\u003cPSWD\u003e\",\"\u003cCONPSWD\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on Submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the successful registration message",
  "keyword": "And "
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FN",
        "LN",
        "PH",
        "EMAIL",
        "Address",
        "city",
        "country",
        "UN",
        "PSWD",
        "CONPSWD"
      ]
    },
    {
      "cells": [
        "ABHI",
        "THAKUR",
        "999999999",
        "abcd@gmail.com",
        "KP",
        "PUNE",
        "INDIA",
        "absk",
        "pswd@123",
        "pswd@123"
      ]
    },
    {
      "cells": [
        "Pragya",
        "Ratan",
        "999999999",
        "prgy@gmail.com",
        "KP",
        "PUNE",
        "INDIA",
        "absk",
        "pswd@123",
        "pswd@123"
      ]
    },
    {
      "cells": [
        "Pragya",
        "Ratan",
        "999999999",
        "prgy@gmail.com",
        "KP",
        "PUNE",
        "",
        "",
        "",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Register the user and basic user info",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launch url \"http://newtours.demoaut.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FlightSite.user_launch_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "When "
});
formatter.match({
  "location": "FlightSite.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the home logo",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.verify_the_home_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Register link",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.user_click_on_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters contact information \"ABHI\",\"THAKUR\",\"999999999\",\"abcd@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.user_enters(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter address details \"KP\",\"PUNE\",\"INDIA\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.addressdetails(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters user information \"absk\",\"pswd@123\",\"pswd@123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.userInfo(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.user_click_on_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the successful registration message",
  "keyword": "And "
});
formatter.match({
  "location": "FlightSite.verifyRegistration()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "FlightSite.closeall()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register the user and basic user info",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launch url \"http://newtours.demoaut.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FlightSite.user_launch_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "When "
});
formatter.match({
  "location": "FlightSite.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the home logo",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.verify_the_home_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Register link",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.user_click_on_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters contact information \"Pragya\",\"Ratan\",\"999999999\",\"prgy@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.user_enters(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter address details \"KP\",\"PUNE\",\"INDIA\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.addressdetails(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters user information \"absk\",\"pswd@123\",\"pswd@123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.userInfo(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.user_click_on_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the successful registration message",
  "keyword": "And "
});
formatter.match({
  "location": "FlightSite.verifyRegistration()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "FlightSite.closeall()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register the user and basic user info",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launch url \"http://newtours.demoaut.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FlightSite.user_launch_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "When "
});
formatter.match({
  "location": "FlightSite.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the home logo",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.verify_the_home_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Register link",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.user_click_on_Register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters contact information \"Pragya\",\"Ratan\",\"999999999\",\"prgy@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.user_enters(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter address details \"KP\",\"PUNE\",\"\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.addressdetails(String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: \nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-3OHOLAF\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:147)\r\n\tat StepDefinitions.FlightSite.addressdetails(FlightSite.java:77)\r\n\tat ✽.user enter address details \"KP\",\"PUNE\",\"\"(file:src/test/java/Features/FlightsSite.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters user information \"\",\"\",\"\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.userInfo(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSite.user_click_on_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the successful registration message",
  "keyword": "And "
});
formatter.match({
  "location": "FlightSite.verifyRegistration()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "FlightSite.closeall()"
});
formatter.result({
  "status": "skipped"
});
});
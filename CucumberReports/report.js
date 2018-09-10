$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/CreateLead.feature");
formatter.feature({
  "name": "Leaftaps Automation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create Lead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CLusingframework"
    }
  ]
});
formatter.step({
  "name": "Give username as \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Give password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Clk login btn",
  "keyword": "When "
});
formatter.step({
  "name": "Go CRMSFA",
  "keyword": "And "
});
formatter.step({
  "name": "Go Leads",
  "keyword": "And "
});
formatter.step({
  "name": "Clk CreateLead",
  "keyword": "And "
});
formatter.step({
  "name": "Set CompanyName as \u003ccmpny\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Set FirstName as \u003cfname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Set LastName as \u003clname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Clk SubmitBtn",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "cmpny",
        "fname",
        "lname"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa",
        "TCS",
        "Abirami",
        "A"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Lead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CLusingframework"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Give username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.typeUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Give password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.typePassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clk login btn",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go CRMSFA",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage.Crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go Leads",
  "keyword": "And "
});
formatter.match({
  "location": "MyHomePage.ClickLeads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clk CreateLead",
  "keyword": "And "
});
formatter.match({
  "location": "MyLeadPage.createLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set CompanyName as TCS",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLeadPage.CompanyName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set FirstName as Abirami",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLeadPage.FirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set LastName as A",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLeadPage.LastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clk SubmitBtn",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLeadPage.ClickSubmit()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
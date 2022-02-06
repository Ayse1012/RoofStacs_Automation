$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/test.feature");
formatter.feature({
  "name": "Roof Stacks",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Lead Product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@career"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user must go to home page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user goes to \"career\" page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});
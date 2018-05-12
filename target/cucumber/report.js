$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Google Drive/PIIT/IntellijCodes/CucumberDemoqa/src/test/resources/demoqa.feature");
formatter.feature({
  "line": 1,
  "name": "testing cucumber",
  "description": "",
  "id": "testing-cucumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6706418795,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "first test",
  "description": "",
  "id": "testing-cucumber;first-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "i am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i click registeration",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.homepg()"
});
formatter.result({
  "duration": 1117451258,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.register()"
});
formatter.result({
  "duration": 2089382747,
  "status": "passed"
});
formatter.after({
  "duration": 81168212,
  "status": "passed"
});
});
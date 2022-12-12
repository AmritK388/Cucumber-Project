$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feautures/Sky.feature");
formatter.feature({
  "line": 1,
  "name": "Color change to skyblue",
  "description": "",
  "id": "color-change-to-skyblue",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sky Blue Background",
  "description": "",
  "id": "color-change-to-skyblue;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "steps.button_exists(String)"
});
formatter.result({
  "duration": 5070981806,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_click_on_the_button()"
});
formatter.result({
  "duration": 47079362,
  "status": "passed"
});
formatter.match({
  "location": "steps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 26288848,
  "status": "passed"
});
});
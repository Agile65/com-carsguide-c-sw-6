$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("finddealers.feature");
formatter.feature({
  "line": 1,
  "name": "Find the dealers and verify",
  "description": "",
  "id": "find-the-dealers-and-verify",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7653648000,
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
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I mouse hover on \u0027buy+sell\u0027 tab",
  "keyword": "When "
});
formatter.match({
  "location": "BuySteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 747756100,
  "status": "passed"
});
formatter.match({
  "location": "BuySteps.iMouseHoverOnBuySellTab()"
});
formatter.result({
  "duration": 680371200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Find the dealers and verify the dealers are in list",
  "description": "",
  "id": "find-the-dealers-and-verify;find-the-dealers-and-verify-the-dealers-are-in-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click \u0027Find a dealer\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to \u0027car-dealers\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I should see the dealer names are display on page",
  "rows": [
    {
      "cells": [
        "dealersName"
      ],
      "line": 12
    },
    {
      "cells": [
        "3 Point Motors Epping"
      ],
      "line": 13
    },
    {
      "cells": [
        "Cairns Car \u0026 4WD Centre"
      ],
      "line": 14
    },
    {
      "comments": [
        {
          "line": 15,
          "value": "#    | 4WD Specialist Group    | doesn\u0027t exist SO REPLACED with above one"
        }
      ],
      "cells": [
        "5 Star Auto"
      ],
      "line": 16
    },
    {
      "cells": [
        "A \u0026 M Car Sales Pty Ltd"
      ],
      "line": 17
    },
    {
      "cells": [
        "A1 Motors Company New Town"
      ],
      "line": 18
    },
    {
      "cells": [
        "Coral Coast Ford"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FindDealersStep.iClickFindADealer()"
});
formatter.result({
  "duration": 2026923300,
  "status": "passed"
});
formatter.match({
  "location": "FindDealersStep.iNavigateToCarDealersPage()"
});
formatter.result({
  "duration": 30220200,
  "status": "passed"
});
formatter.match({
  "location": "FindDealersStep.iShouldSeeTheDealerNamesAreDisplayOnPage(DataTable)"
});

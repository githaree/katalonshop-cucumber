$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Cart.feature");
formatter.feature({
  "name": "Add \u0026 Update Cart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Cart"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify the customer is able to add products to cart and remove one or more added products from cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@updatecart"
    }
  ]
});
formatter.step({
  "name": "I add four random items to my cart",
  "keyword": "Given "
});
formatter.step({
  "name": "I view my cart",
  "keyword": "When "
});
formatter.step({
  "name": "I find total four items listed in my cart",
  "keyword": "Then "
});
formatter.step({
  "name": "I am able to remove the lowest price item from my cart",
  "keyword": "And "
});
formatter.step({
  "name": "I am able to verify three items in my cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "test_id",
        "num_prod_tobe_added",
        "num_prod_tobe_removed"
      ]
    },
    {
      "cells": [
        "001",
        "4",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the customer is able to add products to cart and remove one or more added products from cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Cart"
    },
    {
      "name": "@updatecart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I add four random items to my cart",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoApplicationSteps.i_add_random_items_to_my_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I view my cart",
  "keyword": "When "
});
formatter.match({
  "location": "DemoApplicationSteps.i_view_my_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I find total four items listed in my cart",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoApplicationSteps.i_find_four_items_in_my_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am able to remove the lowest price item from my cart",
  "keyword": "And "
});
formatter.match({
  "location": "DemoApplicationSteps.i_remove_lowest_priced_product_from_my_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am able to verify three items in my cart",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoApplicationSteps.i_find_three_items_in_my_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
package com.test.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.test.cucumber",
		plugin = {
				"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"junit:target/cucumber-reports/CucumberTestReport.xml"
		},
		tags = "@updatecart"
		)

public class TestRunner {
}

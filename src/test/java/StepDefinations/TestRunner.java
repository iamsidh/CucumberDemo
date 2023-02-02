package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;


//plugin = {"pretty","json:target/JSONReports/report.json"}
//plugin = { "pretty","html:target/HTMLReports/report.html" }

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = { "StepDefinations" }, monochrome = true, 
plugin = { "pretty","html:target/XMLReports/report.xml","json:target/JSONReports/report.json","html:target/HTMLReports/report.html" },tags="@SmokeTest")

public class TestRunner {
	

}

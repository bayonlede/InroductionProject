package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features", glue="stepDefinitions", stepNotifications =true, 
plugin= {"pretty", "html:target/classWorkReport.html", "json:target/classWorkReport.json"})
public class testRunner {

}

package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = {"Features"},
 glue={"stepDefinition"},
 plugin= {"pretty","html:Report1.html"}

 )
public class TestRunner {

}

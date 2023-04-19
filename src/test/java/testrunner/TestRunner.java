package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="features/", glue= {"gluecode"}, tags= "@smoke", publish=true, monochrome=true, dryRun=false)
public class TestRunner {

}

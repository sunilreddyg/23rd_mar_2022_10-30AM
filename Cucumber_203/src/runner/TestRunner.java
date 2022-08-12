package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources\\datatable.feature",glue="",dryRun=false,monochrome=true)
public class TestRunner 
{
	
}

package TestRunner_AI;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Selenium_cucumber\\AI_Stock_Predication\\src\\test\\resources\\AI_Stock_feature_files",
					glue = "Step_definations_AI_Stock",
					monochrome = true,
					plugin = {"pretty","html:test-output"})
public class AI_Stock_Runner
{
	
}

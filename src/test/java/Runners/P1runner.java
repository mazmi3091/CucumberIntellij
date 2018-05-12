package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\Google Drive\\PIIT\\IntellijCodes\\CucumberDemoqa\\src\\test\\resources\\demoqa.feature",
        glue = {"Steps"}, format = {"pretty", "html:target/cucumber"}, tags = "@p1")
public class P1runner {
}

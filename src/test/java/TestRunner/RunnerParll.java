package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)

@CucumberOptions(
        features ="C:/Users/vmuddebi/IdeaProjects/CCUCUPOMFrame/Features/Login.feature",
        glue = {"StepDefinations"},
        plugin = {"pretty","html:target/cucumber-reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@fuct",
        publish = true
       )

public class RunnerParll extends AbstractTestNGCucumberParallelTest {

}

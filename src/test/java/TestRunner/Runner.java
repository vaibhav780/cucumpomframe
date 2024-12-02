package TestRunner;


import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)

@CucumberOptions(
        features ="C:/Users/vmuddebi/IdeaProjects/CCUCUPOMFrame/Features/Login.feature",
        glue = {"StepDefinations"},
        plugin = {"pretty","html:target/cucumber-reports/reports.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@all",
        publish = true
       )

public class Runner {
}

package StepDefinations;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.Base;
import org.example.ComLogger;
import org.example.MyScreenRecorder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AppHooks extends Base {

    private Base base;
    private WebDriver driver;


    @Before
    public void setup(Scenario scenario) {
        base = new Base();
        driver = base.init_driver();
        try {
            MyScreenRecorder .startRecording(scenario.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ComLogger.info("+++++++++++++++++++++++++SCENARIO STARTED+++++++++++++++++++++++++");
        ComLogger.info("+++++++++++++++++++++++++" + scenario.getName() + "+++++++++++++++++++++++++");
        ComLogger.info("Driver initied");
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName =scenario.getName().replaceAll("", "_");
            byte[] sourcepath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcepath, "image/png", screenshotName);
        }
        driver.quit();
        ComLogger.info("Driver Closed");
        ComLogger.info("+++++++++++++++++++++++++SCENARIO END+++++++++++++++++++++++++");
        try {
            MyScreenRecorder.stopRecording();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

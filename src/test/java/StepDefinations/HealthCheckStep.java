package StepDefinations;

import Pages.Health_check;
import io.cucumber.java.en.Then;
import org.example.Base;

public class HealthCheckStep {

    private Health_check healthCheck = new Health_check(Base.getDriver());



    @Then("user click on Health check")
    public void user_click_on_health_check() {
       healthCheck.Click_health_check();
    }

    @Then("user click on Deployment HealthCheck")
    public void userClickOnDeploymentHealthCheck() {
        healthCheck.Click_deply_helthCheck();
    }
}

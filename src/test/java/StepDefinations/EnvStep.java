package StepDefinations;

import Pages.Enviroment;
import io.cucumber.java.en.Then;
import javafx.scene.layout.BackgroundSize;
import org.example.Base;

public class EnvStep {
    private Enviroment env= new Enviroment(Base.getDriver());
    @Then("user click on Enviroment")
    public void userClickOnEnviroment() {
        env.ClickEnviroment();
    }

    @Then("user click on New Env")
    public void userClickOnNewEnv() {
        env.ClickNewEnv();
    }

    @Then("user enter Env name")
    public void userEnterEnvName() {
        env.EnterEnvData();
    }
}

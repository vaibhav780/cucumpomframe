package StepDefinations;

import Pages.Sub_var;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Base;

public class SubvarStep {
    private Sub_var subVar = new Sub_var(Base.getDriver());
    @Then("user click on Add")
    public void userClickOnAdd() {
        subVar.add_sbvar();
    }

    @And("user enter value")
    public void userEnterValue() {
        subVar.enter_sbvvalue();
    }

    @And("user enter data type")
    public void userEnterDataType() {
        subVar.selectDatatype();
    }

    @And("user enter name")
    public void userEnterName() {
        subVar.enter_name();
    }

    @Then("user save data")
    public void userSaveData() {
        subVar.save();
        subVar.verify_action();
    }
}

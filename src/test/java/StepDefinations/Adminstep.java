package StepDefinations;

import Pages.Dashboard;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Base;
import org.junit.Assert;

public class Adminstep {
    private Dashboard dashboard = new Dashboard(Base.getDriver());
    @When("user click on About link")
    public void userClickOnAboutLink() {
        dashboard.click_about();
    }

    @Then("user verify Admin version")
    public void userVerifyAdminVersion() {
        Assert.assertTrue("Admin Version Not matched",dashboard.retrive_version());


    }

    @Then("user click on shared objects")
    public void userClickOnSharedObjects() {
        dashboard.click_shared_obj();
    }

    @Then("user click on Substitution variables")
    public void userClickOnSubstitutionVariables() {
        dashboard.click_sub_var();
    }
}

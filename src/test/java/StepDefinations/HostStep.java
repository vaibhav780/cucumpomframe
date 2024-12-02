package StepDefinations;

import Pages.Host;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Base;

public class HostStep {
    private Host host = new Host(Base.getDriver());

    @Then("user click on infrastructure")
    public void userClickOnInfrastructure() {
        host.click_infra();
    }

    @Then("user click on Host")
    public void userClickOnHost() {
        host.click_host();

    }

    @And("user click on New")
    public void userClickOnNew() {
     //   host.changemc();
        host.New_host();
    }

    @And("user enter host name")
    public void userEnterHostName() {
        host.enterHostname();
    }

    @And("user enter Management URL")
    public void userEnterManagementURL() {
        host.enterMgmturl();
    }

    @Then("user save host")
    public void userSaveHost() {
        host.saveHost();
    }

    @And("user install Host")
    public void userInstallHost() {
        host.installHost();
    }

    @And("user Start Host")
    public void userStartHost() {
        host.startHost();
    }


}

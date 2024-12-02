package StepDefinations;

import Pages.Login;
import io.cucumber.java.en.*;
import org.example.Base;
import org.example.ComLogger;
import org.example.Elementutil;
import org.junit.Assert;

public class LoginStep {
    private Elementutil util = new Elementutil(Base.getDriver());
    private Login login = new Login(Base.getDriver());
    @Given("user launch Browser")
    public void user_launch_browser() {
        util.takeSS();
        ComLogger.info("Web Browser launched");
    }

    @When("AMX homepage displayed")
    public void amx_homepage_displayed() {
        Assert.assertEquals("TIBCO ActiveMatrix® Administrator Login",login.gettitle());
        ComLogger.info("Page Title Verified");
    }

    @Then("Logo Present on HomePage")
    public void logo_present_on_home_page() {
            Assert.assertTrue(login.VerifyLogo());
        ComLogger.info("Loginpage Logo Verified");
    }

    @When("user enters username")
    public void user_enters_username() {
            login.enter_username();

    }

    @When("user enters password")
    public void user_enters_password() {
            login.enter_password();
        ComLogger.info("Password entered");
    }

    @Then("user click on Login")
    public void user_click_on_login() {
            login.click_login();
        ComLogger.info("login Button Clicked");
    }
    @When("user Login to application")
    public void user_login_to_application() {
            login.do_login();

    }


}

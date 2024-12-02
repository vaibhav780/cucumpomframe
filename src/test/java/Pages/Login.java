package Pages;

import org.example.Base;
import org.example.ComLogger;
import org.example.Elementutil;
import org.example.Propreader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;
    private Elementutil util = new Elementutil(Base.getDriver());
    private Propreader propreader = new Propreader();
//
//    private By logo = By.tagName("img");
//    private By username=By.id("j_username");
//    private By password =By.name("j_password");
//    private By loginbtn=By.id("loginBtn");
    private By logo = By.xpath(propreader.getValue("logo"));
    private By username=By.xpath(propreader.getValue("username"));
    private By password =By.xpath(propreader.getValue("password"));
    private By loginbtn=By.xpath(propreader.getValue("loginbtn"));
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public String gettitle(){
        ComLogger.info("Verified title");
        return util.getTtile();

    }
    public boolean VerifyLogo(){
        ComLogger.info("Verified Logo");
        return util.isDisplayed(logo);

    }
    public void enter_username(){
            util.enter_text(username,"root");
            ComLogger.info("Username Entered");
    };
    public void enter_password(){
            util.enter_text(password,"t");
        ComLogger.info("Username Entered");
    };
    public void click_login(){
        util.Click(loginbtn);
        ComLogger.info("Clicked on Login");
    };
    public void do_login(){
        enter_username();
        enter_password();
        click_login();
        util.pause(3000);
    }

}

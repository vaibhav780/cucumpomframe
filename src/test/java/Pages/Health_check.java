package Pages;

import org.example.Base;
import org.example.Elementutil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.rmi.CORBA.Util;

public class Health_check {
    private WebDriver driver;
    private Elementutil util = new Elementutil(Base.getDriver());

    private By hl_ch_menu= By.xpath("//*[@jsxid='tibco.admin.sl.app']");
    private By Entp_Deploy_Hl_C_link =By.xpath("//*[@id=\"container\"]/ul/li[2]");
    private By PingTab = By.xpath("//*[@href=\"#doPing\"]");
    private By EnterPingbtn= By.xpath("//*[@id=\"doPing\"]/button");
    public Health_check(WebDriver driver) {
        this.driver = driver;
    }

    public void Click_health_check(){
        util.Click(hl_ch_menu);
    }

    public void Click_deply_helthCheck(){
          util.SwitchIframe("healthcheckContainer");
          util.Click(Entp_Deploy_Hl_C_link);

          util.ClickWithText("Close");
         util.pause(3000);
         util.Click(EnterPingbtn);
    }
}
